package com.drou.building_dsl;

public class Customer {
    private final String id;
    private final String name;
    private final boolean vip;

    public Customer(String id, String name, boolean vip) {
        this.id = id;
        this.name = name;
        this.vip = vip;
    }

    public String getName(){
        return name;
    }

    public boolean isVip() {
        return vip;
    }
}
