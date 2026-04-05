package com.codexp.sociable.service;

import com.codexp.sociable.domain.Order;

public class DiscountService {

    public static final String FLASH_SALE = "FLASH_SALE";
    public static final int OVER_100 = 100;
    public static final double NINETY_PERCENT = 0.9;
    public static final double FIFTY_PERCENT = 0.5;

    public double applyAvailableDiscount(Order order) {
        double total = order.total();

        if (order.hasPromoCode()) {
            if (order.getPromoCode().getType().equals(FLASH_SALE)) {
                return total * FIFTY_PERCENT;
            }
        }

        // Business rule: 10% discount if over 100
        if (total > OVER_100) {
            return total * NINETY_PERCENT;
        }

        return total;
    }
}
