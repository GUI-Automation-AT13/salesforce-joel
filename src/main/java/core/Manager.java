/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package core;

import config.EnvironmentVariable;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *  This class controls initializing of web driver and web driver wait.
 */
public class Manager {
    static Manager manager;
    private WebDriver driver;
    private WebDriverWait wait;

    private Manager() {
        if ("chrome".equals(EnvironmentVariable.PROPERTIES.getProperty("Browser"))) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        wait = new WebDriverWait(driver, Long.parseLong(EnvironmentVariable.PROPERTIES
                .getProperty("Explicit_wait_time")));
        driver.manage().window().maximize();
    }

    /**
     * Controls initializing of manager.
     *
     * @return an manager entity.
     */
    public static Manager getInstance() {
        if (manager == null) {
            manager = new Manager();
        }
        return manager;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }
}
