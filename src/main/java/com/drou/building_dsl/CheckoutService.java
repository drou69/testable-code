package com.drou.building_dsl;

import java.util.List;

public class CheckoutService {

    private final PaymentGateway paymentGateway;
    private final ShippingService shippingService;
    private final TaxService taxService;

    public CheckoutService(PaymentGateway paymentGateway,
                           ShippingService shippingService,
                           TaxService taxService) {
        this.paymentGateway = paymentGateway;
        this.shippingService = shippingService;
        this.taxService = taxService;
    }

    public Receipt checkout(Order order) {

        double subtotal = order.getItems()
                .stream()
                .mapToDouble(OrderItem::subtotal)
                .sum();

        double tax = taxService.calculateTax(subtotal, order.getShippingAddress().getCountry());

        double shipping = shippingService.calculateShipping(order.getItems(), order.getShippingAddress());

        double total = subtotal + tax + shipping;

        paymentGateway.charge(order.getPaymentDetails(), total);

        return new Receipt(total);
    }
}
