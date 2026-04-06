package com.codexp.builders.lombok;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.*;

class CheckoutServiceTest {
    private PaymentGateway paymentGateway;
    private ShippingService shippingService;
    private TaxService taxService;

    @Test
    void should_calculate_total_and_charge_customer_appropriately_when_ordering_from_quebec() {
        // ARRANGE
        OrderItem mouse = OrderItemScenario.createMouse(2, 25);
        OrderItem laptops = OrderItemScenario.createLaptop(1, 1000);
        Order order = new OrderScenarios().fromQuebec().forItems(mouse, laptops).assemble();

        mockExternalDependancies(10.0, 105.0, order.getShippingAddress());
        CheckoutService service = new CheckoutService(paymentGateway, shippingService, taxService);

        // ACT
        Receipt receipt = service.checkout(order);

        // ASSERT
        assertThat(receipt.getTotal(), is(1165.0));

        verify(paymentGateway).charge(order.getPaymentDetails(), 1165.0);
    }

    private void mockExternalDependancies(double shippingCost, double taxes, Address address){
        paymentGateway = mock(PaymentGateway.class);
        shippingService = mock(ShippingService.class);
        taxService = mock(TaxService.class);

        when(shippingService.calculateShipping(anyList(), eq(address)))
                .thenReturn(shippingCost);

        when(taxService.calculateTax(anyDouble(), eq(address.getProvince())))
                .thenReturn(taxes);
    }

    @Test
    void should_calculate_total_and_charge_customer_appropriately_when_ordering_from_ontario() {
        // ARRANGE
        OrderItem mouse = OrderItemScenario.createMouse(2, 25);
        OrderItem laptops = OrderItemScenario.createLaptop(1, 1000);
        Order order = new OrderScenarios().fromOntario().forItems(mouse, laptops).assemble();

        mockExternalDependancies(8.0, 125.0, order.getShippingAddress());
        CheckoutService service = new CheckoutService(paymentGateway, shippingService, taxService);

        // ACT
        Receipt receipt = service.checkout(order);

        // ASSERT
        assertThat(receipt.getTotal(), is(1183.0));
        verify(paymentGateway).charge(order.getPaymentDetails(), 1183.0);
    }
}