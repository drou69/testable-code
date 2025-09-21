package com.drou.antipatterns;

import java.time.LocalDateTime;

public class UserCreator {
    public String createUser() {
        // Slow + time-based
        SlowService service = new SlowService();
        return service.call("User-" + LocalDateTime.now());
    }
}
