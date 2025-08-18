// Copyright (c) 2025 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * The data your app provides to request a refund for an item.
 *
 * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/requestrefunditem">RequestRefundItem</a>
 */
public class AdvancedCommerceRequestRefundItem {

    private static final String SERIALIZED_NAME_SKU = "SKU";
    private static final String SERIALIZED_NAME_REFUND_AMOUNT = "refundAmount";
    private static final String SERIALIZED_NAME_REFUND_REASON = "refundReason";
    private static final String SERIALIZED_NAME_REFUND_TYPE = "refundType";
    private static final String SERIALIZED_NAME_REVOKE = "revoke";

    @JsonProperty(value = SERIALIZED_NAME_SKU, required = true)
    private String sku;
    @JsonProperty(SERIALIZED_NAME_REFUND_AMOUNT)
    private Integer refundAmount;
    @JsonProperty(value = SERIALIZED_NAME_REFUND_REASON, required = true)
    private AdvancedCommerceRefundReason refundReason;
    @JsonProperty(value = SERIALIZED_NAME_REFUND_TYPE, required = true)
    private String refundType;
    @JsonProperty(value = SERIALIZED_NAME_REVOKE, required = true)
    private Boolean revoke;

    public AdvancedCommerceRequestRefundItem() {}

    public AdvancedCommerceRequestRefundItem(
            String sku,
            AdvancedCommerceRefundReason refundReason,
            String refundType,
            Boolean revoke
    ) {
        this.sku = Objects.requireNonNull(sku);
        this.refundReason = Objects.requireNonNull(refundReason);
        this.refundType = Objects.requireNonNull(refundType);
        this.revoke = Objects.requireNonNull(revoke);
    }

    public AdvancedCommerceRequestRefundItem sku(String sku) {
        this.sku = Objects.requireNonNull(sku);
        return this;
    }

    /**
     * The SKU identifier for the item to refund.
     *
     * @return sku
     **/
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = Objects.requireNonNull(sku);
    }

    public AdvancedCommerceRequestRefundItem refundAmount(Integer refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }

    /**
     * A refund amount, in milliunits of the currency.
     *
     * @return refundAmount
     **/
    public Integer getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Integer refundAmount) {
        this.refundAmount = refundAmount;
    }

    public AdvancedCommerceRequestRefundItem refundReason(AdvancedCommerceRefundReason refundReason) {
        this.refundReason = Objects.requireNonNull(refundReason);
        return this;
    }

    /**
     * The reason for the refund.
     *
     * @return refundReason
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/refundreason">RefundReason</a>
     **/
    public AdvancedCommerceRefundReason getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(AdvancedCommerceRefundReason refundReason) {
        this.refundReason = Objects.requireNonNull(refundReason);
    }

    public AdvancedCommerceRequestRefundItem refundType(String refundType) {
        this.refundType = Objects.requireNonNull(refundType);
        return this;
    }

    /**
     * The type of refund. Possible values: FULL, PRORATED, CUSTOM.
     *
     * @return refundType
     **/
    public String getRefundType() {
        return refundType;
    }

    public void setRefundType(String refundType) {
        this.refundType = Objects.requireNonNull(refundType);
    }

    public AdvancedCommerceRequestRefundItem revoke(Boolean revoke) {
        this.revoke = Objects.requireNonNull(revoke);
        return this;
    }

    /**
     * A Boolean value that indicates whether to revoke the item.
     *
     * @return revoke
     **/
    public Boolean getRevoke() {
        return revoke;
    }

    public void setRevoke(Boolean revoke) {
        this.revoke = Objects.requireNonNull(revoke);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdvancedCommerceRequestRefundItem that = (AdvancedCommerceRequestRefundItem) o;
        return Objects.equals(sku, that.sku) && Objects.equals(refundAmount, that.refundAmount) && Objects.equals(refundReason, that.refundReason) && Objects.equals(refundType, that.refundType) && Objects.equals(revoke, that.revoke);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sku, refundAmount, refundReason, refundType, revoke);
    }

    @Override
    public String toString() {
        return "AdvancedCommerceRequestRefundItem{" +
                "sku='" + sku + '\'' +
                ", refundAmount=" + refundAmount +
                ", refundReason=" + refundReason +
                ", refundType='" + refundType + '\'' +
                ", revoke=" + revoke +
                '}';
    }
}