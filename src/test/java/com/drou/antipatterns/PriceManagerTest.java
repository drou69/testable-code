package com.drou.antipatterns;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PriceManagerTest {

    @Test
    void should_be_able_to_execute() {
        PriceManager priceManager = new PriceManager();
        assertThat(priceManager.validateAvailability(), equalTo(true));
    }
}
