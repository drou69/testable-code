package com.codexp.builders.lombok;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Order {
    private final Customer customer;
    private final List<OrderItem> items;
    private final Address shippingAddress;
    private final PaymentDetails paymentDetails;

    public Order(Customer customer,
                 List<OrderItem> items,
                 Address shippingAddress,
                 PaymentDetails paymentDetails) {
        this.customer = customer;
        this.items = items;
        this.shippingAddress = shippingAddress;
        this.paymentDetails = paymentDetails;
    }
}