/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.config;

import core.utils.Environment;
import java.util.Properties;

/**
 * Controls initializing of environment variables of salesforce.
 */
public class EnvConfig {
    static EnvConfig envConfig;
    private String username;
    private String password;
    private String endpointUrl;
    private String baseurl;
    private String loginUrl;
    private String anyEndpointUrl;

    private EnvConfig() {
        initialize();
    }

    /**
     * Controls initializing of EnvConfig.
     *
     * @return an EnvConfig entity.
     */
    public static EnvConfig getInstance() {
        if (envConfig == null) {
            envConfig = new EnvConfig();
        }
        return envConfig;
    }

    private void initialize() {
        Properties properties = Environment.readFile();
        username = properties.getProperty("username");
        password = properties.getProperty("password");
        endpointUrl = properties.getProperty("endpointUrl");
        baseurl = properties.getProperty("baseurl");
        loginUrl = properties.getProperty("loginUrl");
        anyEndpointUrl = properties.getProperty("anyEndpointUrl");
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEndpointUrl() {
        return endpointUrl;
    }

    public String getBaseurl() {
        return baseurl;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public String getAnyEndpointUrl() {
        return anyEndpointUrl;
    }
}
