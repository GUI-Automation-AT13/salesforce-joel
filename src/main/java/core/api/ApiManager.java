/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package core.api;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * Manages the creation of RequestSpecification and execution of an ApiRequest salesforce.entities.
 */
public class ApiManager {

    /**
     * Builds a RequestSpecification.
     *
     * @param apiRequest contains all data of request.
     * @return a created RequestSpecification.
     */
    private static RequestSpecification buildRequest(final ApiRequest apiRequest) {
        return given().headers(apiRequest.getHeaders())
                .queryParams(apiRequest.getQueryParams())
                .pathParams(apiRequest.getPathParams())
                .baseUri(apiRequest.getBaseUri())
                .contentType(ContentType.JSON)
                .body(apiRequest.getBody())
                .log().method().log().uri().log().body();
    }

    /**
     * Executes an ApiRequest.
     *
     * @param apiRequest contains all data of request.
     * @return an ApiResponse after execution of request.
     */
    public static ApiResponse execute(final ApiRequest apiRequest) {
        Response response = buildRequest(apiRequest)
                .request(apiRequest.getMethod().name(), apiRequest.getEndpoint());

        return new ApiResponse(response);
    }
}
