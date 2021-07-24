/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.api.auth;

import static io.restassured.RestAssured.given;

import org.apache.http.HttpHeaders;
import salesforce.api.config.AuthConfig;
import salesforce.api.config.Credentials;
import salesforce.api.config.Endpoints;
import salesforce.api.config.HeaderValue;
import salesforce.api.entity.Token;

/**
 * Makes the authentication to the webpage.
 */
public class Authentication {

    /**
     * Gets the authentication.
     *
     * @return the authentication.
     */
    public static Token getAuth() {
        return
                given().urlEncodingEnabled(true)
                        .param(Credentials.USERNAME1.getEnumValue(), AuthConfig.getInstance().getUsername())
                        .param(Credentials.PASSWORD.getEnumValue(), AuthConfig.getInstance().getPassword())
                        .param(Credentials.CLIENT_ID.getEnumValue(), AuthConfig.getInstance().getClientId())
                        .param(Credentials.CLIENT_SECRET.getEnumValue(), AuthConfig.getInstance().getClientSecret())
                        .param(Credentials.GRANT_TYPE.getEnumValue(), Credentials.PASSWORD.getEnumValue())
                        .header(HttpHeaders.ACCEPT, HeaderValue.APP_JSON.get())
                        .header(HttpHeaders.CONTENT_TYPE, HeaderValue.APP_X_FORM.get())
                        .log().all()
                        .when()
                        .post(Endpoints.TOKEN_URL.get())
                        .as(Token.class);
    }
}
