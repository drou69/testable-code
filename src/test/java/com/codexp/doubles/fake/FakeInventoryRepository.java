package com.codexp.doubles.fake;

import java.util.HashMap;
import java.util.Map;

public class FakeInventoryRepository implements InventoryRepository{

    private final Map<String, Integer> data = new HashMap<>();

    public void addStock(String productId, int quantity) {
        data.put(productId, quantity);
    }

    @Override
    public int getStock(String productId) {
        return data.getOrDefault(productId, 0);
    }

    @Override
    public void save(String productId, int stock) {
        data.put(productId, stock);
    }
}
