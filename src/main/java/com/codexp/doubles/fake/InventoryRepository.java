package com.codexp.doubles.fake;

public interface InventoryRepository {
    int getStock(String productId);
    void save(String productId, int stock);
}
