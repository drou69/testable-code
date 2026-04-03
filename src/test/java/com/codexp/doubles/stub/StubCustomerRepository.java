package com.codexp.doubles.stub;

public class StubCustomerRepository implements CustomerRepository{
    private final boolean premium;

    public StubCustomerRepository(boolean premium) {
        this.premium = premium;
    }

    @Override
    public Customer findById(String id) {
        return new Customer(id, premium);
    }
}
