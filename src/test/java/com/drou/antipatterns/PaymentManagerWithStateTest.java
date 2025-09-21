package com.drou.antipatterns;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PaymentManagerWithStateTest {

    @Test
    void should_be_able_to_execute() {
        PaymentManagerWithState service = new PaymentManagerWithState();
        assertThat(service.pay(2), equalTo(2));
        assertThat(service.pay(4), equalTo(2));
    }

    @Test
    void should_be_able_to_execute_again_from_fresh_object() {
        PaymentManagerWithState service = new PaymentManagerWithState();
        assertThat(service.pay(10), equalTo(10));
    }
}
