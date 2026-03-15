package com.drou.hard_to_test;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CustomerOrderTest {

    @Test
    void should_be_able_to_execute() {
        CustomerOrder service = new CustomerOrder();
        assertThat(service.process(new CustomerOrder.Customer()), equalTo("Processed: customer"));
    }
}
