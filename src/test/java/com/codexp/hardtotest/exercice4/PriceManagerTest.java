package com.codexp.hardtotest.exercice4;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PriceManagerTest {

    @Test
    void should_be_able_to_find_availability() {
        assertThat(PriceManager.validateAvailability(), equalTo(true));
    }

    @Test
    void should_prove_that_static_arent_always_bad_citizens() {
        assertThat(PriceManager.isAvailable(), equalTo(true));
    }
}
