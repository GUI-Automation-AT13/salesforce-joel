/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.ui;

/**
 * Gets field names.
 */
public enum FieldName {
    ACCOUNT("Account"),
    ASSET_NAME("Asset Name"),
    SERIAL_NUMBER("Serial Number"),
    QUANTITY("Quantity"),
    PRICE("Price"),
    DESCRIPTION("Description"),
    INSTALL_DATE("Install Date"),
    PURCHASE_DATE("Purchase Date"),
    USAGE_END_DATE("Usage End Date"),
    CONTACT("Contact"),
    PRODUCT("Product");
    private String text;

    FieldName(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
