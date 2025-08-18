// Copyright (c) 2025 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

/**
 * The response data for a subscription cancellation request.
 *
 * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/subscriptioncancelresponse">SubscriptionCancelResponse</a>
 */
public class AdvancedCommerceSubscriptionCancelResponse extends AbstractAdvancedCommerceResponse {

    public AdvancedCommerceSubscriptionCancelResponse() {
        super();
    }

    public AdvancedCommerceSubscriptionCancelResponse(String signedRenewalInfo, String signedTransactionInfo) {
        super(signedRenewalInfo, signedTransactionInfo);
    }

    public AdvancedCommerceSubscriptionCancelResponse signedRenewalInfo(String signedRenewalInfo) {
        setSignedRenewalInfo(signedRenewalInfo);
        return this;
    }

    public AdvancedCommerceSubscriptionCancelResponse signedTransactionInfo(String signedTransactionInfo) {
        setSignedTransactionInfo(signedTransactionInfo);
        return this;
    }
}