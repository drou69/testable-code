package com.drou.antipatterns;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PaymentManagerTest {

    @Test
    void should_be_able_to_execute() {
        PaymentManager service = new PaymentManager();
        assertThat(service.charge("Order3"), equalTo("Processed: Order3"));
    }
}
