package com.drou.building_dsl;

public class OrderItem {
    private final String productId;
    private final String name;
    private final int quantity;
    private final double price;

    public OrderItem(String productId, String name, int quantity, double price) {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public double subtotal() {
        return quantity * price;
    }
}
