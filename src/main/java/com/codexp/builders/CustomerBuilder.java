package com.codexp.builders;

public class CustomerBuilder {
    private String id;
    private String name;
    private boolean vip;

    private CustomerBuilder(){
    }

    public static CustomerBuilder createCustomer(){
        return new CustomerBuilder();
    }

    public CustomerBuilder withId(String id){
        this.id = id;
        return this;
    }

    public CustomerBuilder withName(String name){
        this.name = name;
        return this;
    }

    public CustomerBuilder asVIP(){
        this.vip = true;
        return this;
    }

    public CustomerBuilder asNormalGuest(){
        this.vip = false;
        return this;
    }

    public Customer build(){
        return new Customer(id, name, vip);
    }
}
