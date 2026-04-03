package com.codexp.builders;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class CheckoutServiceTest {

    @Test
    void should_calculate_total_and_charge_customer() {
        Customer customer =
                new Customer("CUST-123", "Alice Smith", false);

        Address address =
                new Address(
                        "1550 St-Laurent",
                        "Montreal",
                        "Quebec",
                        "Canada",
                        "H3C3P3"
                );

        PaymentDetails payment =
                new PaymentDetails(
                        "4111111111111111",
                        "Alice Smith",
                        "12/28"
                );

        OrderItem item1 =
                new OrderItem(
                        "PROD-1",
                        "Laptop",
                        1,
                        1000.0
                );

        OrderItem item2 =
                new OrderItem(
                        "PROD-2",
                        "Mouse",
                        2,
                        25.0
                );

        List<OrderItem> items = List.of(item1, item2);

        Order order =
                new Order(
                        customer,
                        items,
                        address,
                        payment
                );

        PaymentGateway paymentGateway = mock(PaymentGateway.class);
        ShippingService shippingService = mock(ShippingService.class);
        TaxService taxService = mock(TaxService.class);

        when(shippingService.calculateShipping(items, address))
                .thenReturn(10.0);

        when(taxService.calculateTax(1050.0, "Canada"))
                .thenReturn(105.0);

        CheckoutService service =
                new CheckoutService(
                        paymentGateway,
                        shippingService,
                        taxService
                );

        // ACT

        Receipt receipt = service.checkout(order);

        // ASSERT

        assertEquals(1165.0, receipt.getTotal());

        verify(paymentGateway)
                .charge(payment, 1165.0);
    }
}