package com.codexp.fragility.idempotency.globalstate;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PaymentManagerTest {

    @Test
    @Disabled("To have the tests running for the other exercises")
    void should_be_able_to_execute() {
        PaymentManager service = new PaymentManager();
        assertThat(service.pay(2), equalTo(2));
    }

    @Test
    void should_be_able_to_execute_again_from_fresh_object() {
        PaymentManager service = new PaymentManager();
        assertThat(service.pay(10), equalTo(10));
    }
}
