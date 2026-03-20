package com.drou.building_dsl;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class CheckoutServiceTest {

    private PaymentGateway paymentGateway;
    private ShippingService shippingService;
    private TaxService taxService;

    @Test
    void should_calculate_total_and_charge_customer() {
        Customer customer = CustomerBuilder.createCustomer().normalCustomer().build();
        Address address = AddressBuilder.createAddress().fromQuebec().build();

        OrderItem laptop = OrderItemBuilder.createOrderItem().laptop().build();
        OrderItem mouse = OrderItemBuilder.createOrderItem().mouse().build();

        Order order = OrderBuilder.createOrder()
                .with(customer).with(laptop).with(mouse).with(mouse).shippingTo(address).build();

        CheckoutService service = createService(order.getItems(), address);

        // ACT

        Receipt receipt = service.checkout(order);

        // ASSERT

        assertEquals(1165.0, receipt.getTotal());

        verify(paymentGateway)
                .charge(order.getPaymentDetails(), 1165.0);
    }

    //think about doing given() like the chatGPT conversation
    //introduce scenario class

    private CheckoutService createService(List<OrderItem> items, Address address){
        paymentGateway = mock(PaymentGateway.class);
        shippingService = mock(ShippingService.class);
        taxService = mock(TaxService.class);

        when(shippingService.calculateShipping(items, address))
                .thenReturn(10.0);

        when(taxService.calculateTax(1050.0, "Canada"))
                .thenReturn(105.0);

        return new CheckoutService(paymentGateway, shippingService, taxService);
    }
}