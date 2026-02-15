package com.drou.antipatterns;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ConnectionManagerTest {

    @Test
    void should_be_able_to_execute() {
        //Arrange
        ConnectionManagerFake manager = new ConnectionManagerFake();

        //Act
        manager.connect();

        //Assert
        assertThat(manager.isConnected(), is(true));
    }

    private static class ConnectionManagerFake extends ConnectionManager{
        @Override
        public SlowService getService() {
            return new SlowServiceStub();
        }
    }

    private static class SlowServiceStub extends SlowService{
        @Override
        public String call(String input) {
            return "Processed: " + input;
        }
    }
}
