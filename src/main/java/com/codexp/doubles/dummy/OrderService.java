package com.codexp.doubles.dummy;

public class OrderService {
    private final AuditService audit;

    public OrderService(AuditService audit) {
        this.audit = audit;
    }

    public double calculateTotal(Order order) {
        double total = order.getItems().stream()
                .mapToDouble(Item::getPrice)
                .sum();

        audit.log("Calculated total: " + total);

        return total;
    }
}
