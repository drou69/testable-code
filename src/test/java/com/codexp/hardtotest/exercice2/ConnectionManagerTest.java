package com.codexp.hardtotest.exercice2;

import com.codexp.hardtotest.SlowService;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ConnectionManagerTest {

    @Test
    void should_be_connected() {
        //Arrange
        ConnectionManager manager = new ConnectionManager(new SlowService());

        //Act
        //...

        //Assert
        assertThat(manager.isConnected(), is(true));
    }
}
