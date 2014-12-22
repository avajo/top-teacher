package org.labcrypto.topteacher;

public enum Permission {

    SHOW_DESKTOP(1000);

    private int id;

    Permission(int id) {
        this.id = id;
    }

    public int id() {
        return id;
    }
}
