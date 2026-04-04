package com.codexp.hardtotest.exercice1;

import com.codexp.hardtotest.SlowService;

public class OrderProcessor {
    public String process(String order) {
        SlowService service = new SlowService();
        return service.call(order);
    }
}
