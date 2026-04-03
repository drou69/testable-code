package com.codexp.fragility.maintenance.mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

import org.junit.jupiter.api.Test;

import java.util.List;

class OrderServiceTest {

    //what are we really testing?
    //if we stop mocking what we own, what do we get?
    //how does mocking affects test fragility
    //would this problem with promotions be a thing with other type of test doubles?
    @Test
    void should_calculate_total_with_tax() {
        PromotionService promoService = mock(PromotionService.class);

        when(promoService.findPromotion(any(Item.class))).thenReturn(12.0);

        PriceCalculator calculator = mock(PriceCalculator.class);
        when(calculator.calculate(any(Order.class))).thenReturn(30.0);

        OrderService service = new OrderService(calculator, promoService);

        Order order = new Order(List.of(new Item(1,8.0), new Item(2,20.0)));

        double total = service.checkout(order);

        assertEquals(30.0, total);
    }
}
