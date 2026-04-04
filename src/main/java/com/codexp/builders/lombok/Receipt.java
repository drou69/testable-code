package com.codexp.builders.lombok;

public class Receipt {

    private final double total;

    public Receipt(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }
}
