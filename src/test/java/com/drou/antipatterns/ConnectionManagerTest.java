package com.drou.antipatterns;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ConnectionManagerTest {

    @Test
    void should_be_able_to_execute() {
        ConnectionManager manager = new ConnectionManager();
        assertThat(manager.getStatus(), equalTo("Processed: connect"));
    }
}
