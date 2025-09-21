package com.drou.antipatterns;

public class ConnectionManager {
    private final String status;

    public ConnectionManager() {
        // Constructor does slow work
        SlowService service = new SlowService();
        this.status = service.call("connect");
    }

    public String getStatus() {
        return status;
    }
}
