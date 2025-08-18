// Copyright (c) 2023 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;
import java.util.Objects;

public abstract class AbstractAdvancedCommerceItem {
    private static final String SERIALIZED_NAME_SKU = "SKU";
    private static final String SERIALIZED_NAME_DESCRIPTION = "description";
    private static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
    private static final int MAXIMUM_SKU_LENGTH = 128;

    @JsonProperty(value = SERIALIZED_NAME_SKU, required = true)
    protected String sku;
    @JsonProperty(value = SERIALIZED_NAME_DESCRIPTION, required = true)
    protected String description;
    @JsonProperty(value = SERIALIZED_NAME_DISPLAY_NAME, required = true)
    protected String displayName;
    @JsonAnySetter
    protected Map<String, Object> unknownFields;

    protected AbstractAdvancedCommerceItem() {}

    protected AbstractAdvancedCommerceItem(String sku, String description, String displayName) {
        this.sku = validateSku(sku);
        Objects.requireNonNull(description, "Description cannot be null");
        this.description = AdvancedCommerceValidationUtils.validateDescription(description);
        Objects.requireNonNull(displayName, "Display name cannot be null");
        this.displayName = AdvancedCommerceValidationUtils.validateDisplayName(displayName);
    }

    public abstract AbstractAdvancedCommerceItem self();

    public AbstractAdvancedCommerceItem sku(String sku) {
        this.sku = validateSku(sku);
        return self();
    }

    /**
     * The product identifier of an in-app purchase product you manage in your own system.
     * 
     * @return SKU
     * @see <a href="https://developer.apple.com/documentation/appstoreserverapi/sku">SKU</a>
     **/
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = validateSku(sku);
    }

    protected String validateSku(String sku) {
        Objects.requireNonNull(sku);
        if (sku.length() > MAXIMUM_SKU_LENGTH) {
            throw new IllegalArgumentException("sku length longer than maximum allowed");
        }
        return sku;
    }

    public AbstractAdvancedCommerceItem description(String description) {
        Objects.requireNonNull(description, "Description cannot be null");
        this.description = AdvancedCommerceValidationUtils.validateDescription(description);
        return self();
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

    public AbstractAdvancedCommerceItem displayName(String displayName) {
        Objects.requireNonNull(displayName, "Display name cannot be null");
        this.displayName = AdvancedCommerceValidationUtils.validateDisplayName(displayName);
        return self();
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

    public AbstractAdvancedCommerceItem unknownFields(Map<String, Object> unknownFields) {
        this.unknownFields = unknownFields;
        return self();
    }

    public Map<String, Object> getUnknownFields() {
        return unknownFields;
    }

    public void setUnknownFields(Map<String, Object> unknownFields) {
        this.unknownFields = unknownFields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractAdvancedCommerceItem that = (AbstractAdvancedCommerceItem) o;
        return Objects.equals(this.sku, that.sku) &&
                Objects.equals(this.description, that.description) &&
                Objects.equals(this.displayName, that.displayName) &&
                Objects.equals(this.unknownFields, that.unknownFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sku, description, displayName, unknownFields);
    }
}