package com.drou.antipatterns;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RussianDollsTest {

    @Test
    void should_be_able_to_execute() {
        RussianDolls.BabyDoll babyDoll = new RussianDolls.BabyDoll();
        assertThat(babyDoll.compute("input"), equalTo("Processed: Slow main-GrandMa-Mommy-Baby-input"));
    }
}
