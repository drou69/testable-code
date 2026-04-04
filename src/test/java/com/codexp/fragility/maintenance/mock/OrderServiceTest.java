package com.codexp.fragility.maintenance.mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

import org.junit.jupiter.api.Test;

import java.util.List;

class OrderServiceTest {

    // What are we really testing when we are 100% isolated like that?
    // If we stop mocking what we own, what do we get?
    // How does mocking affects test fragility?
    // Would this problem with promotions be a thing with another Test Double strategy?
    @Test
    void should_calculate_total_with_including_promotions() {
        PromotionService promoService = mock(PromotionService.class);

        when(promoService.findPromotion(any(Item.class))).thenReturn(12.0);

        PriceCalculator calculator = mock(PriceCalculator.class);

        OrderService service = new OrderService(calculator, promoService);

        Order order = new Order(List.of(new Item(1,-4.0), new Item(2,20.0)));
        when(calculator.calculate(order) ).thenReturn(30.0);

        double total = service.checkout(order);

        assertEquals(22.0, total);
    }
}
