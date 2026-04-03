package com.codexp.hardtotest;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PriceManagerTest {

    @Test
    void should_be_able_to_find_availability() {
        PriceManager priceManager = new PriceManager();
        assertThat(priceManager.validateAvailability(), equalTo(true));
    }

    @Test
    void should_prove_that_static_arent_always_bad_citizens() {
        PriceManager priceManager = new PriceManager();
        assertThat(priceManager.validateTrue(), equalTo(true));
    }
}
