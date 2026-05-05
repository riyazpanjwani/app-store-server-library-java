// Copyright (c) 2026 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Map;
import java.util.Objects;

/**
 * @see <a href="https://developer.apple.com/documentation/appstoreserverapi/renewalcommitmentinfo">RenewalCommitmentInfo</a>
 */
public class RenewalCommitmentInfo {

    private static final String SERIALIZED_NAME_COMMITMENT_AUTO_RENEW_PRODUCT_ID = "commitmentAutoRenewProductId";
    private static final String SERIALIZED_NAME_COMMITMENT_AUTO_RENEW_STATUS = "commitmentAutoRenewStatus";
    private static final String SERIALIZED_NAME_COMMITMENT_RENEWAL_BILLING_PLAN_TYPE = "commitmentRenewalBillingPlanType";
    private static final String SERIALIZED_NAME_COMMITMENT_RENEWAL_DATE = "commitmentRenewalDate";
    private static final String SERIALIZED_NAME_COMMITMENT_RENEWAL_PRICE = "commitmentRenewalPrice";

    @JsonProperty(SERIALIZED_NAME_COMMITMENT_AUTO_RENEW_PRODUCT_ID)
    private String commitmentAutoRenewProductId;
    @JsonProperty(SERIALIZED_NAME_COMMITMENT_AUTO_RENEW_STATUS)
    private Integer commitmentAutoRenewStatus;
    @JsonProperty(SERIALIZED_NAME_COMMITMENT_RENEWAL_BILLING_PLAN_TYPE)
    private String commitmentRenewalBillingPlanType;
    @JsonProperty(SERIALIZED_NAME_COMMITMENT_RENEWAL_DATE)
    @JsonDeserialize(using = XcodeCompatibleTimestampDeserializer.class)
    private Long commitmentRenewalDate;
    @JsonProperty(SERIALIZED_NAME_COMMITMENT_RENEWAL_PRICE)
    private Long commitmentRenewalPrice;
    @JsonAnySetter
    private Map<String, Object> unknownFields;

    public RenewalCommitmentInfo() {
    }

    public RenewalCommitmentInfo commitmentAutoRenewProductId(String commitmentAutoRenewProductId) {
        this.commitmentAutoRenewProductId = commitmentAutoRenewProductId;
        return this;
    }

    /**
     * @return commitmentAutoRenewProductId
     * @see <a href="https://developer.apple.com/documentation/appstoreserverapi/commitmentautorenewproductid">commitmentAutoRenewProductId</a>
     **/
    public String getCommitmentAutoRenewProductId() {
        return commitmentAutoRenewProductId;
    }

    public void setCommitmentAutoRenewProductId(String commitmentAutoRenewProductId) {
        this.commitmentAutoRenewProductId = commitmentAutoRenewProductId;
    }

    public RenewalCommitmentInfo commitmentAutoRenewStatus(AutoRenewStatus commitmentAutoRenewStatus) {
        this.commitmentAutoRenewStatus = commitmentAutoRenewStatus != null ? commitmentAutoRenewStatus.getValue() : null;
        return this;
    }

    /**
     * @return commitmentAutoRenewStatus
     * @see <a href="https://developer.apple.com/documentation/appstoreserverapi/commitmentautorenewstatus">commitmentAutoRenewStatus</a>
     **/
    public AutoRenewStatus getCommitmentAutoRenewStatus() {
        return commitmentAutoRenewStatus != null ? AutoRenewStatus.fromValue(commitmentAutoRenewStatus) : null;
    }

    /**
     * @see #getCommitmentAutoRenewStatus()
     */
    public Integer getRawCommitmentAutoRenewStatus() {
        return commitmentAutoRenewStatus;
    }

    public void setCommitmentAutoRenewStatus(AutoRenewStatus commitmentAutoRenewStatus) {
        this.commitmentAutoRenewStatus = commitmentAutoRenewStatus != null ? commitmentAutoRenewStatus.getValue() : null;
    }

    public void setRawCommitmentAutoRenewStatus(Integer rawCommitmentAutoRenewStatus) {
        this.commitmentAutoRenewStatus = rawCommitmentAutoRenewStatus;
    }

