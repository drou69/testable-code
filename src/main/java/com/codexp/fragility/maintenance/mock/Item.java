package com.codexp.fragility.maintenance.mock;

public class Item {
    private final double price;
    private final int id;

    public Item(int id, double price) {
        this.price = price;
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public double getPrice() {
        return price;
    }
}