package com.codexp.hardtotest.exercice3;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MeatManagerTest {

    @Test
    void should_initialize_cache() {
        MeatManager service = new MeatManager();
        assertThat(service.getMeatType("beef"), equalTo("Processed: beef"));
    }
}
