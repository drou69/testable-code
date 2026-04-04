package com.codexp.fragility.maintenance.testleaksintoprodcode;

import org.junit.jupiter.api.Test;

import java.util.ResourceBundle;

import static org.mockito.Mockito.*;

public class WineManagerTest {
    @Test
    void should_be_able_to_add_a_bottle_without_logging_it() {
        System.Logger logger = mock(System.Logger.class);
        WineManager manager = new WineManager(true, logger);

        manager.add("Chateau Cheval Blanc, 1988");

        verify(logger, never()).log(any(), anyString());
    }
}
