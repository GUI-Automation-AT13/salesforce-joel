/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.api.config;

import core.utils.Environment;
import java.util.Properties;

/**
 * Controls initializing of environment variables of webDriver.
 */
public class AuthConfig {
    static AuthConfig authConfig;
    private String clientId;
    private String clientSecret;
    private String username;
    private String password;
    private String personalUrl;

    private AuthConfig() {
        initialize();
    }

    /**
     * Controls initializing of authConfig.
     *
     * @return a AuthConfig entity.
     */
    public static AuthConfig getInstance() {
        if (authConfig == null) {
            authConfig = new AuthConfig();
        }
        return authConfig;
    }

    private void initialize() {
        Properties properties = Environment.readFile();
        username = properties.getProperty("username");
        password = properties.getProperty("password");
        clientId = properties.getProperty("clientId");
        clientSecret = properties.getProperty("clientSecret");
        personalUrl = properties.getProperty("personalUrl");
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPersonalUrl() {
        return personalUrl;
    }
}
