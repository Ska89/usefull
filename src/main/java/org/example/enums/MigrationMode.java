package org.example.enums;

import java.util.Arrays;

public enum MigrationMode {
    EXTRACT_UPLOAD("extract-upload"),
    EXTRACT_UPLOAD_COPY("extract-upload-copy");

    private final String value;

    MigrationMode(String value) {
        this.value = value;
    }
    public static MigrationMode findByValue(final String findValue) {
        return Arrays.stream(values()).filter(status -> status.value.equals(findValue)).findFirst().orElse(null);
    }

    public String toString() {
        return value;
    }
}
