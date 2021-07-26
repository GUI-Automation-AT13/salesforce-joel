/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala.
 */

package salesforce.api.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents token entity of salesforce.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Token {
    public static String accessToken;
    private String instanceUrl;
    private String id;
    private String tokenType;
    private String issuedAt;
    private String signature;

    @JsonProperty("access_token")
    public String getAccessToken() {
        return accessToken;
    }

    @JsonProperty("access_token")
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @JsonProperty("instance_url")
    public String getInstanceUrl() {
        return instanceUrl;
    }

    @JsonProperty("instance_url")
    public void setInstanceUrl(final String instanceUrl) {
        this.instanceUrl = instanceUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    @JsonProperty("token_type")
    public String getTokenType() {
        return tokenType;
    }

    @JsonProperty("token_type")
    public void setTokenType(final String tokenType) {
        this.tokenType = tokenType;
    }

    @JsonProperty("issued_at")
    public String getIssuedAt() {
        return issuedAt;
    }

    @JsonProperty("issued_at")
    public void setIssuedAt(final String issuedAt) {
        this.issuedAt = issuedAt;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(final String signature) {
        this.signature = signature;
    }
}
