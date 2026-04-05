package com.codexp.sociable.repository;

import com.codexp.sociable.domain.Order;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class OrderRepository {
    private final Map<String, Order> store = new HashMap<>();

    public String save(Order order) {
        String id = UUID.randomUUID().toString();
        store.put(id, order);
        return id;
    }

    public Order findById(String id) {
        return store.get(id);
    }
}
