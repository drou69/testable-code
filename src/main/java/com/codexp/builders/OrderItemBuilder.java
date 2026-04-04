package com.codexp.builders;

public class OrderItemBuilder {
    private String productId = "DEFAULT";
    private String name = "Item";
    private int quantity = 1;
    private double price = 10.0;

    private OrderItemBuilder(){}

    public static OrderItemBuilder createOrderItem(){
        return new OrderItemBuilder();
    }

    public OrderItemBuilder id(String id) {
        productId = id;
        return this;
    }

    public OrderItemBuilder name(String name) {
        this.name = name;
        return this;
    }

    public OrderItemBuilder name(double price) {
        this.price = price;
        return this;
    }

    public OrderItemBuilder quantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public OrderItem build() {
        return new OrderItem(productId, name, quantity, price);
    }
}
