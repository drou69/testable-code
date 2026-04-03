package com.codexp.doubles.fake;

public class InventoryService {
    private final InventoryRepository repo;

    public InventoryService(InventoryRepository repo) {
        this.repo = repo;
    }

    public void reserve(String productId, int quantity) {
        int stock = repo.getStock(productId);
        if (stock < quantity) throw new RuntimeException("Out of stock");
        repo.save(productId, stock - quantity);
    }
}
