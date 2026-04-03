package com.codexp.hardtotest;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MeatManagerTest {

    @Test
    void should_be_able_to_execute() {
        MeatManager service = new MeatManager();
        assertThat(service.getMeatType(), equalTo("Processed: Meat"));
    }
}
