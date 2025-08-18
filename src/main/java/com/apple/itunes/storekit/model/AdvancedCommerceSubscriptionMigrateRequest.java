// Copyright (c) 2023 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The subscription details you provide to migrate a subscription from In-App Purchase to the Advanced Commerce API, such as descriptors, items, storefront, and more.
 *
 * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/subscriptionmigraterequest">SubscriptionMigrateRequest</a>
 */
public class AdvancedCommerceSubscriptionMigrateRequest extends AdvancedCommerceRequest<AdvancedCommerceSubscriptionMigrateRequest> {

    private static final String SERIALIZED_NAME_DESCRIPTORS = "descriptors";
    private static final String SERIALIZED_NAME_ITEMS = "items";
    private static final String SERIALIZED_NAME_RENEWAL_ITEMS = "renewalItems";
    private static final String SERIALIZED_NAME_STOREFRONT = "storefront";
    private static final String SERIALIZED_NAME_TARGET_PRODUCT_ID = "targetProductId";
    private static final String SERIALIZED_NAME_TAX_CODE = "taxCode";

    @JsonProperty(value = SERIALIZED_NAME_DESCRIPTORS, required = true)
    private AdvancedCommerceDescriptors descriptors;
    @JsonProperty(value = SERIALIZED_NAME_ITEMS, required = true)
    private List<AdvancedCommerceSubscriptionMigrateItem> items;
    @JsonProperty(SERIALIZED_NAME_RENEWAL_ITEMS)
    private List<AdvancedCommerceSubscriptionMigrateRenewalItem> renewalItems;
    @JsonProperty(SERIALIZED_NAME_STOREFRONT)
    private String storefront;
    @JsonProperty(value = SERIALIZED_NAME_TARGET_PRODUCT_ID, required = true)
    private String targetProductId;
    @JsonProperty(value = SERIALIZED_NAME_TAX_CODE, required = true)
    private String taxCode;


    public AdvancedCommerceSubscriptionMigrateRequest() {}

    public AdvancedCommerceSubscriptionMigrateRequest(AdvancedCommerceRequestInfo requestInfo, List<AdvancedCommerceSubscriptionMigrateItem> items, String targetProductId) {
        super(requestInfo);
        this.items = Objects.requireNonNull(items);
        this.targetProductId = AdvancedCommerceValidationUtils.validateTargetProductId(targetProductId);
    }

    public AdvancedCommerceSubscriptionMigrateRequest descriptors(AdvancedCommerceDescriptors descriptors) {
        this.descriptors = descriptors;
        return this;
    }

    /**
     * The descriptors for the subscription migration request
     * @return descriptors
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/subscriptionmigratedescriptors">SubscriptionMigrateDescriptors</a>
     **/
    public AdvancedCommerceDescriptors getDescriptors() {
        return descriptors;
    }

    public void setDescriptors(AdvancedCommerceDescriptors descriptors) {
        this.descriptors = descriptors;
    }

    public AdvancedCommerceSubscriptionMigrateRequest items(List<AdvancedCommerceSubscriptionMigrateItem> items) {
        this.items = items;
        return this;
    }

    public AdvancedCommerceSubscriptionMigrateRequest addItem(AdvancedCommerceSubscriptionMigrateItem item) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(item);
        return this;
    }

    /**
     * An array of one or more SKUs, along with descriptions and display names, that are included in the subscription.
     * @return items
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/subscriptionmigrateitem">SubscriptionMigrateItem</a>
     **/
    public List<AdvancedCommerceSubscriptionMigrateItem> getItems() {
        return items;
    }

    public void setItems(List<AdvancedCommerceSubscriptionMigrateItem> items) {
        this.items = items;
    }

    public AdvancedCommerceSubscriptionMigrateRequest renewalItems(List<AdvancedCommerceSubscriptionMigrateRenewalItem> renewalItems) {
        this.renewalItems = renewalItems;
        return this;
    }

    public AdvancedCommerceSubscriptionMigrateRequest addRenewalItem(AdvancedCommerceSubscriptionMigrateRenewalItem renewalItem) {
        if (this.renewalItems == null) {
            this.renewalItems = new ArrayList<>();
        }
        this.renewalItems.add(renewalItem);
        return this;
    }

    /**
     * The renewal items for the subscription migration request
     * @return renewalItems
     * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/subscriptionmigraterenewalitem">SubscriptionMigrateRenewalItem</a>
     **/
    public List<AdvancedCommerceSubscriptionMigrateRenewalItem> getRenewalItems() {
        return renewalItems;
    }

    public void setRenewalItems(List<AdvancedCommerceSubscriptionMigrateRenewalItem> renewalItems) {
        this.renewalItems = renewalItems;
    }


    public AdvancedCommerceSubscriptionMigrateRequest targetProductId(String targetProductId) {
        this.targetProductId = AdvancedCommerceValidationUtils.validateTargetProductId(targetProductId);
        return this;
    }

    /**
     * Your generic product ID for an auto-renewable subscription. You configure this product ID in App Store Connect during setup.
     * @return targetProductId
     **/
    public String getTargetProductId() {
        return targetProductId;
    }

    public void setTargetProductId(String targetProductId) {
        this.targetProductId = AdvancedCommerceValidationUtils.validateTargetProductId(targetProductId);
    }

    public AdvancedCommerceSubscriptionMigrateRequest taxCode(String taxCode) {
        this.taxCode = AdvancedCommerceValidationUtils.validateTaxCode(taxCode);
        return this;
    }

    /**
     * The tax code for the subscription migration request
     * @return taxCode
     **/
    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = AdvancedCommerceValidationUtils.validateTaxCode(taxCode);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        AdvancedCommerceSubscriptionMigrateRequest that = (AdvancedCommerceSubscriptionMigrateRequest) o;
        return Objects.equals(this.descriptors, that.descriptors) &&
                Objects.equals(this.items, that.items) &&
                Objects.equals(this.renewalItems, that.renewalItems) &&
                Objects.equals(this.storefront, that.storefront) &&
                Objects.equals(this.targetProductId, that.targetProductId) &&
                Objects.equals(this.taxCode, that.taxCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), descriptors, items, renewalItems, storefront, targetProductId, taxCode);
    }

    @Override
    public AdvancedCommerceSubscriptionMigrateRequest self() {
        return this;
    }

    @Override
    public String toString() {
        return "AdvancedCommerceSubscriptionMigrateRequest{" +
                "descriptors=" + descriptors +
                ", items=" + items +
                ", renewalItems=" + renewalItems +
                ", storefront='" + storefront + '\'' +
                ", targetProductId='" + targetProductId + '\'' +
                ", taxCode='" + taxCode + '\'' +
                ", requestInfo=" + getRequestInfo() +
                '}';
    }
}