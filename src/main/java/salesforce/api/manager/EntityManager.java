package salesforce.api.manager;

import core.api.ApiManager;
import core.api.ApiMethod;
import core.api.ApiRequestBuilder;
import core.api.ApiResponse;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpStatus;
import salesforce.api.auth.Authentication;
import salesforce.api.config.Endpoints;
import salesforce.api.entity.Account;
import salesforce.api.entity.CreatedResponse;
import salesforce.api.entity.Token;

/**
 * Manages authentication, creating and deleting of entities.
 */
public class EntityManager {

    public static void getToken() {
        Authentication.getAuth();
    }

    /**
     * Creates an entity.
     *
     * @param body is the entity as a string.
     * @param endpoint is endpoint url.
     * @return a string that is entity id.
     */
    public static String create(final String body, final String endpoint) {
        CreatedResponse createdResponse;
        Account account = new Account();
        account.setName("Created Account ");
        ApiResponse apiResponse;
        ApiRequestBuilder apiRequestBuilder = new ApiRequestBuilder()
                .header(HttpHeaders.AUTHORIZATION, String.format("Bearer %s", Token.accessToken))
                .baseUri(Endpoints.BASE_URL.get())
                .method(ApiMethod.POST)
                .endpoint(endpoint)
                .body(body);
        apiResponse = ApiManager.execute(apiRequestBuilder.build());
        createdResponse = apiResponse.getResponse().as(CreatedResponse.class);
        apiResponse.getResponse().then().assertThat().statusCode(HttpStatus.SC_CREATED).log().body();
        return createdResponse.getId();
    }

    /**
     * Deletes an entity.
     *
     * @param endpoint is endpoint url.
     * @param param is param name. It is used to complete endpoint url.
     * @param paramValue is entity id.
     */
    public static void delete(final String endpoint, final String param, final String paramValue) {
        ApiResponse apiResponse;
        ApiRequestBuilder apiRequestBuilder = new ApiRequestBuilder()
                .header(HttpHeaders.AUTHORIZATION, String.format("Bearer %s", Token.accessToken))
                .baseUri(Endpoints.BASE_URL.get())
                .method(ApiMethod.DELETE)
                .endpoint(endpoint)
                .pathParam(param, paramValue);
        apiResponse = ApiManager.execute(apiRequestBuilder.build());
        apiResponse.getResponse().then().assertThat().statusCode(HttpStatus.SC_NO_CONTENT).log().body();
    }
}
