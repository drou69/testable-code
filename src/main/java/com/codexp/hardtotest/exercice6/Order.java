package com.codexp.hardtotest.exercice6;

public class Order {
    private Item item;

    public Order(Item item){
        this.item = item;
    }

    PaymentService getPayment() { return new PaymentService("4520384758675847"); }

    public Item getItem() {
        return item;
    }
}
