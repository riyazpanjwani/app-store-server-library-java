// Copyright (c) 2025 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The request data your app provides to change the metadata of an auto-renewable subscription.
 *
 * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/subscriptionchangemetadatarequest">SubscriptionChangeMetadataRequest</a>
 */
public class AdvancedCommerceSubscriptionChangeMetadataRequest extends AdvancedCommerceRequest<AdvancedCommerceSubscriptionChangeMetadataRequest> {

    private static final String SERIALIZED_NAME_DESCRIPTORS = "descriptors";
    private static final String SERIALIZED_NAME_ITEMS = "items";
    private static final String SERIALIZED_NAME_STOREFRONT = "storefront";
    private static final String SERIALIZED_NAME_TAX_CODE = "taxCode";

    @JsonProperty(SERIALIZED_NAME_DESCRIPTORS)
    private AdvancedCommerceSubscriptionChangeMetadataDescriptors descriptors;
    @JsonProperty(SERIALIZED_NAME_ITEMS)
    private List<AdvancedCommerceSubscriptionChangeMetadataItem> items;
    @JsonProperty(SERIALIZED_NAME_STOREFRONT)
    private String storefront;
    @JsonProperty(SERIALIZED_NAME_TAX_CODE)
    private String taxCode;

    public AdvancedCommerceSubscriptionChangeMetadataRequest() {}

    public AdvancedCommerceSubscriptionChangeMetadataRequest(AdvancedCommerceRequestInfo requestInfo) {
        super(requestInfo);
    }

    @Override
    public AdvancedCommerceSubscriptionChangeMetadataRequest self() {
        return this;
    }

    public AdvancedCommerceSubscriptionChangeMetadataRequest descriptors(AdvancedCommerceSubscriptionChangeMetadataDescriptors descriptors) {
        this.descriptors = descriptors;
        return this;
    }

    /**
     * The data your app provides to change the descriptors of an auto-renewable subscription.
     *
     * @return descriptors
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/subscriptionchangemetadatadescriptors">SubscriptionChangeMetadataDescriptors</a>
     **/
    public AdvancedCommerceSubscriptionChangeMetadataDescriptors getDescriptors() {
        return descriptors;
    }

    public void setDescriptors(AdvancedCommerceSubscriptionChangeMetadataDescriptors descriptors) {
        this.descriptors = descriptors;
    }

    public AdvancedCommerceSubscriptionChangeMetadataRequest items(List<AdvancedCommerceSubscriptionChangeMetadataItem> items) {
        this.items = items;
        return this;
    }

    public AdvancedCommerceSubscriptionChangeMetadataRequest addItem(AdvancedCommerceSubscriptionChangeMetadataItem item) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(item);
        return this;
    }

    /**
     * The list of items to change metadata for in the subscription.
     *
     * @return items
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/subscriptionchangemetadatitem">SubscriptionChangeMetadataItem</a>
     **/
    public List<AdvancedCommerceSubscriptionChangeMetadataItem> getItems() {
        return items;
    }

    public void setItems(List<AdvancedCommerceSubscriptionChangeMetadataItem> items) {
        this.items = items;
    }


    public AdvancedCommerceSubscriptionChangeMetadataRequest taxCode(String taxCode) {
        this.taxCode = AdvancedCommerceValidationUtils.validateTaxCode(taxCode);
        return this;
    }

    /**
     * The tax code for this product.
     *
     * @return taxCode
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/taxcode">TaxCode</a>
     **/
    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = AdvancedCommerceValidationUtils.validateTaxCode(taxCode);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AdvancedCommerceSubscriptionChangeMetadataRequest that = (AdvancedCommerceSubscriptionChangeMetadataRequest) o;
        return Objects.equals(descriptors, that.descriptors) && Objects.equals(items, that.items) && Objects.equals(taxCode, that.taxCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), descriptors, items, taxCode);
    }

    @Override
    public String toString() {
        return "AdvancedCommerceSubscriptionChangeMetadataRequest{" +
                "descriptors=" + descriptors +
                ", items=" + items +
                ", requestInfo=" + getRequestInfo() +
                ", storefront='" + storefront + '\'' +
                ", taxCode='" + taxCode + '\'' +
                '}';
    }
}