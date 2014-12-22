package org.labcrypto.topteacher;

import java.util.ArrayList;
import java.util.List;

/**
 * Each node represents a computer in class.
 */
public class Node {

    private String name;
    private IPAddress ipAddress;
    private List<Permission> permissions;

    public String name() {
        return name;
    }

    public IPAddress address() {
        return ipAddress;
    }

    public List<Permission> permissions() {
        if (permissions == null) {
            permissions = new ArrayList<>();
        }
        return permissions;
    }
}
