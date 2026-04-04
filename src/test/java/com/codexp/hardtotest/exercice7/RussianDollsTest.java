package com.codexp.hardtotest.exercice7;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RussianDollsTest {

    @Test
    void should_be_able_to_hug() {
        BabyDoll babyDoll = new BabyDoll();
        assertThat(babyDoll.hug("no one"), equalTo("Processed: Slow Root hugs Grandma hugs Mommy hugs Baby hugs no one"));
    }
}
