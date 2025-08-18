// Copyright (c) 2025 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * The data your app provides to remove an item from an auto-renewable subscription.
 *
 * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/subscriptionmodifyremoveitem">SubscriptionModifyRemoveItem</a>
 */
public class AdvancedCommerceSubscriptionModifyRemoveItem {

    private static final String SERIALIZED_NAME_SKU = "SKU";

    @JsonProperty(value = SERIALIZED_NAME_SKU, required = true)
    private String sku;

    public AdvancedCommerceSubscriptionModifyRemoveItem() {}

    public AdvancedCommerceSubscriptionModifyRemoveItem(String sku) {
        this.sku = validateSku(sku);
    }

    public AdvancedCommerceSubscriptionModifyRemoveItem sku(String sku) {
        this.sku = validateSku(sku);
        return this;
    }

    /**
     * The SKU identifier for the item to remove.
     *
     * @return sku
     **/
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = validateSku(sku);
    }

    private String validateSku(String sku) {
        Objects.requireNonNull(sku, "SKU cannot be null");
        if (sku.length() > 128) {
            throw new IllegalArgumentException("SKU length cannot exceed 128 characters");
        }
        return sku;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdvancedCommerceSubscriptionModifyRemoveItem that = (AdvancedCommerceSubscriptionModifyRemoveItem) o;
        return Objects.equals(sku, that.sku);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sku);
    }

    @Override
    public String toString() {
        return "AdvancedCommerceSubscriptionModifyRemoveItem{" +
                "sku='" + sku + '\'' +
                '}';
    }
}