// Copyright (c) 2025 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * The data your app provides to change the billing period of an auto-renewable subscription.
 *
 * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/subscriptionmodifyperiodchange">SubscriptionModifyPeriodChange</a>
 */
public class AdvancedCommerceSubscriptionModifyPeriodChange {

    private static final String SERIALIZED_NAME_EFFECTIVE = "effective";
    private static final String SERIALIZED_NAME_PERIOD = "period";

    @JsonProperty(SERIALIZED_NAME_EFFECTIVE)
    private AdvancedCommerceEffective effective;
    @JsonProperty(SERIALIZED_NAME_PERIOD)
    private AdvancedCommercePeriod period;

    public AdvancedCommerceSubscriptionModifyPeriodChange() {}

    public AdvancedCommerceSubscriptionModifyPeriodChange(
            AdvancedCommerceEffective effective,
            AdvancedCommercePeriod period
    ) {
        this.effective = effective;
        this.period = period;
    }

    public AdvancedCommerceSubscriptionModifyPeriodChange effective(AdvancedCommerceEffective effective) {
        this.effective = effective;
        return this;
    }

    /**
     * A value that indicates when the change takes effect.
     *
     * @return effective
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/effective">Effective</a>
     **/
    public AdvancedCommerceEffective getEffective() {
        return effective;
    }

    public void setEffective(AdvancedCommerceEffective effective) {
        this.effective = effective;
    }

    public AdvancedCommerceSubscriptionModifyPeriodChange period(AdvancedCommercePeriod period) {
        this.period = period;
        return this;
    }

    /**
     * The billing period for an auto-renewable subscription.
     *
     * @return period
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/period">Period</a>
     **/
    public AdvancedCommercePeriod getPeriod() {
        return period;
    }

    public void setPeriod(AdvancedCommercePeriod period) {
        this.period = period;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdvancedCommerceSubscriptionModifyPeriodChange that = (AdvancedCommerceSubscriptionModifyPeriodChange) o;
        return Objects.equals(effective, that.effective) && Objects.equals(period, that.period);
    }

    @Override
    public int hashCode() {
        return Objects.hash(effective, period);
    }

    @Override
    public String toString() {
        return "AdvancedCommerceSubscriptionModifyPeriodChange{" +
                "effective=" + effective +
                ", period=" + period +
                '}';
    }
}