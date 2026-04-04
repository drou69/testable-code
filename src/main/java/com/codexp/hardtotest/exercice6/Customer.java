package com.codexp.hardtotest.exercice6;

public class Customer {
    private String name;

    public Customer(String name){
        this.name = name;
    }

    public Order getOrder() { return new Order(new Item("Doritos", 4.99)); }
}
