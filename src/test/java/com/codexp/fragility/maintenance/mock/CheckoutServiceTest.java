package com.codexp.fragility.maintenance.mock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class CheckoutServiceTest {
    @Test
    void should_be_able_to_process_payment_of_more_than_1000_dollars() {
        double cartTotal = 1500.00;
        PaymentGateway gateway = mock(PaymentGateway.class);

        when(gateway.process(cartTotal)).thenReturn(true);

        CheckoutService service = new CheckoutService(gateway);
        service.checkout(cartTotal);

        verify(gateway, times(1)).process(cartTotal);
    }
}
