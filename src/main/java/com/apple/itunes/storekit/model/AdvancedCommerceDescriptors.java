// Copyright (c) 2025 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;
import java.util.Objects;

/**
 * The description and display name of the subscription to migrate to that you manage.
 */
public class AdvancedCommerceDescriptors {
    private static final String SERIALIZED_NAME_DESCRIPTION = "description";
    private static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";

    @JsonProperty(SERIALIZED_NAME_DESCRIPTION)
    private String description;
    @JsonProperty(SERIALIZED_NAME_DISPLAY_NAME)
    private String displayName;
    @JsonAnySetter
    private Map<String, Object> unknownFields;

    public AdvancedCommerceDescriptors() {}

    public AdvancedCommerceDescriptors description(String description) {
        Objects.requireNonNull(description, "Description cannot be null");
        this.description = AdvancedCommerceValidationUtils.validateDescription(description);
        return this;
    }

    /**
     * A string you provide that describes a SKU.
     * 
     * @return description
     * @see <a href="https://developer.apple.com/documentation/appstoreserverapi/description">Description</a>
     **/
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        Objects.requireNonNull(description, "Description cannot be null");
        this.description = AdvancedCommerceValidationUtils.validateDescription(description);
    }

    public AdvancedCommerceDescriptors displayName(String displayName) {
        Objects.requireNonNull(displayName, "Display name cannot be null");
        this.displayName = AdvancedCommerceValidationUtils.validateDisplayName(displayName);
        return this;
    }

    /**
     * A string with a product name that you can localize and is suitable for display to customers.
     *
     * @return displayName
     * @see <a href="https://developer.apple.com/documentation/appstoreserverapi/displayname">DisplayName</a>
     **/
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        Objects.requireNonNull(displayName, "Display name cannot be null");
        this.displayName = AdvancedCommerceValidationUtils.validateDisplayName(displayName);
    }

    public AdvancedCommerceDescriptors unknownFields(Map<String, Object> unknownFields) {
        this.unknownFields = unknownFields;
        return this;
    }

    public Map<String, Object> getUnknownFields() {
        return unknownFields;
    }

    public void setUnknownFields(Map<String, Object> unknownFields) {
        this.unknownFields = unknownFields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdvancedCommerceDescriptors that = (AdvancedCommerceDescriptors) o;
        return Objects.equals(description, that.description) && Objects.equals(displayName, that.displayName) && Objects.equals(unknownFields, that.unknownFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, displayName, unknownFields);
    }

    @Override
    public String toString() {
        return "AdvancedCommerceDescriptors{" +
                "description='" + description + '\'' +
                ", displayName='" + displayName + '\'' +
                ", unknownFields=" + unknownFields +
                '}';
    }
}