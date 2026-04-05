package com.codexp.sociable;

import com.codexp.sociable.adapter.PaymentGateway;
import com.codexp.sociable.adapter.PaymentResult;
import com.codexp.sociable.domain.Order;
import com.codexp.sociable.repository.OrderRepository;
import com.codexp.sociable.service.OrderService;
import com.codexp.sociable.service.DiscountService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class OrderServiceTest {

    @Test
    void checkout_successful_payment_marks_order_paid_and_persists_it() {
        OrderRepository repository = new OrderRepository();
        DiscountService pricingService = new DiscountService();
        //Mock unmanaged remote dependencies
        PaymentGateway paymentGateway = mock(PaymentGateway.class);
        OrderService service = new OrderService(repository, paymentGateway, pricingService);

        Order order = new Order();
        order.addItem("Book", 20.0);
        order.addItem("Pen", 5.0);

        when(paymentGateway.charge("cust-123", 25.0))
                .thenReturn(new PaymentResult(true));

        // Act
        String orderId = service.checkout(order, "cust-123");

        // Assert (behavior + state across multiple classes)
        assertTrue(order.isPaid());

        Order saved = repository.findById(orderId);
        assertNotNull(saved);
        assertTrue(saved.isPaid());

        verify(paymentGateway).charge("cust-123", 25.0);
    }

    @Test
    void order_should_not_be_in_status_paid_when_payment_failed() {
        OrderRepository repository = new OrderRepository();
        DiscountService pricingService = new DiscountService();
        //Mock unmanaged remote dependencies
        PaymentGateway paymentGateway = mock(PaymentGateway.class);
        OrderService service = new OrderService(repository, paymentGateway, pricingService);

        Order order = new Order();
        order.addItem("Laptop", 1000.0);

        when(paymentGateway.charge("cust-123", 900.0))
                .thenReturn(new PaymentResult(false));

        // Act + Assert
        assertThrows(RuntimeException.class,
                () -> service.checkout(order, "cust-123"));

        assertFalse(order.isPaid());
    }

    // What are we really testing when we are 100% isolated like that?
    // If we stop mocking what we own, what do we get?
    // How does mocking affects test fragility?
    // Would this problem with promotions be a thing with another Test Double strategy?
    @Test
    void BAD_test_that_becomes_meaningless_if_we_mock_DiscountService() {
        OrderRepository repository = new OrderRepository();
        DiscountService discountService = mock(DiscountService.class);
        PaymentGateway paymentGateway = mock(PaymentGateway.class);

        OrderService service =
                new OrderService(repository, paymentGateway, discountService);

        Order order = new Order();
        order.addItem("Laptop", 120.0);

        when(discountService.applyAvailableDiscount(order)).thenReturn(50.0);

        when(paymentGateway.charge("cust-123", 50.0))
                .thenReturn(new PaymentResult(true));

        service.checkout(order, "cust-123");

        verify(paymentGateway).charge("cust-123", 50.0);
    }
}