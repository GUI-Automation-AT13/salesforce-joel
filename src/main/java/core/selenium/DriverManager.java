/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package core.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Controls initializing of webDriver and webDriverWait.
 */
public class DriverManager {
    static DriverManager driverManager;
    private WebDriver driver;
    private WebDriverWait wait;
    private DriverConfig driverConfig;

    private DriverManager() {
        driverConfig = DriverConfig.getInstance();
        setDriverManagerType();
        wait = new WebDriverWait(driver, driverConfig.getExplicitWaitTime());
        driver.manage().window().maximize();
    }

    /**
     * Controls initializing of driverManager.
     *
     * @return a DriverManager entity.
     */
    public static DriverManager getInstance() {
        if (driverManager == null) {
            driverManager = new DriverManager();
        }
        return driverManager;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    private void setDriverManagerType() {
        DriverManagerType driverManagerType = DriverManagerType.valueOf(driverConfig.getBrowser());
        WebDriverManager.getInstance(driverManagerType).setup();
        driver = DriverSelector.select(driverConfig.getBrowser());
    }
}
