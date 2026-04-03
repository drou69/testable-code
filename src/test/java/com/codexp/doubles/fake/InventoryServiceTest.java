package com.codexp.doubles.fake;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InventoryServiceTest {
    @Test
    void canReserveStock() {
        FakeInventoryRepository repo = new FakeInventoryRepository();
        repo.addStock("book1", 10);
        InventoryService service = new InventoryService(repo);

        service.reserve("book1", 4);

        assertEquals(6, repo.getStock("book1")); // stock decreased
    }

    @Test
    void cannotReserveMoreThanStock() {
        FakeInventoryRepository repo = new FakeInventoryRepository();
        repo.addStock("book1", 5);
        InventoryService service = new InventoryService(repo);

        assertThrows(RuntimeException.class, () -> service.reserve("book1", 10));
    }
}
