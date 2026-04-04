package com.codexp.fragility.maintenance.circularreasoning;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LoyaltyServiceTest {

    //How do we fix that?

    // The more complex the logic is to produce the value, the more tempted people are to do this
    // What about reusing constants from your production code in your tests?
    // If you duplicate behavior, you duplicate bugs too when there are some present in your code
    @Test
    void testGetGoldStatus_Mirrored() {
        List<Customer> input = Arrays.asList(
                new Customer(true, 1500, "USA"),
                new Customer(false, 2000, "USA"),
                new Customer(true, 500, "CAN")
        );

        // MIRRORING: Re-implementing production logic to define expected output
        List<Customer> expected = input.stream()
                .filter(c -> c.isActive() && c.getTotalSpend() >= 1000)
                .filter(c -> "USA".equals(c.getCountry()) || "CAN".equals(c.getCountry()))
                .toList();

        LoyaltyService service = new LoyaltyService();

        List<Customer> actual = service.getGoldStatusCustomers(input);
        assertEquals(expected, actual);
    }

    // Figure out the scenarios (main and alternates) and calculate yourself the possible outcomes to use
    // these values as golden standards
    @Test
    void should_be_able_to_qualify_GoldStatus_in_a_robust_way() {
        Customer goldUser = new Customer(true, 1000, "USA"); // Exactly at boundary
        Customer lowSpend = new Customer(true, 999, "USA");  // Just below boundary
        Customer inactive = new Customer(false, 5000, "USA"); // High spend but inactive
        Customer wrongRegion = new Customer(true, 2000, "UK"); // High spend but wrong country

        LoyaltyService service = new LoyaltyService();
        List<Customer> input = Arrays.asList(goldUser, lowSpend, inactive, wrongRegion);

        List<Customer> actual = service.getGoldStatusCustomers(input);

        // Assert on hard-coded, known expectations
        assertEquals(1, actual.size(), "Only one customer should qualify");
        assertTrue(actual.contains(goldUser), "User with exactly 1000 spend in USA should be Gold");
    }
}
