// Copyright (c) 2025 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

import java.util.Objects;
import java.util.UUID;

public final class AdvancedCommerceValidationUtils {
    
    public static final int CURRENCY_CODE_LENGTH = 3;
    public static final int MAXIMUM_STOREFRONT_LENGTH = 10;
    public static final int MAXIMUM_REQUEST_REFERENCE_ID_LENGTH = 36;
    public static final int MAXIMUM_DESCRIPTION_LENGTH = 45;
    public static final int MAXIMUM_DISPLAY_NAME_LENGTH = 30;
    private static final int MAXIMUM_SKU_LENGTH = 128;
    private static final String ISO_CURRENCY_REGEX = "^[A-Z]{3}$";
    
    private AdvancedCommerceValidationUtils() {}
    
    /**
     * Validates currency code according to ISO 4217 standard.
     *
     * @param currency the currency code to validate
     * @return the validated currency code
     * @throws IllegalArgumentException if currency is invalid
     */
    public static String validateCurrency(String currency) {
        Objects.requireNonNull(currency, "Currency cannot be null");
        if (currency.length() != CURRENCY_CODE_LENGTH) {
            throw new IllegalArgumentException("Currency must be a 3-letter ISO 4217 code");
        }
        if (!currency.matches(ISO_CURRENCY_REGEX)) {
            throw new IllegalArgumentException("Currency must contain only uppercase letters");
        }
        return currency;
    }
    
    /**
     * Validates tax code is not empty.
     *
     * @param taxCode the tax code to validate
     * @return the validated tax code
     * @throws IllegalArgumentException if tax code is invalid
     */
    public static String validateTaxCode(String taxCode) {
        Objects.requireNonNull(taxCode, "Tax code cannot be null");
        if (taxCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Tax code cannot be empty");
        }
        return taxCode;
    }

    /**
     * Validates transactionId is not empty.
     * @param transactionId
     * @return the validated transaction ID
     * @throws IllegalArgumentException if transaction ID is invalid
     */
    public static String validateTransactionId(String transactionId) {
        Objects.requireNonNull(transactionId, "Transaction ID cannot be null");
        if (transactionId.trim().isEmpty()) {
            throw new IllegalArgumentException("Transaction ID cannot be empty");
        }
        return transactionId;
    }

    /**
     * Validates target product ID is not empty.
     * @param targetProductId
     * @return the validated target product ID
     * @throws IllegalArgumentException if target product ID is invalid
     */
    public static String validateTargetProductId(String targetProductId) {
        Objects.requireNonNull(targetProductId, "Target Product ID cannot be null");
        if (targetProductId.trim().isEmpty()) {
            throw new IllegalArgumentException("Target Product ID cannot be empty");
        }
        return targetProductId;
    }

    /**
     * Validates UUID is not null and its string representation doesn't exceed maximum length.
     *
     * @param uuid
     * @return the validated UUID
     * @throws IllegalArgumentException if UUID is invalid
     */
    public static UUID validUUID(UUID uuid) {
        Objects.requireNonNull(uuid, "UUID cannot be null");
        String uuidString = uuid.toString();
        if (uuidString.length() > MAXIMUM_REQUEST_REFERENCE_ID_LENGTH) {
            throw new IllegalArgumentException("UUID string representation cannot exceed " + MAXIMUM_REQUEST_REFERENCE_ID_LENGTH + " characters");
        }
        return uuid;
    }

    /**
     * Validates price is not null and non-negative.
     * @param price
     * @return the validated price
     * @throws IllegalArgumentException if price is null or negative
     */
    public static Long validatePrice(Long price) {
       Objects.requireNonNull(price, "Price cannot be null");
       if (price < 0) {
           throw new IllegalArgumentException("Price cannot be negative");
       }
       return price;
   }

    /**
     * Validates description does not exceed maximum length.
     * For required fields, caller should ensure description is not null before calling this method.
     *
     * @param description the description to validate
     * @return the validated description
     * @throws IllegalArgumentException if description exceeds maximum length
     */
    public static String validateDescription(String description) {
        if (description != null && description.length() > MAXIMUM_DESCRIPTION_LENGTH) {
            throw new IllegalArgumentException("description length longer than maximum allowed");
        }
        return description;
    }

    /**
     * Validates display name does not exceed maximum length.
     * For required fields, caller should ensure displayName is not null before calling this method.
     *
     * @param displayName the display name to validate
     * @return the validated display name
     * @throws IllegalArgumentException if display name exceeds maximum length
     */
    public static String validateDisplayName(String displayName) {
        if (displayName != null && displayName.length() > MAXIMUM_DISPLAY_NAME_LENGTH) {
            throw new IllegalArgumentException("displayName length longer than maximum allowed");
        }
        return displayName;
    }

    /**
     * Validates SKU does not exceed maximum length.
     * @param sku
     * @return the validated SKU
     * @throws IllegalArgumentException if SKU exceeds maximum length
     */
    public static String validateSku(String sku) {
        if (sku != null && sku.length() > MAXIMUM_SKU_LENGTH) {
            throw new IllegalArgumentException("SKU length longer than maximum allowed");
        }
        return sku;
    }
}