package org.labcrypto.topteacher;

import java.util.Arrays;

/**
 * Represents an IP Address. Each node has an IP Address.
 * IP Address is made of some numerical sections.
 *
 * @author Kamran Amini <kam.cpp@gmail.com>
 */
public abstract class IPAddress {

    private int numberOfSections;
    private int[] sections;

    public IPAddress(int numberOfSections) {
        this.numberOfSections = numberOfSections;
        sections = new int[numberOfSections];
    }

    public IPAddress(int[] sections) {
        numberOfSections = sections.length;
        sections = Arrays.copyOf(sections, sections.length);
    }

    public int numberOfSections() {
        return numberOfSections;
    }

    public int section(int index) {
        return sections[index];
    }

    public abstract byte[] getBytes();
}
