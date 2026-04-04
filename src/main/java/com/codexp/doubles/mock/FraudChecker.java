package com.codexp.doubles.mock;

public class FraudChecker {
    private final AuditService audit;

    public FraudChecker(AuditService audit) {
        this.audit = audit;
    }

    public void check(Order order) {
        if (order.getTotal() > 1000) {
            audit.log("Suspicious activity");
        }
    }
}
