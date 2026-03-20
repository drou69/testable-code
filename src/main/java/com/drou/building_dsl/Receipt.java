package com.drou.building_dsl;

public class Receipt {

    private final double total;

    public Receipt(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }
}
