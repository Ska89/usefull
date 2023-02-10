package org.example.enums;

import java.util.Arrays;

public enum MigrationType {
    FULL_LOAD("full-load"),
    CDC("cdc"),
    FULL_LOAD_CDC("full-load-and-cdc");
    private final String value;

    public static MigrationType findByValue(final String findValue) {
        return Arrays.stream(values()).filter(status -> status.value.equals(findValue)).findFirst().orElse(null);
    }

    @Override
    public String toString() {
        return value;
    }
}
