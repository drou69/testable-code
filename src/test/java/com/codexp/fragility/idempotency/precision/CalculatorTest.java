package com.codexp.fragility.idempotency.precision;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    //Can behave differently depending on compiler optimisation
    @Test
    @Disabled("To have the tests running for the other exercises")
    void testAddition() {
        Calculator calc = new Calculator();
        double result = calc.add(0.1, 0.2);
        // Might be 0.30000000000000004, causing an exact match failure
        assertEquals(0.3, result);
    }
}
