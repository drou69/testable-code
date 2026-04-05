package com.codexp.sociable.service;

import com.codexp.sociable.domain.Order;

public class DiscountService {
    public double applyAvailableDiscount(Order order) {
        double total = order.total();

        // Business rule: 10% discount if over 100
        if (total > 100) {
            return total * 0.9;
        }

        return total;
    }
}
