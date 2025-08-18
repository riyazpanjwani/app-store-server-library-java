// Copyright (c) 2025 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * The data your app provides to reactivate an item in an auto-renewable subscription.
 *
 * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/subscriptionreactivateitem">SubscriptionReactivateItem</a>
 */
public class AdvancedCommerceSubscriptionReactivateItem {

    private static final String SERIALIZED_NAME_SKU = "SKU";

    @JsonProperty(value = SERIALIZED_NAME_SKU, required = true)
    private String sku;

    public AdvancedCommerceSubscriptionReactivateItem() {}

    public AdvancedCommerceSubscriptionReactivateItem(String sku) {
        this.sku = Objects.requireNonNull(sku);
    }

    public AdvancedCommerceSubscriptionReactivateItem sku(String sku) {
        this.sku = Objects.requireNonNull(sku);
        return this;
    }

    /**
     * The SKU identifier for the item to reactivate.
     *
     * @return sku
     **/
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = Objects.requireNonNull(sku);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdvancedCommerceSubscriptionReactivateItem that = (AdvancedCommerceSubscriptionReactivateItem) o;
        return Objects.equals(sku, that.sku);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sku);
    }

    @Override
    public String toString() {
        return "AdvancedCommerceSubscriptionReactivateItem{" +
                "sku='" + sku + '\'' +
                '}';
    }
}