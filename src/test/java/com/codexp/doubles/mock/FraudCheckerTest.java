package com.codexp.doubles.mock;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class FraudCheckerTest {

    @Test
    void should_log_suspicious_activity() {
        AuditService audit = mock(AuditService.class);
        FraudChecker checker = new FraudChecker(audit);

        Order suspiciousOrder = new Order(1500);
        checker.check(suspiciousOrder);

        verify(audit).log("Suspicious activity");
    }

    @Test
    void should_not_log_normal_orders() {
        AuditService audit = mock(AuditService.class);
        FraudChecker checker = new FraudChecker(audit);

        Order normalOrder = new Order(500);
        checker.check(normalOrder);

        verify(audit, never()).log(anyString());
    }
}
