package com.codexp.fragility.maintenance.mock;

public class OrderService {

    private final PriceCalculator calculator;
    private final PromotionService promoService;

    public OrderService(PriceCalculator calculator, PromotionService promoService) {
        this.calculator = calculator;
        this.promoService = promoService;
    }

    public double checkout(Order order) {
        double total = order.getItems().stream()
                .mapToDouble(item -> item.getPrice() - promoService.findPromotion(item))
                .sum();

        return calculator.calculate(order);
    }
}
