package com.codexp.fragility.idempotency.order;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UrgencyManager {
    public Set<String> getLevels() {
        return new HashSet<>(Arrays.asList("urgent", "alpha", "high-priority"));
    }
}
