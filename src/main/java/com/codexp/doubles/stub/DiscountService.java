package com.codexp.doubles.stub;

public class DiscountService {
    private CustomerRepository repo;

    public DiscountService(CustomerRepository repo) {
        this.repo = repo;
    }

    public double getDiscount(String customerId) {
        Customer c = repo.findById(customerId);
        return c.isPremium() ? 0.2 : 0.0;
    }
}
