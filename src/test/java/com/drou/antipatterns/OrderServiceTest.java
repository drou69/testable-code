package com.drou.antipatterns;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class OrderServiceTest {

    @Test
    void should_be_able_to_execute() {
        OrderService service = new OrderService();
        assertThat(service.charge(2), equalTo("Processed: Charging 2.0"));
    }
}
