// Copyright (c) 2025 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * A discount offer for an auto-renewable subscription.
 *
 * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/offer">Offer</a>
 */
public class AdvancedCommerceRequestOffer {

    private static final String SERIALIZED_NAME_PERIOD = "period";
    private static final String SERIALIZED_NAME_PERIOD_COUNT = "periodCount";
    private static final String SERIALIZED_NAME_PRICE = "price";
    private static final String SERIALIZED_NAME_REASON = "reason";

    @JsonProperty(value = SERIALIZED_NAME_PERIOD, required = true)
    private AdvancedCommerceOfferPeriod period;
    @JsonProperty(value = SERIALIZED_NAME_PERIOD_COUNT, required = true)
    private int periodCount;
    @JsonProperty(value = SERIALIZED_NAME_PRICE, required = true)
    private long price;
    @JsonProperty(value = SERIALIZED_NAME_REASON, required = true)
    private AdvancedCommerceOfferReason reason;

    private AdvancedCommerceRequestOffer() {}

    public AdvancedCommerceRequestOffer(AdvancedCommerceOfferPeriod period, int periodCount, long price, AdvancedCommerceOfferReason reason) {
        this.period = period;
        this.periodCount = periodCount;
        this.price = price;
        this.reason = reason;
    }

    public AdvancedCommerceRequestOffer period(AdvancedCommerceOfferPeriod period) {
        this.period = Objects.requireNonNull(period);
        return this;
    }

    /**
     * The period of the offer.
     *
     * @return period
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/offer">Offer</a>
     **/
    public AdvancedCommerceOfferPeriod getPeriod() {
        return period;
    }

    public void setPeriod(AdvancedCommerceOfferPeriod period) {
        this.period = Objects.requireNonNull(period);
    }

    public AdvancedCommerceRequestOffer periodCount(int periodCount) {
        this.periodCount = periodCount;
        return this;
    }

    /**
     * The number of periods the offer is active.
     *
     * @return periodCount
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/offer">Offer</a>
     **/
    public int getPeriodCount() {
        return periodCount;
    }

    public void setPeriodCount(int periodCount) {
        this.periodCount = periodCount;
    }

    public AdvancedCommerceRequestOffer price(long price) {
        this.price = price;
        return this;
    }

    /**
     * The price in milliunits.
     *
     * @return price
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/price">price</a>
     **/
    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public AdvancedCommerceRequestOffer reason(AdvancedCommerceOfferReason reason) {
        this.reason = Objects.requireNonNull(reason);
        return this;
    }

    /**
     * The reason for the offer.
     *
     * @return reason
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/offer">Offer</a>
     **/
    public AdvancedCommerceOfferReason getReason() {
        return reason;
    }

    public void setReason(AdvancedCommerceOfferReason reason) {
        this.reason = Objects.requireNonNull(reason);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdvancedCommerceRequestOffer that = (AdvancedCommerceRequestOffer) o;
        return periodCount == that.periodCount && price == that.price && period == that.period && reason == that.reason;
    }

    @Override
    public int hashCode() {
        return Objects.hash(period, periodCount, price, reason);
    }

    @Override
    public String toString() {
        return "AdvancedCommerceOffer{" +
                "period=" + period +
                ", periodCount=" + periodCount +
                ", price=" + price +
                ", reason=" + reason +
                '}';
    }
}