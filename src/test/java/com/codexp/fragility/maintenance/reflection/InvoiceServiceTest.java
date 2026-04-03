package com.codexp.fragility.maintenance.reflection;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InvoiceServiceTest {
    @Test
    public void shouldCalculateSubtotalUsingReflection() throws Exception {
        InvoiceService service = new InvoiceService();

        Method method = InvoiceService.class
                .getDeclaredMethod("calculateSubtotal", List.class);
        method.setAccessible(true);

        double result = (double) method.invoke(service, List.of(10.0, 20.0));

        assertEquals(30.0, result);
    }
}
