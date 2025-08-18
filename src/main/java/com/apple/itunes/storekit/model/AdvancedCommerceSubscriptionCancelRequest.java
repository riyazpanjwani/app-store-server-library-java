// Copyright (c) 2025 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * The request data your app provides to cancel an auto-renewable subscription.
 *
 * @see <a href=
 *      "https://developer.apple.com/documentation/advancedcommerceapi/subscriptioncancelrequest">SubscriptionCancelRequest</a>
 */
public class AdvancedCommerceSubscriptionCancelRequest
        extends AdvancedCommerceRequest<AdvancedCommerceSubscriptionCancelRequest> {
    private static final String SERIALIZED_NAME_REQUEST_INFO = "requestInfo";
    private static final String SERIALIZED_NAME_STOREFRONT = "storefront";

    @JsonProperty(SERIALIZED_NAME_STOREFRONT)
    private String storefront;
    @JsonProperty(value = SERIALIZED_NAME_REQUEST_INFO, required = true)
    private AdvancedCommerceRequestInfo requestInfo;

    public AdvancedCommerceSubscriptionCancelRequest() {
    }

    public AdvancedCommerceSubscriptionCancelRequest(AdvancedCommerceRequestInfo requestInfo) {
        this.requestInfo = Objects.requireNonNull(requestInfo);
    }

    public AdvancedCommerceSubscriptionCancelRequest storefront(String storefront) {
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

    public AdvancedCommerceSubscriptionCancelRequest requestInfo(AdvancedCommerceRequestInfo requestInfo) {
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

    @Override
    protected AdvancedCommerceSubscriptionCancelRequest self() {
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        AdvancedCommerceSubscriptionCancelRequest that = (AdvancedCommerceSubscriptionCancelRequest) o;
        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "AdvancedCommerceSubscriptionCancelRequest{" +
                "requestInfo=" + getRequestInfo() +
                ", storefront='" + getStorefront() + '\'' +
                '}';
    }
}