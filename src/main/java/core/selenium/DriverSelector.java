/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package core.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Controls initializing of web driver.
 */
public class DriverSelector {

    /**
     * Gets a web driver initialized.
     *
     * @param webDriverType is type of web driver.
     * @return a web driver entity.
     */
    public static WebDriver select(final String webDriverType) {
        switch (webDriverType) {
            case "FIREFOX":
                return new FirefoxDriver();
            default:
                return new ChromeDriver(new ChromeOptions().addArguments("--disable-notifications"));
        }

    }
}
