// Copyright (c) 2025 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;
import java.util.Objects;

/**
 * A discount offer for an auto-renewable subscription.
 *
 * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/offer">Offer</a>
 */
public class AdvancedCommerceOffer {

    private static final String SERIALIZED_NAME_PERIOD = "period";
    private static final String SERIALIZED_NAME_PERIOD_COUNT = "periodCount";
    private static final String SERIALIZED_NAME_PRICE = "price";
    private static final String SERIALIZED_NAME_REASON = "reason";

    @JsonProperty(SERIALIZED_NAME_PERIOD)
    private String period;
    @JsonProperty(SERIALIZED_NAME_PERIOD_COUNT)
    private Integer periodCount;
    @JsonProperty(SERIALIZED_NAME_PRICE)
    private Long price;
    @JsonProperty(SERIALIZED_NAME_REASON)
    private String reason;
    @JsonAnySetter
    private Map<String, Object> unknownFields;

    public AdvancedCommerceOffer() {}

    public AdvancedCommerceOffer period(AdvancedCommerceOfferPeriod period) {
        this.period = period != null ? period.getValue() : null;
        return this;
    }

    /**
     * The period of the offer.
     * 
     * @return period
     **/
    public AdvancedCommerceOfferPeriod getPeriod() {
        return period != null ? AdvancedCommerceOfferPeriod.fromValue(period) : null;
    }

    /** The string representation of the period.
     * 
     * @see #getPeriod()
     */
    public String getRawPeriod() {
        return period;
    }

    public void setPeriod(AdvancedCommerceOfferPeriod period) {
        this.period = period != null ? period.getValue() : null;
    }

    public void setRawPeriod(String rawPeriod) {
        this.period = rawPeriod;
    }

    public AdvancedCommerceOffer periodCount(Integer periodCount) {
        this.periodCount = periodCount;
        return this;
    }

    /**
     * The number of periods the offer is active.
     * 
     * @return periodCount
     **/
    public Integer getPeriodCount() {
        return periodCount;
    }

    public void setPeriodCount(Integer periodCount) {
        this.periodCount = periodCount;
    }

    public AdvancedCommerceOffer price(Long price) {
        this.price = price;
        return this;
    }

    /**
     * The offer price, in milliunits.
     * 
     * @return price
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/price">Price</a>
     **/
    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public AdvancedCommerceOffer reason(AdvancedCommerceOfferReason reason) {
        this.reason = reason != null ? reason.getValue() : null;
        return this;
    }

    /**
     * The reason for the offer.
     * 
     * @return reason
     **/
    public AdvancedCommerceOfferReason getReason() {
        return reason != null ? AdvancedCommerceOfferReason.fromValue(reason) : null;
    }

    /**
     * The string representation of the reason.
     * 
     * @see #getReason()
     */
    public String getRawReason() {
        return reason;
    }

    public void setReason(AdvancedCommerceOfferReason reason) {
        this.reason = reason != null ? reason.getValue() : null;
    }

    public void setRawReason(String rawReason) {
        this.reason = rawReason;
    }

    public AdvancedCommerceOffer unknownFields(Map<String, Object> unknownFields) {
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
        AdvancedCommerceOffer that = (AdvancedCommerceOffer) o;
        return Objects.equals(period, that.period) && Objects.equals(periodCount, that.periodCount) && Objects.equals(price, that.price) && Objects.equals(reason, that.reason) && Objects.equals(unknownFields, that.unknownFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(period, periodCount, price, reason, unknownFields);
    }

    @Override
    public String toString() {
        return "AdvancedCommerceOffer{" +
                "period='" + period + '\'' +
                ", periodCount=" + periodCount +
                ", price=" + price +
                ", reason='" + reason + '\'' +
                ", unknownFields=" + unknownFields +
                '}';
    }
}