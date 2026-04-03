package com.codexp.fragility.maintenance.mock;

public class PriceCalculator {

    public double calculate(Order order) {
        return order.getItems().stream()
                .mapToDouble(item -> {
                    if (item.getPrice() < 0) throw new IllegalArgumentException();
                    return item.getPrice();
                })
                .sum();
    }
}
