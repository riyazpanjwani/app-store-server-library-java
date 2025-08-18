// Copyright (c) 2025 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The metadata your app provides when a customer purchases an auto-renewable subscription.
 *
 * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/subscriptioncreaterequest">SubscriptionCreateRequest</a>
 */
public class AdvancedCommerceSubscriptionCreateRequest extends AbstractAdvancedCommerceInAppRequest<AdvancedCommerceSubscriptionCreateRequest> {
    private static final String OPERATION = "CREATE_SUBSCRIPTION";
    private static final String VERSION = "1";

    private static final String SERIALIZED_NAME_CURRENCY = "currency";
    private static final String SERIALIZED_NAME_DESCRIPTORS = "descriptors";
    private static final String SERIALIZED_NAME_ITEMS = "items";
    private static final String SERIALIZED_NAME_PERIOD = "period";
    private static final String SERIALIZED_NAME_PREVIOUS_TRANSACTION_ID = "previousTransactionId";
    private static final String SERIALIZED_NAME_STOREFRONT = "storefront";
    private static final String SERIALIZED_NAME_TAX_CODE = "taxCode";

    @JsonProperty(value = SERIALIZED_NAME_CURRENCY, required = true)
    private String currency;
    @JsonProperty(value = SERIALIZED_NAME_DESCRIPTORS, required = true)
    private AdvancedCommerceDescriptors descriptors;
    @JsonProperty(value = SERIALIZED_NAME_ITEMS, required = true)
    private List<AdvancedCommerceSubscriptionCreateItem> items;
    @JsonProperty(value = SERIALIZED_NAME_PERIOD, required = true)
    private AdvancedCommercePeriod period;
    @JsonProperty(SERIALIZED_NAME_PREVIOUS_TRANSACTION_ID)
    private String previousTransactionId;
    @JsonProperty(SERIALIZED_NAME_STOREFRONT)
    private String storefront;
    @JsonProperty(value = SERIALIZED_NAME_TAX_CODE, required = true)
    private String taxCode;

    public AdvancedCommerceSubscriptionCreateRequest() {}

    public AdvancedCommerceSubscriptionCreateRequest(
            String currency,
            AdvancedCommerceDescriptors descriptors,
            List<AdvancedCommerceSubscriptionCreateItem> items,
            AdvancedCommercePeriod period,
            AdvancedCommerceRequestInfo requestInfo,
            String taxCode
    ) {
        super(OPERATION, VERSION, requestInfo);
        this.currency = AdvancedCommerceValidationUtils.validateCurrency(currency);
        this.descriptors = Objects.requireNonNull(descriptors);
        this.items = validateItems(items);
        this.period = Objects.requireNonNull(period);
        this.taxCode = AdvancedCommerceValidationUtils.validateTaxCode(taxCode);
    }

    @Override
    protected AdvancedCommerceSubscriptionCreateRequest self() {
        return this;
    }

