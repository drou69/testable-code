package com.codexp.builders.lombok;

import java.util.List;

public class OrderScenarios {

    private List<OrderItem> items;
    private Customer customer;
    private Address address;

    public OrderScenarios fromQuebec() {
        customer = CustomerScenario.createCustomerFromMontreal();
        return this;
    }

    public OrderScenarios fromOntario() {
        customer = CustomerScenario.createCustomerFromOttawa();
        return this;
    }

    public OrderScenarios forItems(OrderItem... items) {
        this.items = List.of(items);
        return this;
    }

    public Order assemble() {
        PaymentDetails payment = PaymentDetails.builder().cardNumber("4111111111111111").cardHolder(customer.getName()).expiry("12/28").build();
        return Order.builder().customer(customer).items(items).shippingAddress(customer.getAddress()).paymentDetails(payment).build();
    }
}
