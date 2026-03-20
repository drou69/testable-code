package com.drou.building_dsl;

public class Address {
    private final String street;
    private final String city;
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

    public String getCountry() {
        return country;
    }
}
