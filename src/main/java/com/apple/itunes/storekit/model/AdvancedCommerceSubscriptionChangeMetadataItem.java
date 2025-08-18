// Copyright (c) 2025 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * The data your app provides to change the metadata of an item in an auto-renewable subscription.
 *
 * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/subscriptionchangemetadataitem">SubscriptionChangeMetadataItem</a>
 */
public class AdvancedCommerceSubscriptionChangeMetadataItem {

    private static final String SERIALIZED_NAME_SKU = "SKU";
    private static final String SERIALIZED_NAME_CURRENT_SKU = "currentSKU";
    private static final String SERIALIZED_NAME_DESCRIPTION = "description";
    private static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
    private static final String SERIALIZED_NAME_EFFECTIVE = "effective";

    @JsonProperty(SERIALIZED_NAME_SKU)
    private String sku;
    @JsonProperty(SERIALIZED_NAME_CURRENT_SKU)
    private String currentSku;
    @JsonProperty(SERIALIZED_NAME_DESCRIPTION)
    private String description;
    @JsonProperty(SERIALIZED_NAME_DISPLAY_NAME)
    private String displayName;
    @JsonProperty(value = SERIALIZED_NAME_EFFECTIVE, required = true)
    private AdvancedCommerceEffective effective;

    public AdvancedCommerceSubscriptionChangeMetadataItem() {}

    public AdvancedCommerceSubscriptionChangeMetadataItem(AdvancedCommerceEffective effective) {
        this.effective = Objects.requireNonNull(effective);
    }

    public AdvancedCommerceSubscriptionChangeMetadataItem sku(String sku) {
        this.sku = AdvancedCommerceValidationUtils.validateSku(sku);
        return this;
    }

    /**
     * The SKU identifier for the item.
     *
     * @return sku
     **/
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = AdvancedCommerceValidationUtils.validateSku(sku);
    }

    public AdvancedCommerceSubscriptionChangeMetadataItem currentSku(String currentSku) {
        this.currentSku = AdvancedCommerceValidationUtils.validateSku(currentSku);
        return this;
    }

    /**
     * The current SKU identifier for the item.
     *
     * @return currentSku
     **/
    public String getCurrentSku() {
        return currentSku;
    }

    public void setCurrentSku(String currentSku) {
        this.currentSku = AdvancedCommerceValidationUtils.validateSku(currentSku);
    }

    public AdvancedCommerceSubscriptionChangeMetadataItem description(String description) {
        this.description = AdvancedCommerceValidationUtils.validateDescription(description);
        return this;
    }

    /**
     * The description of the item. Maximum length: 45 characters.
     *
     * @return description
     **/
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = AdvancedCommerceValidationUtils.validateDescription(description);
    }

    public AdvancedCommerceSubscriptionChangeMetadataItem displayName(String displayName) {
        this.displayName = AdvancedCommerceValidationUtils.validateDisplayName(displayName);
        return this;
    }

    /**
     * The display name of the item. Maximum length: 30 characters.
     *
     * @return displayName
     **/
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = AdvancedCommerceValidationUtils.validateDisplayName(displayName);
    }

    public AdvancedCommerceSubscriptionChangeMetadataItem effective(AdvancedCommerceEffective effective) {
        this.effective = Objects.requireNonNull(effective);
        return this;
    }

    /**
     * A value that indicates when the change takes effect.
     *
     * @return effective
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/effective">Effective</a>
     **/
    public AdvancedCommerceEffective getEffective() {
        return effective;
    }

    public void setEffective(AdvancedCommerceEffective effective) {
        this.effective = Objects.requireNonNull(effective);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdvancedCommerceSubscriptionChangeMetadataItem that = (AdvancedCommerceSubscriptionChangeMetadataItem) o;
        return Objects.equals(sku, that.sku) && Objects.equals(currentSku, that.currentSku) && Objects.equals(description, that.description) && Objects.equals(displayName, that.displayName) && Objects.equals(effective, that.effective);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sku, currentSku, description, displayName, effective);
    }

    @Override
    public String toString() {
        return "AdvancedCommerceSubscriptionChangeMetadataItem{" +
                "sku='" + sku + '\'' +
                ", currentSku='" + currentSku + '\'' +
                ", description='" + description + '\'' +
                ", displayName='" + displayName + '\'' +
                ", effective=" + effective +
                '}';
    }
}