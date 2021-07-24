/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package core.api;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Keeps all data that are required to construct the request.
 */
public class ApiRequest {
    private String baseUri;
    private String endpoint;
    private String body;
    private String token;
    private Enum<ApiMethod> method;
    private List<Header> headers;
    private Map<String, String> queryParams;
    private Map<String, String> pathParams;
    private Map<String, String> params;

    /**
     * Api request constructor.
     */
    public ApiRequest() {
        headers = new ArrayList<>();
        queryParams = new HashMap<>();
        pathParams = new HashMap<>();
        params = new HashMap<>();
        body = "";
    }

    public String getBaseUri() {
        return baseUri;
    }

    public void setBaseUri(final String baseUri) {
        this.baseUri = baseUri;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(final String endpoint) {
        this.endpoint = endpoint;
    }

    public String getBody() {
        return body;
    }

    public void setBody(final String body) {
        this.body = body;
    }

    public String getToken() {
        return token;
    }

    public void setToken(final String token) {
        this.token = token;
    }

    public Enum<ApiMethod> getMethod() {
        return method;
    }

    public void setMethod(final Enum<ApiMethod> method) {
        this.method = method;
    }

    public void addHeader(final String header, final String value) {
        headers.add(new Header(header, value));
    }

    public void addQueryParam(final String param, final String value) {
        queryParams.put(param, value);
    }

    public void addQueryParam(final Map<String, String> newQueryParams) {
        queryParams.putAll(newQueryParams);
    }

    public void addPathParam(final String param, final String value) {
        pathParams.put(param, value);
    }

    public void addPathParam(final Map<String, String> pathParams) {
        this.pathParams.putAll(pathParams);
    }

    public void addParam(final String param, final String value) {
        params.put(param, value);
    }

    public void addParam(final Map<String, String> pathParams) {
        this.params.putAll(pathParams);
    }

    public Headers getHeaders() {
        return new Headers(headers);
    }

    public Map<String, String> getQueryParams() {
        return queryParams;
    }

    public Map<String, String> getPathParams() {
        return pathParams;
    }
}
