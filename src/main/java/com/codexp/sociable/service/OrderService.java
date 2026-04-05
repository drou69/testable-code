package com.codexp.sociable.service;

import com.codexp.sociable.adapter.PaymentGateway;
import com.codexp.sociable.adapter.PaymentResult;
import com.codexp.sociable.domain.Order;
import com.codexp.sociable.repository.OrderRepository;

public class OrderService {
    private final OrderRepository repository;
    private final PaymentGateway paymentGateway;
    private final DiscountService pricingService;

    public OrderService(OrderRepository repository,
                        PaymentGateway paymentGateway,
                        DiscountService pricingService) {
        this.repository = repository;
        this.paymentGateway = paymentGateway;
        this.pricingService = pricingService;
    }

    public String checkout(Order order, String customerId) {
        double total = pricingService.applyAvailableDiscount(order);

        PaymentResult result = paymentGateway.charge(customerId, total);

        if (!result.isSuccess()) {
            throw new RuntimeException("Payment failed");
        }

        order.markAsPaid();
        return repository.save(order);
    }
}
