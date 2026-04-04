package com.codexp.fragility.idempotency.time;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class UserCreatorTest {

    @Test
    @Disabled("To have the tests running for the other exercises")
    void should_be_able_to_execute() {
        UserCreator creator = new UserCreator();
        assertThat(creator.createUser(), equalTo("Processed: User-2025-09-21T15:40:53.149587300"));
    }
}
