package com.codexp.doubles.stub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountServiceTest {
    @Test
    void premium_customer_gets_discount() {
        // Stub provides controlled output
        CustomerRepository stubRepo = new StubCustomerRepository(true);
        DiscountService service = new DiscountService(stubRepo);

        double discount = service.getDiscount("any-id");

        assertEquals(0.2, discount);
    }

    @Test
    void regular_customer_gets_no_discount() {
        CustomerRepository stubRepo = new StubCustomerRepository(false);
        DiscountService service = new DiscountService(stubRepo);

        double discount = service.getDiscount("any-id");

        assertEquals(0.0, discount);
    }
}
