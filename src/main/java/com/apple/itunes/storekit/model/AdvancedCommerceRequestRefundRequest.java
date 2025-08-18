// Copyright (c) 2025 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The request data your app provides to request refunds for items.
 *
 * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/requestrefundrequest">RequestRefundRequest</a>
 */
public class AdvancedCommerceRequestRefundRequest extends AdvancedCommerceRequest<AdvancedCommerceRequestRefundRequest> {

    private static final String SERIALIZED_NAME_CURRENCY = "currency";
    private static final String SERIALIZED_NAME_ITEMS = "items";
    private static final String SERIALIZED_NAME_REFUND_RISKING_PREFERENCE = "refundRiskingPreference";
    private static final String SERIALIZED_NAME_STOREFRONT = "storefront";
    @JsonProperty(SERIALIZED_NAME_CURRENCY)
    private String currency;
    @JsonProperty(value = SERIALIZED_NAME_ITEMS, required = true)
    private List<AdvancedCommerceRequestRefundItem> items;
    @JsonProperty(value = SERIALIZED_NAME_REFUND_RISKING_PREFERENCE, required = true)
    private Boolean refundRiskingPreference;
    @JsonProperty(SERIALIZED_NAME_STOREFRONT)
    private String storefront;

    public AdvancedCommerceRequestRefundRequest() {}

    public AdvancedCommerceRequestRefundRequest(
            List<AdvancedCommerceRequestRefundItem> items,
            Boolean refundRiskingPreference,
            AdvancedCommerceRequestInfo requestInfo
    ) {
        super(requestInfo);
        this.items = Objects.requireNonNull(items);
        this.refundRiskingPreference = Objects.requireNonNull(refundRiskingPreference);
    }

    public AdvancedCommerceRequestRefundRequest currency(String currency) {
        this.currency = AdvancedCommerceValidationUtils.validateCurrency(currency);
        return this;
    }

    @Override
    public AdvancedCommerceRequestRefundRequest self() {
        return this;
    }

    /**
     * The currency of the refund amount.
     *
     * @return currency
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/currency">currency</a>
     **/
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = AdvancedCommerceValidationUtils.validateCurrency(currency);
    }

    public AdvancedCommerceRequestRefundRequest items(List<AdvancedCommerceRequestRefundItem> items) {
        this.items = Objects.requireNonNull(items);
        return this;
    }

    public AdvancedCommerceRequestRefundRequest addItem(AdvancedCommerceRequestRefundItem item) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(item);
        return this;
    }

    /**
     * The list of items to request refunds for.
     *
     * @return items
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/requestrefunditem">RequestRefundItem</a>
     **/
    public List<AdvancedCommerceRequestRefundItem> getItems() {
        return items;
    }

    public void setItems(List<AdvancedCommerceRequestRefundItem> items) {
        this.items = Objects.requireNonNull(items);
    }

    public AdvancedCommerceRequestRefundRequest refundRiskingPreference(Boolean refundRiskingPreference) {
        this.refundRiskingPreference = Objects.requireNonNull(refundRiskingPreference);
        return this;
    }

    /**
     * A Boolean value that indicates the refund risking preference.
     *
     * @return refundRiskingPreference
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/refundriskingpreference">RefundRiskingPreference</a>
     **/
    public Boolean getRefundRiskingPreference() {
        return refundRiskingPreference;
    }

    public void setRefundRiskingPreference(Boolean refundRiskingPreference) {
        this.refundRiskingPreference = Objects.requireNonNull(refundRiskingPreference);
    }


    public AdvancedCommerceRequestRefundRequest storefront(String storefront) {
        this.storefront = storefront;
        return this;
    }

    /**
     * The storefront for the transaction.
     *
     * @return storefront
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/storefront">storefront</a>
     **/
    public String getStorefront() {
        return storefront;
    }

    public void setStorefront(String storefront) {
        this.storefront = storefront;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdvancedCommerceRequestRefundRequest that = (AdvancedCommerceRequestRefundRequest) o;
        return Objects.equals(currency, that.currency) && Objects.equals(items, that.items) && Objects.equals(refundRiskingPreference, that.refundRiskingPreference) && Objects.equals(storefront, that.storefront);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), currency, items, refundRiskingPreference, storefront);
    }

    @Override
    public String toString() {
        return "AdvancedCommerceRequestRefundRequest{" +
                "currency='" + currency + '\'' +
                ", items=" + items +
                ", refundRiskingPreference=" + refundRiskingPreference +
                ", requestInfo=" + getRequestInfo() +
                ", storefront='" + storefront + '\'' +
                '}';
    }
}