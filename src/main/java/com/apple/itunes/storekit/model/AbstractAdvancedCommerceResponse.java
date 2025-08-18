// Copyright (c) 2025 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public abstract class AbstractAdvancedCommerceResponse {

    private static final String SERIALIZED_NAME_SIGNED_RENEWAL_INFO = "signedRenewalInfo";
    private static final String SERIALIZED_NAME_SIGNED_TRANSACTION_INFO = "signedTransactionInfo";

    @JsonProperty(SERIALIZED_NAME_SIGNED_RENEWAL_INFO)
    private String signedRenewalInfo;
    @JsonProperty(SERIALIZED_NAME_SIGNED_TRANSACTION_INFO)
    private String signedTransactionInfo;

    protected AbstractAdvancedCommerceResponse() {}

    protected AbstractAdvancedCommerceResponse(String signedRenewalInfo, String signedTransactionInfo) {
        this.signedRenewalInfo = signedRenewalInfo;
        this.signedTransactionInfo = signedTransactionInfo;
    }

    /**
     * A response that contains signed renewal and transaction information after a subscription successfully migrates to the Advanced Commerce API.
     *
     * @return signedRenewalInfo
     * @see <a href="https://developer.apple.com/documentation/appstoreserverapi/jwsrenewalinfo">JWSRenewalInfo</a>
     **/
    public String getSignedRenewalInfo() {
        return signedRenewalInfo;
    }

    public void setSignedRenewalInfo(String signedRenewalInfo) {
        this.signedRenewalInfo = signedRenewalInfo;
    }

    /**
     * Transaction information signed by the App Store, in JSON Web Signature (JWS) Compact Serialization format.
     *
     * @return signedTransactionInfo
     * @see <a href="https://developer.apple.com/documentation/appstoreserverapi/jwstransaction">JWSTransaction</a>
     **/
    public String getSignedTransactionInfo() {
        return signedTransactionInfo;
    }

    public void setSignedTransactionInfo(String signedTransactionInfo) {
        this.signedTransactionInfo = signedTransactionInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractAdvancedCommerceResponse that = (AbstractAdvancedCommerceResponse) o;
        return Objects.equals(signedRenewalInfo, that.signedRenewalInfo) && Objects.equals(signedTransactionInfo, that.signedTransactionInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(signedRenewalInfo, signedTransactionInfo);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "signedRenewalInfo='" + signedRenewalInfo + '\'' +
                ", signedTransactionInfo='" + signedTransactionInfo + '\'' +
                '}';
    }
}