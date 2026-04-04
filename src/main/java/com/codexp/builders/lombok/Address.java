package com.codexp.builders.lombok;

import lombok.Builder;
import lombok.Getter;

@Builder
public class Address {
    private final String street;
    private final String city;
    @Getter
    private final String province;
    private final String country;
    private final String postalCode;

    public Address(String street, String city, String province, String country, String postalCode) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.province = province;
        this.postalCode = postalCode;
    }
}
