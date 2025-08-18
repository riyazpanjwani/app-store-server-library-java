// Copyright (c) 2023 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

/**
 * An item for subscription migration in Advanced Commerce API
 *
 * @see <a href="https://developer.apple.com/documentation/appstoreserverapi/advanced_commerce_api">Advanced Commerce API</a>
 */
public class AdvancedCommerceSubscriptionMigrateItem extends AbstractAdvancedCommerceItem {

    public AdvancedCommerceSubscriptionMigrateItem() {
        super();
    }

    @Override
    public AdvancedCommerceSubscriptionMigrateItem self() {
        return this;
    }

    @Override
    public AdvancedCommerceSubscriptionMigrateItem sku(String sku) {
        return (AdvancedCommerceSubscriptionMigrateItem) super.sku(sku);
    }

    @Override
    public AdvancedCommerceSubscriptionMigrateItem description(String description) {
        return (AdvancedCommerceSubscriptionMigrateItem) super.description(description);
    }

    @Override
    public AdvancedCommerceSubscriptionMigrateItem displayName(String displayName) {
        return (AdvancedCommerceSubscriptionMigrateItem) super.displayName(displayName);
    }
}