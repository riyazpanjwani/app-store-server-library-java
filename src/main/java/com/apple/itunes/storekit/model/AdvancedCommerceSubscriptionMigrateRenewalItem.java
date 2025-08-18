// Copyright (c) 2023 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

/**
 * A renewal item for subscription migration in Advanced Commerce API
 *
 * @see <a href="https://developer.apple.com/documentation/appstoreserverapi/advanced_commerce_api">Advanced Commerce API</a>
 */
public class AdvancedCommerceSubscriptionMigrateRenewalItem extends AbstractAdvancedCommerceItem {

    public AdvancedCommerceSubscriptionMigrateRenewalItem() {
        super();
    }

    @Override
    public AdvancedCommerceSubscriptionMigrateRenewalItem self() {
        return this;
    }

    @Override
    public AdvancedCommerceSubscriptionMigrateRenewalItem sku(String sku) {
        return (AdvancedCommerceSubscriptionMigrateRenewalItem) super.sku(sku);
    }

    @Override
    public AdvancedCommerceSubscriptionMigrateRenewalItem description(String description) {
        return (AdvancedCommerceSubscriptionMigrateRenewalItem) super.description(description);
    }

    @Override
    public AdvancedCommerceSubscriptionMigrateRenewalItem displayName(String displayName) {
        return (AdvancedCommerceSubscriptionMigrateRenewalItem) super.displayName(displayName);
    }
}