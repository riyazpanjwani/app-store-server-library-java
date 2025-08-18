// Copyright (c) 2025 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * The data your app provides to add items when it makes changes to an auto-renewable subscription.
 *
 * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/subscriptionmodifyadditem">SubscriptionModifyAddItem</a>
 */
public class AdvancedCommerceSubscriptionModifyChangeItem {
    private static final String SERIALIZED_NAME_SKU = "SKU";
    private static final String SERIALIZED_NAME_CURRENT_SKU = "currentSKU";
    private static final String SERIALIZED_NAME_DESCRIPTION = "description";
    private static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
    private static final String SERIALIZED_NAME_EFFECTIVE = "effective";
    private static final String SERIALIZED_NAME_OFFER = "offer";
    private static final String SERIALIZED_NAME_PRICE = "price";
    private static final String SERIALIZED_NAME_PRORATED_PRICE = "proratedPrice";
    private static final String SERIALIZED_NAME_REASON = "reason";

    @JsonProperty(value = SERIALIZED_NAME_CURRENT_SKU, required = true)
    private String currentSku;
    @JsonProperty(value = SERIALIZED_NAME_DESCRIPTION, required = true)
    private String description;
    @JsonProperty(value = SERIALIZED_NAME_DISPLAY_NAME, required = true)
    private String displayName;
    @JsonProperty(value = SERIALIZED_NAME_EFFECTIVE, required = true)
    private AdvancedCommerceEffective effective;
    @JsonProperty(SERIALIZED_NAME_OFFER)
    private AdvancedCommerceRequestOffer offer;
    @JsonProperty(value = SERIALIZED_NAME_PRICE, required = true)
    private long price;
    @JsonProperty(SERIALIZED_NAME_PRORATED_PRICE)
    private Long proratedPrice;
    @JsonProperty(value = SERIALIZED_NAME_REASON, required = true)
    private AdvancedCommerceReason reason;
    @JsonProperty(value = SERIALIZED_NAME_SKU, required = true)
    private String sku;

    private static final int MAXIMUM_DESCRIPTION_LENGTH = 45;
    private static final int MAXIMUM_DISPLAY_NAME_LENGTH = 30;
    private static final int MAXIMUM_SKU_LENGTH = 128;

    private AdvancedCommerceSubscriptionModifyChangeItem() {}

    public AdvancedCommerceSubscriptionModifyChangeItem(String currentSku, String description, String displayName, AdvancedCommerceEffective effective, long price, AdvancedCommerceReason reason, String sku) {
        this.currentSku = validateSku(currentSku);
        Objects.requireNonNull(description, "Description cannot be null");
        this.description = AdvancedCommerceValidationUtils.validateDescription(description);
        Objects.requireNonNull(displayName, "Display name cannot be null");
        this.displayName = AdvancedCommerceValidationUtils.validateDisplayName(displayName);
        this.effective = Objects.requireNonNull(effective);
        this.price = price;
        this.reason = Objects.requireNonNull(reason);
        this.sku = validateSku(sku);
    }

    public AdvancedCommerceSubscriptionModifyChangeItem currentSku(String currentSku) {
        this.currentSku = validateSku(currentSku);
        return this;
    }

    /**
     *
     **/
    public String getCurrentSku() {
        return currentSku;
    }

    public void setCurrentSku(String currentSku) {
        this.currentSku = validateSku(currentSku);
    }

    public AdvancedCommerceSubscriptionModifyChangeItem description(String description) {
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

    public AdvancedCommerceSubscriptionModifyChangeItem displayName(String displayName) {
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

    public AdvancedCommerceSubscriptionModifyChangeItem effective(AdvancedCommerceEffective effective) {
        this.effective = effective;
        return this;
    }

    /**
     * A string value that indicates when a requested change to an auto-renewable subscription goes into effect.
     *
     * @return effective
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/effective">effective</a>
     **/
    public AdvancedCommerceEffective getEffective() {
        return effective;
    }

    public void setEffective(AdvancedCommerceEffective effective) {
        this.effective = effective;
    }

    public AdvancedCommerceSubscriptionModifyChangeItem offer(AdvancedCommerceRequestOffer offer) {
        this.offer = offer;
        return this;
    }

    /**
     * A discount offer for an auto-renewable subscription.
     *
     * @return offer
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/offer">Offer</a>
     **/
    public AdvancedCommerceRequestOffer getOffer() {
        return offer;
    }

    public void setOffer(AdvancedCommerceRequestOffer offer) {
        this.offer = offer;
    }

    public AdvancedCommerceSubscriptionModifyChangeItem price(long price) {
        this.price = price;
        return this;
    }

    /**
     *  The price, in milliunits of the currency, of the one-time charge product.
     *
     * @return displayName
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/price">price</a>
     **/
    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public AdvancedCommerceSubscriptionModifyChangeItem proratedPrice(Long proratedPrice) {
        this.proratedPrice = proratedPrice;
        return this;
    }

    /**
     * The prorated price, in milliunits of a currency, for an Advanced Commerce API SKU.
     *
     * @return proratedPrice
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/proratedprice">proratedPrice</a>
     **/
    public Long getProratedPrice() {
        return proratedPrice;
    }

    public void setProratedPrice(Long proratedPrice) {
        this.proratedPrice = proratedPrice;
    }

    public AdvancedCommerceSubscriptionModifyChangeItem reason(AdvancedCommerceReason reason) {
        this.reason = reason;
        return this;
    }

    /**
     *
     **/
    public AdvancedCommerceReason getReason() {
        return reason;
    }

    public void setReason(AdvancedCommerceReason reason) {
        this.reason = reason;
    }


    public AdvancedCommerceSubscriptionModifyChangeItem sku(String sku) {
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
        AdvancedCommerceSubscriptionModifyChangeItem that = (AdvancedCommerceSubscriptionModifyChangeItem) o;
        return price == that.price && Objects.equals(currentSku, that.currentSku) && Objects.equals(description, that.description) && Objects.equals(displayName, that.displayName) && effective == that.effective && Objects.equals(offer, that.offer) && Objects.equals(proratedPrice, that.proratedPrice) && reason == that.reason && Objects.equals(sku, that.sku);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentSku, description, displayName, effective, offer, price, proratedPrice, reason, sku);
    }

    @Override
    public String toString() {
        return "AdvancedCommerceSubscriptionModifyChangeItem{" +
                "currentSku='" + currentSku + '\'' +
                ", description='" + description + '\'' +
                ", displayName='" + displayName + '\'' +
                ", effective=" + effective +
                ", offer=" + offer +
                ", price=" + price +
                ", proratedPrice=" + proratedPrice +
                ", reason=" + reason +
                ", sku='" + sku + '\'' +
                '}';
    }
}