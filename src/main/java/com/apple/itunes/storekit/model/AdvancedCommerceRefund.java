// Copyright (c) 2026 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;
import java.util.Objects;

/**
 * @see <a href="https://developer.apple.com/documentation/appstoreserverapi/advancedcommercerefund">advancedCommerceRefund</a>
 */
public class AdvancedCommerceRefund {

    private static final String SERIALIZED_NAME_REFUND_AMOUNT = "refundAmount";
    private static final String SERIALIZED_NAME_REFUND_DATE = "refundDate";
    private static final String SERIALIZED_NAME_REFUND_REASON = "refundReason";
    private static final String SERIALIZED_NAME_REFUND_TYPE = "refundType";

    @JsonProperty(SERIALIZED_NAME_REFUND_AMOUNT)
    private Long refundAmount;
    @JsonProperty(SERIALIZED_NAME_REFUND_DATE)
    private Long refundDate;
    @JsonProperty(SERIALIZED_NAME_REFUND_REASON)
    private String refundReason;
    @JsonProperty(SERIALIZED_NAME_REFUND_TYPE)
    private String refundType;
    @JsonAnySetter
    private Map<String, Object> unknownFields;

    public AdvancedCommerceRefund() {
    }

    public AdvancedCommerceRefund refundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }

    /**
     * @return refundAmount
     * @see <a href="https://developer.apple.com/documentation/appstoreserverapi/advancedcommercerefundamount">advancedCommerceRefundAmount</a>
     **/
    public Long getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
    }

    public AdvancedCommerceRefund refundDate(Long refundDate) {
        this.refundDate = refundDate;
        return this;
    }

    /**
     * @return refundDate
     * @see <a href="https://developer.apple.com/documentation/appstoreserverapi/advancedcommercerefunddate">advancedCommerceRefundDate</a>
     **/
    public Long getRefundDate() {
        return refundDate;
    }

    public void setRefundDate(Long refundDate) {
        this.refundDate = refundDate;
    }

    public AdvancedCommerceRefund refundReason(AdvancedCommerceRefundReason refundReason) {
        this.refundReason = refundReason != null ? refundReason.getValue() : null;
        return this;
    }

    /**
     * @return refundReason
     * @see <a href="https://developer.apple.com/documentation/appstoreserverapi/advancedcommercerefundreason">advancedCommerceRefundReason</a>
     **/
    public AdvancedCommerceRefundReason getRefundReason() {
        return refundReason != null ? AdvancedCommerceRefundReason.fromValue(refundReason) : null;
    }

    /**
     * @see #getRefundReason()
     */
    public String getRawRefundReason() {
        return refundReason;
    }

    public void setRefundReason(AdvancedCommerceRefundReason refundReason) {
        this.refundReason = refundReason != null ? refundReason.getValue() : null;
    }

    public void setRawRefundReason(String rawRefundReason) {
        this.refundReason = rawRefundReason;
    }

    public AdvancedCommerceRefund refundType(AdvancedCommerceRefundType refundType) {
        this.refundType = refundType != null ? refundType.getValue() : null;
        return this;
    }

    /**
     * @return refundType
     * @see <a href="https://developer.apple.com/documentation/appstoreserverapi/advancedcommercerefundtype">advancedCommerceRefundType</a>
     **/
    public AdvancedCommerceRefundType getRefundType() {
        return refundType != null ? AdvancedCommerceRefundType.fromValue(refundType) : null;
    }

    /**
     * @see #getRefundType()
     */
    public String getRawRefundType() {
        return refundType;
    }

    public void setRefundType(AdvancedCommerceRefundType refundType) {
        this.refundType = refundType != null ? refundType.getValue() : null;
    }

    public void setRawRefundType(String rawRefundType) {
        this.refundType = rawRefundType;
    }

    public AdvancedCommerceRefund unknownFields(Map<String, Object> unknownFields) {
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
        AdvancedCommerceRefund that = (AdvancedCommerceRefund) o;
        return Objects.equals(refundAmount, that.refundAmount) && Objects.equals(refundDate, that.refundDate) && Objects.equals(refundReason, that.refundReason) && Objects.equals(refundType, that.refundType) && Objects.equals(unknownFields, that.unknownFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refundAmount, refundDate, refundReason, refundType, unknownFields);
    }

    @Override
    public String toString() {
        return "AdvancedCommerceRefund{" +
                "refundAmount=" + refundAmount +
                ", refundDate=" + refundDate +
                ", refundReason='" + refundReason + '\'' +
                ", refundType='" + refundType + '\'' +
                ", unknownFields=" + unknownFields +
                '}';
    }
}
