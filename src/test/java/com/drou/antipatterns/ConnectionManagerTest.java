package com.drou.antipatterns;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ConnectionManagerTest {

    @Test
    void should_be_able_to_execute() {
        //Arrange
        ConnectionManager manager = new ConnectionManager();

        //Act
        boolean status = manager.isConnected();

        //Assert
        assertThat(status, is(true));
    }
}
