package com.codexp.fragility.idempotency.time;

import com.codexp.hardtotest.SlowService;

import java.time.LocalDateTime;

public class UserCreator {
    public String createUser() {
        SlowService service = new SlowService();
        return service.call("User-" + LocalDateTime.now());
    }
}
