package com.codexp.doubles.stub;

public class Customer {
    private final String id;
    private final boolean premium;

    public Customer(String id, boolean premium) {
        this.id = id;
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }
}
