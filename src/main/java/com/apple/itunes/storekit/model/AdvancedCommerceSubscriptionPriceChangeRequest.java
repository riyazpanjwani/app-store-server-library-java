// Copyright (c) 2025 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The request data your app provides to change the price of items in an auto-renewable subscription.
 *
 * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/subscriptionpricechangerequest">SubscriptionPriceChangeRequest</a>
 */
public class AdvancedCommerceSubscriptionPriceChangeRequest extends AdvancedCommerceRequest<AdvancedCommerceSubscriptionPriceChangeRequest> {

    private static final String SERIALIZED_NAME_CURRENCY = "currency";
    private static final String SERIALIZED_NAME_ITEMS = "items";
    private static final String SERIALIZED_NAME_STOREFRONT = "storefront";

    @JsonProperty(SERIALIZED_NAME_CURRENCY)
    private String currency;
    @JsonProperty(value = SERIALIZED_NAME_ITEMS, required = true)
    private List<AdvancedCommerceSubscriptionPriceChangeItem> items;
    @JsonProperty(SERIALIZED_NAME_STOREFRONT)
    private String storefront;
    public AdvancedCommerceSubscriptionPriceChangeRequest() {}

    public AdvancedCommerceSubscriptionPriceChangeRequest(
            AdvancedCommerceRequestInfo requestInfo,
            List<AdvancedCommerceSubscriptionPriceChangeItem> items
    ) {
        super(requestInfo);
        this.items = Objects.requireNonNull(items);
    }

    @Override
    public AdvancedCommerceSubscriptionPriceChangeRequest self() {
        return this;
    }

    public AdvancedCommerceSubscriptionPriceChangeRequest currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * The currency of the price of the product.
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

    public AdvancedCommerceSubscriptionPriceChangeRequest items(List<AdvancedCommerceSubscriptionPriceChangeItem> items) {
        this.items = Objects.requireNonNull(items);
        return this;
    }

    public AdvancedCommerceSubscriptionPriceChangeRequest addItem(AdvancedCommerceSubscriptionPriceChangeItem item) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(item);
        return this;
    }

    /**
     * The list of items to change the price of in the subscription.
     *
     * @return items
     **/
    public List<AdvancedCommerceSubscriptionPriceChangeItem> getItems() {
        return items;
    }

    public void setItems(List<AdvancedCommerceSubscriptionPriceChangeItem> items) {
        this.items = Objects.requireNonNull(items);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AdvancedCommerceSubscriptionPriceChangeRequest that = (AdvancedCommerceSubscriptionPriceChangeRequest) o;
        return Objects.equals(currency, that.currency) && Objects.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), currency, items);
    }

    @Override
    public String toString() {
        return "AdvancedCommerceSubscriptionPriceChangeRequest{" +
                "currency='" + currency + '\'' +
                ", items=" + items +
                ", requestInfo=" + getRequestInfo() +
                ", storefront='" + storefront + '\'' +
                '}';
    }
}