package com.drou.antipatterns;

public class PriceManager {

    public boolean validateAvailability() {
        return InventoryService.checkStock();
    }

    static class InventoryService {
        public static boolean checkStock() {
            try {
                Thread.sleep(3000); // artificial delay
                return true;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}