package com.codexp.builders.lombok;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {
    private final String id;
    private final String name;
    private Address address;
    private final boolean vip;

    public Customer(String id, String name, Address address, boolean vip) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.vip = vip;
    }
}
