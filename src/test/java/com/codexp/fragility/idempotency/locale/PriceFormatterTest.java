package com.codexp.fragility.idempotency.locale;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PriceFormatterTest {
    //If the locale is not set explicitly, could give different results on different system
    @Test
    void should_be_able_to_format_price() {
        PriceFormatter formatter = new PriceFormatter();
        // Fails on a machine set to a European locale where it outputs "10,50"
        assertEquals("10.50", formatter.format(10.5));
    }
}
