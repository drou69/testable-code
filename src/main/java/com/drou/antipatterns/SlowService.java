package com.drou.antipatterns;

public class SlowService {
    public String call(String input) {
        try {
            Thread.sleep(3000); // artificial delay
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Processed: " + input;
    }
}
