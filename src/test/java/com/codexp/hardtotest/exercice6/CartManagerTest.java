package com.codexp.hardtotest.exercice6;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CartManagerTest {

    @Test
    void should_be_able_to_process_transaction() {
        CartManager order = new CartManager();
        assertThat(order.process(new Customer("Bob")), equalTo("Processed: 4.99"));
    }
}
