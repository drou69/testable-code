package com.codexp.fragility.maintenance.circularreasoning;

public class Customer {
    private final boolean active;
    private final double totalSpend;
    private final String country;

    public Customer(boolean active, double totalSpend, String country) {
        this.active = active;
        this.totalSpend = totalSpend;
        this.country = country;
    }

    // Getters used by the LoyaltyService logic
    public boolean isActive() {
        return active;
    }

    public double getTotalSpend() {
        return totalSpend;
    }

    public String getCountry() {
        return country;
    }

    // Overriding equals and hashCode is critical if you want to use
    // assertEquals(expectedList, actualList) in your unit tests.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return active == customer.active &&
                Double.compare(customer.totalSpend, totalSpend) == 0 &&
                java.util.Objects.equals(country, customer.country);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(active, totalSpend, country);
    }
}
