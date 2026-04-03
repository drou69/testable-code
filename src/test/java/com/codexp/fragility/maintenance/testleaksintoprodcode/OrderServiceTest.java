package com.codexp.fragility.maintenance.testleaksintoprodcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderServiceTest {
    @Test
    void shouldCalculateTotal() {
        Item item1 = new Item(10.0, -2.0);
        Item item2 = new Item(20.0, -3.0);

        Order order = new Order(List.of(item1, item2));

        double total = 0;

        for (Item item : order.getItems()) {
            total += item.getPrice() + item.getPromotion();
        }

        double expected =   item1.getPrice() + item1.getPromotion() +
                            item2.getPrice() + item2.getPromotion();

        assertEquals(expected, total);
    }
}
