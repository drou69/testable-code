package com.codexp.builders.lombok;

public class CustomerScenario {
    public static Customer createCustomerFromMontreal(){
        Address address = Address.builder().street("1550 St-Laurent").city("Montreal").province("Quebec")
                .country("Canada").postalCode("H3C3P3").build();

        return Customer.builder().id("CUST-123").name("Alice Smith").address(address).build();
    }

    public static Customer createCustomerFromOttawa(){
        Address address = Address.builder().street("1550 St-Laurent").city("Ottawa").province("Ontario")
                .country("Canada").postalCode("O3C3J3").build();

        return Customer.builder().id("CUST-456").name("Bob Smith").address(address).build();
    }
}