    public AdvancedCommerceSubscriptionCreateRequest currency(String currency) {
        this.currency = AdvancedCommerceValidationUtils.validateCurrency(currency);
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

    public AdvancedCommerceSubscriptionCreateRequest descriptors(AdvancedCommerceDescriptors descriptors) {
        this.descriptors = Objects.requireNonNull(descriptors);
        return this;
    }

    /**
     * The display name and description of a subscription product.
     *
     * @return descriptors
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/descriptors">Descriptors</a>
     **/
    public AdvancedCommerceDescriptors getDescriptors() {
        return descriptors;
    }

    public void setDescriptors(AdvancedCommerceDescriptors descriptors) {
        this.descriptors = Objects.requireNonNull(descriptors);
    }

    public AdvancedCommerceSubscriptionCreateRequest items(List<AdvancedCommerceSubscriptionCreateItem> items) {
        this.items = validateItems(items);
        return this;
    }

    public AdvancedCommerceSubscriptionCreateRequest addItem(AdvancedCommerceSubscriptionCreateItem item) {
        Objects.requireNonNull(item, "Item cannot be null");
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(item);
        return this;
    }


    /**
     * The details of the subscription product for purchase.
     *
     * @return items
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/subscriptioncreateitem">SubscriptionCreateItem</a>
     **/
    public List<AdvancedCommerceSubscriptionCreateItem> getItems() {
        return items;
    }

    public void setItems(List<AdvancedCommerceSubscriptionCreateItem> items) {
        this.items = validateItems(items);
    }

    private List<AdvancedCommerceSubscriptionCreateItem> validateItems(List<AdvancedCommerceSubscriptionCreateItem> items) {
        Objects.requireNonNull(items, "Items list cannot be null");
        if (items.isEmpty()) {
            throw new IllegalArgumentException("Items list cannot be empty");
        }
        for (AdvancedCommerceSubscriptionCreateItem item : items) {
            Objects.requireNonNull(item, "Item in list cannot be null");
        }
        return items;
    }

    public AdvancedCommerceSubscriptionCreateRequest period(AdvancedCommercePeriod period) {
        this.period = Objects.requireNonNull(period);
        return this;
    }

    /**
     * The duration of a single cycle of an auto-renewable subscription.
     *
     * @return period
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/period">period</a>
     **/
    public AdvancedCommercePeriod getPeriod() {
        return period;
    }

    public void setPeriod(AdvancedCommercePeriod period) {
        this.period = Objects.requireNonNull(period);
    }

    public AdvancedCommerceSubscriptionCreateRequest previousTransactionId(String previousTransactionId) {
        this.previousTransactionId = validatePreviousTransactionId(previousTransactionId);
        return this;
    }

    /**
     * The identifier of a previous transaction for the subscription.
     * 
     * @return previousTransactionId
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/transactionid">transactionId</a>
     **/
    public String getPreviousTransactionId() {
        return previousTransactionId;
    }

    public void setPreviousTransactionId(String previousTransactionId) {
        this.previousTransactionId = validatePreviousTransactionId(previousTransactionId);
    }

    private String validatePreviousTransactionId(String previousTransactionId) {
        Objects.requireNonNull(previousTransactionId, "Previous transaction ID cannot be null");
        return previousTransactionId;
    }

    public AdvancedCommerceSubscriptionCreateRequest storefront(String storefront) {
        this.storefront = Objects.requireNonNull(storefront);
        return this;
    }

    /**
     * The storefront for the transaction.
     *
     * @return storefront
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/onetimechargecreaterequest">storefront</a>
     **/
    public String getStorefront() {
        return storefront;
    }

    public void setStorefront(String storefront) {
        this.storefront = Objects.requireNonNull(storefront);
    }

    public AdvancedCommerceSubscriptionCreateRequest taxCode(String taxCode) {
        this.taxCode = AdvancedCommerceValidationUtils.validateTaxCode(taxCode);
        return this;
    }

    /**
     * The tax code for this product.
     *
     * @return taxCode
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/onetimechargecreaterequest">taxCode</a>
     **/
    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = validateTaxCode(taxCode);
    }

    private String validateTaxCode(String taxCode) {
        Objects.requireNonNull(taxCode, "Tax code cannot be null");
        if (taxCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Tax code cannot be empty");
        }
        return taxCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AdvancedCommerceSubscriptionCreateRequest that = (AdvancedCommerceSubscriptionCreateRequest) o;
        return Objects.equals(currency, that.currency) && Objects.equals(descriptors, that.descriptors) && Objects.equals(items, that.items) && period == that.period && Objects.equals(previousTransactionId, that.previousTransactionId) && Objects.equals(storefront, that.storefront) && Objects.equals(taxCode, that.taxCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), currency, descriptors, items, period, previousTransactionId, storefront, taxCode);
    }

    @Override
    public String toString() {
        return "AdvancedCommerceSubscriptionCreateRequest{" +
                "currency='" + currency + '\'' +
                ", descriptors=" + descriptors +
                ", items=" + items +
                ", period=" + period +
                ", previousTransactionId='" + previousTransactionId + '\'' +
                ", requestInfo=" + getRequestInfo() +
                ", storefront='" + storefront + '\'' +
                ", taxCode='" + taxCode + '\'' +
                '}';
    }
}