/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala.
 */

package salesforce.api.config;

/**
 * Gives requested endpoint.
 */
public enum Endpoints {

    ID("id"),
    PEOPLE("/Individual"),
    PERSON(String.format("/Individual/{%s%s", Endpoints.ID.get(), "}")),
    ACCOUNTS("/Account"),
    ACCOUNT(String.format("/Account/{%s%s", Endpoints.ID.get(), "}")),
    ORDERS("/Order"),
    ORDER(String.format("/Order/{%s%s", Endpoints.ID.get(), "}")),
    CONTACTS("/Contact"),
    CONTACT(String.format("/Contact/{%s%s", Endpoints.ID.get(), "}")),
    CAMPAIGNS("/Campaign"),
    CAMPAIGN(String.format("/Campaign/{%s%s", Endpoints.ID.get(), "}")),
    PRODUCTS("/Product2"),
    PRODUCT(String.format("/Product2/{%s%s", Endpoints.ID.get(), "}")),
    PERSONAL_URL(AuthConfig.getInstance().getPersonalUrl()),
    BASE_URL(String.format("https://%s%s", Endpoints.PERSONAL_URL.get(), "/services/data/v52.0/sobjects")),
    TOKEN_URL("https://login.salesforce.com/services/oauth2/token");

    private String endpoint;

    Endpoints(final String endpoint) {
        this.endpoint = endpoint;
    }

    public String get() {
        return endpoint;
    }
}
