package com.codexp.builders;

import java.util.List;

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

    public Customer getCustomer() { return customer; }
    public List<OrderItem> getItems() { return items; }
    public Address getShippingAddress() { return shippingAddress; }
    public PaymentDetails getPaymentDetails() { return paymentDetails; }
}