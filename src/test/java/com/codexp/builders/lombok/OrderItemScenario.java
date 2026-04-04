package com.codexp.builders.lombok;

public class OrderItemScenario {
    public static OrderItem createMouse(int nbItem, double price){
        return OrderItem.builder().productId("PROD-1").name("Laptop").quantity(nbItem).price(price).build();
    }

    public static OrderItem createLaptop(int nbItem, double price){
        return OrderItem.builder().productId("PROD-2").name("Mouse").quantity(nbItem).price(price).build();
    }
}
