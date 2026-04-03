package com.codexp.builders;

public class AddressBuilder {
    private String street;
    private String city;
    private String country;
    private String province;
    private String postalCode;

    private AddressBuilder(){
    }

    public static AddressBuilder createAddress(){
        return new AddressBuilder();
    }

    public AddressBuilder fromQuebec(){
        return this.street("St-Laurent").city("Montreal").province("Quebec").country("Canada").postalCode("H3C3P4");
    }

    public AddressBuilder street(String street){
        this.street = street;
        return this;
    }

    public AddressBuilder city(String city){
        this.city = city;
        return this;
    }

    public AddressBuilder province(String province){
        this.province = province;
        return this;
    }

    public AddressBuilder country(String country){
        this.country = country;
        return this;
    }

    public AddressBuilder postalCode(String postalCode){
        this.postalCode = postalCode;
        return this;
    }

    public Address build(){
        return new Address(street, city, province, country, postalCode);
    }
}
