// Copyright (c) 2025 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

/**
 * The response data for a subscription metadata change request.
 *
 * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/subscriptionchangemetadataresponse">SubscriptionChangeMetadataResponse</a>
 */
public class AdvancedCommerceSubscriptionChangeMetadataResponse extends AbstractAdvancedCommerceResponse {

    public AdvancedCommerceSubscriptionChangeMetadataResponse() {
        super();
    }

    public AdvancedCommerceSubscriptionChangeMetadataResponse(String signedRenewalInfo, String signedTransactionInfo) {
        super(signedRenewalInfo, signedTransactionInfo);
    }

    public AdvancedCommerceSubscriptionChangeMetadataResponse signedRenewalInfo(String signedRenewalInfo) {
        setSignedRenewalInfo(signedRenewalInfo);
        return this;
    }

    public AdvancedCommerceSubscriptionChangeMetadataResponse signedTransactionInfo(String signedTransactionInfo) {
        setSignedTransactionInfo(signedTransactionInfo);
        return this;
    }
}