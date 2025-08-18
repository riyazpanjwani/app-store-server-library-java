// Copyright (c) 2025 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

/**
 * The response data for a refund request.
 *
 * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/requestrefundresponse">RequestRefundResponse</a>
 */
public class AdvancedCommerceRequestRefundResponse extends AbstractAdvancedCommerceResponse {

    public AdvancedCommerceRequestRefundResponse() {
        super();
    }

    public AdvancedCommerceRequestRefundResponse(String signedRenewalInfo, String signedTransactionInfo) {
        super(signedRenewalInfo, signedTransactionInfo);
    }

    public AdvancedCommerceRequestRefundResponse signedRenewalInfo(String signedRenewalInfo) {
        setSignedRenewalInfo(signedRenewalInfo);
        return this;
    }

    public AdvancedCommerceRequestRefundResponse signedTransactionInfo(String signedTransactionInfo) {
        setSignedTransactionInfo(signedTransactionInfo);
        return this;
    }
}