package com.codexp.fragility.idempotency.order;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UrgencyManagerTest {

    //JVM Dependant: might pass (or not) when executed in another environment
    @Test
    void testGetTagsOrder() {
        UrgencyManager manager = new UrgencyManager();
        assertEquals(List.of("alpha", "urgent", "high-priority"),
                new ArrayList<>(manager.getLevels()));
    }
}
