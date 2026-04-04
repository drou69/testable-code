package com.codexp.fragility.maintenance.mock;

public class OrderService {

    private final PriceCalculator calculator;
    private final PromotionService promoService;

    public OrderService(PriceCalculator calculator, PromotionService promoService) {
        this.calculator = calculator;
        this.promoService = promoService;
    }

    public double checkout(Order order) {
        double savings = order.getItems().stream()
                .mapToDouble(item -> {
                    double promotion = promoService.findPromotion(item);
                    double netPrice = item.getPrice() - promotion;
                    return netPrice < 0 ? item.getPrice() : promotion;
                })
                .sum();

        double total = calculator.calculate(order);
        return  total - savings;
    }
}
