package com.codexp.fragility.maintenance.circularreasoning;

import java.util.List;
import java.util.stream.Collectors;

public class LoyaltyService {

    public List<Customer> getGoldStatusCustomers(List<Customer> customers) {
        return customers.stream()
                .filter(c -> c.isActive() && c.getTotalSpend() >= 1000)
                .filter(c -> "USA".equals(c.getCountry()) || "CAN".equals(c.getCountry()))
                .collect(Collectors.toList());
    }
}
