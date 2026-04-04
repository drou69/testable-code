package com.codexp.fragility.idempotency.order;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UrgencyManagerTest {

    //JVM Dependant: might pass (or not) when executed in another environment
    @Test
    void should_be_able_to_retrieve_error_levels() {
        UrgencyManager manager = new UrgencyManager();
        assertEquals(List.of("alpha", "urgent", "high-priority"),
                new ArrayList<>(manager.getLevels()));
    }
}
