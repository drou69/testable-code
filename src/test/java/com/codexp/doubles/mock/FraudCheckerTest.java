package com.codexp.doubles.mock;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class FraudCheckerTest {

    @Test
    void shouldLogHighValueOrders() {
        AuditService audit = mock(AuditService.class);
        FraudChecker checker = new FraudChecker(audit);

        Order highValueOrder = new Order(1500);
        checker.check(highValueOrder);

        verify(audit).log("High value order");
    }

    @Test
    void shouldNotLogNormalOrders() {
        AuditService audit = mock(AuditService.class);
        FraudChecker checker = new FraudChecker(audit);

        Order normalOrder = new Order(500);
        checker.check(normalOrder);

        verify(audit, never()).log(anyString());
    }
}
