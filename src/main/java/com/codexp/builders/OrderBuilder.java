package com.codexp.builders;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderBuilder {
    private Customer customer;
    private List<OrderItem> items;
    private Address address;
    private PaymentDetails payment;

    private OrderBuilder(){
        this.items = new ArrayList<>();
    }

    public static OrderBuilder createOrder(){
        return new OrderBuilder();
    }

    public OrderBuilder with(Customer customer) {
        this.customer = customer;
        return this;
    }

    public OrderBuilder with(OrderItem item) {
        this.items.add(item);
        return this;
    }

    public OrderBuilder with(PaymentDetails details) {
        this.payment = details;
        return this;
    }

    public OrderBuilder shippingTo(Address address) {
        this.address = address;
        return this;
    }

    public Order build() {
        this.payment = Optional.ofNullable(this.payment)
                .orElseGet(() -> new PaymentDetails("4111111111111111", customer.getName(), "12/28"));

        return new Order(customer, items, address, payment);
    }
}
