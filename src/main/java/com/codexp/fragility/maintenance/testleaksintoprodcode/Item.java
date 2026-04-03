package com.codexp.fragility.maintenance.testleaksintoprodcode;

public class Item {
    private final double price;
    private final double promotion;

    public Item(double price, double promotion) {
        this.price = price;
        this.promotion = promotion;
    }

    public double getPrice() {
        return price;
    }

    public double getPromotion() {
        return promotion;
    }
}
