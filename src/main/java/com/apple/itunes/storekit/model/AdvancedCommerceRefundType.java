// Copyright (c) 2025 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AdvancedCommerceRefundType {

    FULL("FULL"),
    PRORATED("PRORATED");

    private final String value;

    AdvancedCommerceRefundType(String value) {
        this.value = value;
    }

    public static AdvancedCommerceRefundType fromValue(String value) {
        for (AdvancedCommerceRefundType b : AdvancedCommerceRefundType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}