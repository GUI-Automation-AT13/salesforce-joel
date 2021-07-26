/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package core.selenium;

import core.utils.Environment;
import java.util.Properties;

/**
 * Controls initializing of environment variables of webDriver.
 */
public class DriverConfig {
    static DriverConfig driverConfig;
    private String browser;
    private int implicitWaitTime;
    private int explicitWaitTime;

    private DriverConfig() {
        initialize();
    }

    /**
     * Controls initializing of driverConfig.
     *
     * @return a DriverConfig entity.
     */
    public static DriverConfig getInstance() {
        if (driverConfig == null) {
            driverConfig = new DriverConfig();
        }
        return driverConfig;
    }

    private void initialize() {
        Properties properties = Environment.readFile();
        browser = properties.getProperty("browser");
        implicitWaitTime = Integer.parseInt(properties.getProperty("implicitWaitTime"));
        explicitWaitTime = Integer.parseInt(properties.getProperty("explicitWaitTime"));
    }

    public String getBrowser() {
        return browser;
    }

    public int getImplicitWaitTime() {
        return implicitWaitTime;
    }

    public int getExplicitWaitTime() {
        return explicitWaitTime;
    }
}
