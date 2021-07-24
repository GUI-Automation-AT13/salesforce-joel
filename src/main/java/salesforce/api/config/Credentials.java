/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.api.config;

/**
 * Gives requested key.
 */
public enum Credentials {
    
    USERNAME1("USERNAME1", "username"),
    PASSWORD("PASSWORD", "password"),
    CLIENT_ID("CLIENT_ID", "client_id"),
    CLIENT_SECRET("CLIENT_SECRET", "client_secret"),
    GRANT_TYPE("password", "grant_type"),
    TOKEN_URL("TOKEN_URL", "TOKEN_URL"),
    BASE_URL("BASE_URL", "BASE_URL");

    private String name;
    private String value;

    Credentials(final String name, final String value) {
        this.name = name;
        this.value = value;
    }

    public String getEnumName() {
        return name;
    }

    public String getEnumValue() {
        return value;
    }
}
