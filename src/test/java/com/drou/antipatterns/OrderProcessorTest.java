package com.drou.antipatterns;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class OrderProcessorTest {
    @Test
    void should_be_able_to_execute() {
        OrderProcessor processor = new OrderProcessor();
        assertThat(processor.process("Order1"), equalTo("Processed: Order1")); // dummy expected
    }
}
