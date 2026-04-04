package com.codexp.doubles.spy;

public class Order {
    private final String customerEmail;

    public Order(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    
    public String getCustomerEmail() {
        return customerEmail;
    }
}
