// Copyright (c) 2025 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * The data your app provides to change the descriptors of an auto-renewable subscription.
 *
 * @see <a href="https://developer.apple.com/documentation/advancedcommerceapi/subscriptionchangemetadatadescriptors">SubscriptionChangeMetadataDescriptors</a>
 */
public class AdvancedCommerceSubscriptionChangeMetadataDescriptors {
    private static final String SERIALIZED_NAME_DESCRIPTION = "description";
    private static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
    private static final String SERIALIZED_NAME_EFFECTIVE = "effective";

    @JsonProperty(SERIALIZED_NAME_DESCRIPTION)
    private String description;
    @JsonProperty(SERIALIZED_NAME_DISPLAY_NAME)
    private String displayName;
    @JsonProperty(value = SERIALIZED_NAME_EFFECTIVE, required = true)
    private AdvancedCommerceEffective effective;

    public AdvancedCommerceSubscriptionChangeMetadataDescriptors() {}

    public AdvancedCommerceSubscriptionChangeMetadataDescriptors(AdvancedCommerceEffective effective) {
        this.effective = Objects.requireNonNull(effective);
    }

    public AdvancedCommerceSubscriptionChangeMetadataDescriptors description(String description) {
        this.description = AdvancedCommerceValidationUtils.validateDescription(description);
        return this;
    }

    /**
     * The description of the subscription.
     *
     * @return description
     **/
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = AdvancedCommerceValidationUtils.validateDescription(description);
    }

    public AdvancedCommerceSubscriptionChangeMetadataDescriptors displayName(String displayName) {
        this.displayName = AdvancedCommerceValidationUtils.validateDisplayName(displayName);
        return this;
    }

    /**
     * The display name of the subscription.
     *
     * @return displayName
     **/
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = AdvancedCommerceValidationUtils.validateDisplayName(displayName);
    }

    public AdvancedCommerceSubscriptionChangeMetadataDescriptors effective(AdvancedCommerceEffective effective) {
        this.effective = Objects.requireNonNull(effective);
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
        this.effective = Objects.requireNonNull(effective);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdvancedCommerceSubscriptionChangeMetadataDescriptors that = (AdvancedCommerceSubscriptionChangeMetadataDescriptors) o;
        return Objects.equals(description, that.description) && Objects.equals(displayName, that.displayName) && Objects.equals(effective, that.effective);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, displayName, effective);
    }

    @Override
    public String toString() {
        return "AdvancedCommerceSubscriptionChangeMetadataDescriptors{" +
                "description='" + description + '\'' +
                ", displayName='" + displayName + '\'' +
                ", effective=" + effective +
                '}';
    }
}