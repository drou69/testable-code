package com.drou.antipatterns;

public class ConnectionManager {
    private final String status;

    public ConnectionManager() {
        // Constructor does slow work
        SlowService service = new SlowService();
        this.status = service.call("connect");
    }

    public boolean isConnected() {
        return status.equalsIgnoreCase("Processed: connect");
    }
}