    public RenewalCommitmentInfo commitmentRenewalBillingPlanType(RenewalBillingPlanType commitmentRenewalBillingPlanType) {
        this.commitmentRenewalBillingPlanType = commitmentRenewalBillingPlanType != null ? commitmentRenewalBillingPlanType.getValue() : null;
        return this;
    }

    /**
     * @return commitmentRenewalBillingPlanType
     * @see <a href="https://developer.apple.com/documentation/appstoreserverapi/commitmentrenewalbillingplantype">commitmentRenewalBillingPlanType</a>
     **/
    public RenewalBillingPlanType getCommitmentRenewalBillingPlanType() {
        return commitmentRenewalBillingPlanType != null ? RenewalBillingPlanType.fromValue(commitmentRenewalBillingPlanType) : null;
    }

    /**
     * @see #getCommitmentRenewalBillingPlanType()
     */
    public String getRawCommitmentRenewalBillingPlanType() {
        return commitmentRenewalBillingPlanType;
    }

    public void setCommitmentRenewalBillingPlanType(RenewalBillingPlanType commitmentRenewalBillingPlanType) {
        this.commitmentRenewalBillingPlanType = commitmentRenewalBillingPlanType != null ? commitmentRenewalBillingPlanType.getValue() : null;
    }

    public void setRawCommitmentRenewalBillingPlanType(String rawCommitmentRenewalBillingPlanType) {
        this.commitmentRenewalBillingPlanType = rawCommitmentRenewalBillingPlanType;
    }

    public RenewalCommitmentInfo commitmentRenewalDate(Long commitmentRenewalDate) {
        this.commitmentRenewalDate = commitmentRenewalDate;
        return this;
    }

    /**
     * @return commitmentRenewalDate
     * @see <a href="https://developer.apple.com/documentation/appstoreserverapi/commitmentrenewaldate">commitmentRenewalDate</a>
     **/
    public Long getCommitmentRenewalDate() {
        return commitmentRenewalDate;
    }

    public void setCommitmentRenewalDate(Long commitmentRenewalDate) {
        this.commitmentRenewalDate = commitmentRenewalDate;
    }

    public RenewalCommitmentInfo commitmentRenewalPrice(Long commitmentRenewalPrice) {
        this.commitmentRenewalPrice = commitmentRenewalPrice;
        return this;
    }

    /**
     * @return commitmentRenewalPrice
     * @see <a href="https://developer.apple.com/documentation/appstoreserverapi/commitmentrenewalprice">commitmentRenewalPrice</a>
     **/
    public Long getCommitmentRenewalPrice() {
        return commitmentRenewalPrice;
    }

    public void setCommitmentRenewalPrice(Long commitmentRenewalPrice) {
        this.commitmentRenewalPrice = commitmentRenewalPrice;
    }

    public RenewalCommitmentInfo unknownFields(Map<String, Object> unknownFields) {
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
        RenewalCommitmentInfo that = (RenewalCommitmentInfo) o;
        return Objects.equals(commitmentAutoRenewProductId, that.commitmentAutoRenewProductId) && Objects.equals(commitmentAutoRenewStatus, that.commitmentAutoRenewStatus) && Objects.equals(commitmentRenewalBillingPlanType, that.commitmentRenewalBillingPlanType) && Objects.equals(commitmentRenewalDate, that.commitmentRenewalDate) && Objects.equals(commitmentRenewalPrice, that.commitmentRenewalPrice) && Objects.equals(unknownFields, that.unknownFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commitmentAutoRenewProductId, commitmentAutoRenewStatus, commitmentRenewalBillingPlanType, commitmentRenewalDate, commitmentRenewalPrice, unknownFields);
    }

    @Override
    public String toString() {
        return "RenewalCommitmentInfo{" +
                "commitmentAutoRenewProductId='" + commitmentAutoRenewProductId + '\'' +
                ", commitmentAutoRenewStatus=" + commitmentAutoRenewStatus +
                ", commitmentRenewalBillingPlanType='" + commitmentRenewalBillingPlanType + '\'' +
                ", commitmentRenewalDate=" + commitmentRenewalDate +
                ", commitmentRenewalPrice=" + commitmentRenewalPrice +
                ", unknownFields=" + unknownFields +
                '}';
    }
}
