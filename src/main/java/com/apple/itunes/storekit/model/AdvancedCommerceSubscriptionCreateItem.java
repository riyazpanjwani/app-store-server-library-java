// Copyright (c) 2025 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * The data that describes a subscription item.
 *
 * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/subscriptioncreateitem">SubscriptionCreateItem</a>
 */
public class AdvancedCommerceSubscriptionCreateItem {
    private static final String SERIALIZED_NAME_DESCRIPTION = "description";
    private static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
    private static final String SERIALIZED_NAME_OFFER = "offer";
    private static final String SERIALIZED_NAME_PRICE = "price";
    private static final String SERIALIZED_NAME_SKU = "SKU";
    @JsonProperty(value = SERIALIZED_NAME_DESCRIPTION, required = true)
    private String description;
    @JsonProperty(value = SERIALIZED_NAME_DISPLAY_NAME, required = true)
    private String displayName;
    @JsonProperty(SERIALIZED_NAME_OFFER)
    private AdvancedCommerceRequestOffer offer;
    @JsonProperty(value = SERIALIZED_NAME_PRICE, required = true)
    private long price;
    @JsonProperty(value = SERIALIZED_NAME_SKU, required = true)
    private String sku;

    private static final int MAXIMUM_SKU_LENGTH = 128;

    private AdvancedCommerceSubscriptionCreateItem() {}

    public AdvancedCommerceSubscriptionCreateItem(String description, String displayName, long price, String sku) {
        Objects.requireNonNull(description, "Description cannot be null");
        this.description = AdvancedCommerceValidationUtils.validateDescription(description);
        Objects.requireNonNull(displayName, "Display name cannot be null");
        this.displayName = AdvancedCommerceValidationUtils.validateDisplayName(displayName);
        this.price = price;
        this.sku = validateSku(sku);
    }

    public AdvancedCommerceSubscriptionCreateItem description(String description) {
        Objects.requireNonNull(description, "Description cannot be null");
        this.description = AdvancedCommerceValidationUtils.validateDescription(description);
        return this;
    }

    /**
     * A string you provide that describes the SKU.
     *
     * @return description
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/description">description</a>
     **/
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        Objects.requireNonNull(description, "Description cannot be null");
        this.description = AdvancedCommerceValidationUtils.validateDescription(description);
    }

    public AdvancedCommerceSubscriptionCreateItem displayName(String displayName) {
        Objects.requireNonNull(displayName, "Display name cannot be null");
        this.displayName = AdvancedCommerceValidationUtils.validateDisplayName(displayName);
        return this;
    }

    /**
     * A string with a product name that you can localize and is suitable for display to customers.
     *
     * @return displayName
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/displayname">displayName</a>
     **/
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        Objects.requireNonNull(displayName, "Display name cannot be null");
        this.displayName = AdvancedCommerceValidationUtils.validateDisplayName(displayName);
    }

    public AdvancedCommerceSubscriptionCreateItem offer(AdvancedCommerceRequestOffer offer) {
        this.offer = offer;
        return this;
    }

    /**
     * A discount offer for an auto-renewable subscription.
     *
     * @return offer
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/offer">offer</a>
     **/
    public AdvancedCommerceRequestOffer getOffer() {
        return offer;
    }

    public void setOffer(AdvancedCommerceRequestOffer offer) {
        this.offer = offer;
    }

    public AdvancedCommerceSubscriptionCreateItem price(long price) {
        this.price = price;
        return this;
    }

    /**
     *  The price, in milliunits of the currency, of the one-time charge product.
     *
     * @return price
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/price">price</a>
     **/
    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public AdvancedCommerceSubscriptionCreateItem sku(String sku) {
        this.sku = validateSku(sku);
        return this;
    }

    /**
     * The product identifier of an in-app purchase product you manage in your own system.
     *
     * @return sku
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/sku">sku</a>
     **/
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = validateSku(sku);
    }

    private String validateSku(String sku) {
        Objects.requireNonNull(sku);
        if (sku.length() > MAXIMUM_SKU_LENGTH) {
            throw new IllegalArgumentException("sku length longer than maximum allowed");
        }
        return sku;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdvancedCommerceSubscriptionCreateItem that = (AdvancedCommerceSubscriptionCreateItem) o;
        return price == that.price && Objects.equals(description, that.description) && Objects.equals(displayName, that.displayName) && Objects.equals(offer, that.offer) && Objects.equals(sku, that.sku);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, displayName, offer, price, sku);
    }

    @Override
    public String toString() {
        return "AdvancedCommerceSubscriptionCreateItem{" +
                "description='" + description + '\'' +
                ", displayName='" + displayName + '\'' +
                ", offer=" + offer +
                ", price=" + price +
                ", sku='" + sku + '\'' +
                '}';
    }
}