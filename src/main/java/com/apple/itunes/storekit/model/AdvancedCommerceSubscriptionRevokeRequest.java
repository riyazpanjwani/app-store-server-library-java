// Copyright (c) 2025 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * The request data your app provides to revoke an auto-renewable subscription.
 *
 * @see <a href=
 *      "https://developer.apple.com/documentation/advancedcommerceapi/subscriptionrevokerequest">SubscriptionRevokeRequest</a>
 */
public class AdvancedCommerceSubscriptionRevokeRequest
        extends AdvancedCommerceRequest<AdvancedCommerceSubscriptionRevokeRequest> {

    private static final String SERIALIZED_NAME_REFUND_REASON = "refundReason";
    private static final String SERIALIZED_NAME_REFUND_RISKING_PREFERENCE = "refundRiskingPreference";
    private static final String SERIALIZED_NAME_REFUND_TYPE = "refundType";
    private static final String SERIALIZED_NAME_REQUEST_INFO = "requestInfo";
    private static final String SERIALIZED_NAME_STOREFRONT = "storefront";

    @JsonProperty(value = SERIALIZED_NAME_REFUND_REASON, required = true)
    private AdvancedCommerceRefundReason refundReason;
    @JsonProperty(value = SERIALIZED_NAME_REFUND_RISKING_PREFERENCE, required = true)
    private Boolean refundRiskingPreference;
    @JsonProperty(SERIALIZED_NAME_REFUND_TYPE)
    private String refundType;
    @JsonProperty(value = SERIALIZED_NAME_REQUEST_INFO, required = true)
    private AdvancedCommerceRequestInfo requestInfo;
    @JsonProperty(SERIALIZED_NAME_STOREFRONT)
    private String storefront;

    public AdvancedCommerceSubscriptionRevokeRequest() {
    }

    public AdvancedCommerceSubscriptionRevokeRequest(
            AdvancedCommerceRefundReason refundReason,
            Boolean refundRiskingPreference,
            AdvancedCommerceRequestInfo requestInfo) {
        super(requestInfo);
        this.refundReason = Objects.requireNonNull(refundReason);
        this.refundRiskingPreference = Objects.requireNonNull(refundRiskingPreference);
    }

    public AdvancedCommerceSubscriptionRevokeRequest refundReason(AdvancedCommerceRefundReason refundReason) {
        this.refundReason = Objects.requireNonNull(refundReason);
        return this;
    }

    /**
     * The reason for the refund.
     *
     * @return refundReason
     * @see <a href=
     *      "https://developer.apple.com/documentation/advancedcommerceapi/refundreason">RefundReason</a>
     **/
    public AdvancedCommerceRefundReason getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(AdvancedCommerceRefundReason refundReason) {
        this.refundReason = Objects.requireNonNull(refundReason);
    }

    public AdvancedCommerceSubscriptionRevokeRequest refundRiskingPreference(Boolean refundRiskingPreference) {
        this.refundRiskingPreference = Objects.requireNonNull(refundRiskingPreference);
        return this;
    }

    /**
     * A Boolean value that indicates the refund risking preference.
     *
     * @return refundRiskingPreference
     * @see <a href=
     *      "https://developer.apple.com/documentation/advancedcommerceapi/refundriskingpreference">RefundRiskingPreference</a>
     **/
    public Boolean getRefundRiskingPreference() {
        return refundRiskingPreference;
    }

    public void setRefundRiskingPreference(Boolean refundRiskingPreference) {
        this.refundRiskingPreference = Objects.requireNonNull(refundRiskingPreference);
    }

    public AdvancedCommerceSubscriptionRevokeRequest refundType(AdvancedCommerceRefundType refundType) {
        this.refundType = refundType != null ? refundType.getValue() : null;
        return this;
    }

    /**
     * The type of refund.
     *
     * @return refundType
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

    public AdvancedCommerceSubscriptionRevokeRequest requestInfo(AdvancedCommerceRequestInfo requestInfo) {
        this.requestInfo = Objects.requireNonNull(requestInfo);
        return this;
    }

    /**
     * The request information for the Advanced Commerce API.
     *
     * @return requestInfo
     * @see <a href=
     *      "https://developer.apple.com/documentation/advancedcommerceapi/requestinfo">RequestInfo</a>
     **/
    public AdvancedCommerceRequestInfo getRequestInfo() {
        return requestInfo;
    }

    public void setRequestInfo(AdvancedCommerceRequestInfo requestInfo) {
        this.requestInfo = Objects.requireNonNull(requestInfo);
    }

    public AdvancedCommerceSubscriptionRevokeRequest storefront(String storefront) {
        this.storefront = storefront;
        return this;
    }

    /**
     * The storefront for the transaction.
     *
     * @return storefront
     * @see <a href=
     *      "https://developer.apple.com/documentation/advancedcommerceapi/onetimechargecreaterequest">storefront</a>
     **/
    public String getStorefront() {
        return storefront;
    }

    public void setStorefront(String storefront) {
        this.storefront = storefront;
    }

    @Override
    protected AdvancedCommerceSubscriptionRevokeRequest self() {
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        AdvancedCommerceSubscriptionRevokeRequest that = (AdvancedCommerceSubscriptionRevokeRequest) o;
        return Objects.equals(refundReason, that.refundReason)
                && Objects.equals(refundRiskingPreference, that.refundRiskingPreference)
                && Objects.equals(refundType, that.refundType) && Objects.equals(requestInfo, that.requestInfo)
                && Objects.equals(storefront, that.storefront);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refundReason, refundRiskingPreference, refundType, requestInfo, storefront);
    }

    @Override
    public String toString() {
        return "AdvancedCommerceSubscriptionRevokeRequest{" +
                "refundReason=" + refundReason +
                ", refundRiskingPreference=" + refundRiskingPreference +
                ", refundType='" + refundType + '\'' +
                ", requestInfo=" + requestInfo +
                ", storefront='" + storefront + '\'' +
                '}';
    }
}