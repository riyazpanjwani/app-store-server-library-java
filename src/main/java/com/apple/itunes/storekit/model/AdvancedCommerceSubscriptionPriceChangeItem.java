// Copyright (c) 2025 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * The data your app provides to change the price of an item in an auto-renewable subscription.
 *
 * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/subscriptionpricechangeitem">SubscriptionPriceChangeItem</a>
 */
public class AdvancedCommerceSubscriptionPriceChangeItem {

    private static final String SERIALIZED_NAME_SKU = "SKU";
    private static final String SERIALIZED_NAME_PRICE = "price";

    @JsonProperty(value = SERIALIZED_NAME_SKU, required = true)
    private String sku;
    @JsonProperty(value = SERIALIZED_NAME_PRICE, required = true)
    private Long price;

    public AdvancedCommerceSubscriptionPriceChangeItem() {}

    public AdvancedCommerceSubscriptionPriceChangeItem(String sku, Long price) {
        this.sku = AdvancedCommerceValidationUtils.validateSku(sku);
        this.price = AdvancedCommerceValidationUtils.validatePrice(price);
    }

    public AdvancedCommerceSubscriptionPriceChangeItem sku(String sku) {
        this.sku = AdvancedCommerceValidationUtils.validateSku(sku);
        return this;
    }

    /**
     * The SKU identifier for the item to change the price of.
     *
     * @return sku
     **/
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = AdvancedCommerceValidationUtils.validateSku(sku);
    }

    public AdvancedCommerceSubscriptionPriceChangeItem price(Long price) {
        this.price = AdvancedCommerceValidationUtils.validatePrice(price);
        return this;
    }

    /**
     * The new price for the item in milliunits.
     *
     * @return price
     **/
    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = AdvancedCommerceValidationUtils.validatePrice(price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdvancedCommerceSubscriptionPriceChangeItem that = (AdvancedCommerceSubscriptionPriceChangeItem) o;
        return Objects.equals(sku, that.sku) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sku, price);
    }

    @Override
    public String toString() {
        return "AdvancedCommerceSubscriptionPriceChangeItem{" +
                "sku='" + sku + '\'' +
                ", price=" + price +
                '}';
    }
}