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
    public OrderItemBuilder laptop() {
        productId = "PROD-1";
        this.name = "Laptop";
        this.price = 1000.0;
        return this;
    }

    public OrderItemBuilder mouse() {
        this.productId = "PROD-2";
        this.name = "Mouse";
        this.price = 25.0;
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
