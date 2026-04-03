package com.codexp.hardtotest;

public class OrderProcessor {
    public String process(String order) {
        // Hard-wired AND slow
        SlowService service = new SlowService();
        return service.call(order);
    }
}
