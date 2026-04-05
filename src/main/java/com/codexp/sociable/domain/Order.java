package com.codexp.sociable.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<OrderItem> items = new ArrayList<>();
    private boolean paid = false;

    public void addItem(String name, double price) {
        items.add(new OrderItem(name, price));
    }

    public double total() {
        return items.stream()
                .mapToDouble(OrderItem::price)
                .sum();
    }

    public void markAsPaid() {
        this.paid = true;
    }

    public boolean isPaid() {
        return paid;
    }

    public record OrderItem(String name, double price) {}
}

