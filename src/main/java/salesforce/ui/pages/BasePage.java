/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.ui.pages;

import core.selenium.DriverManager;
import core.selenium.WebElementAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Represents initial configuration of pages.
 */
public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected WebElementAction webElementAction;
    protected DriverManager driverManager;

    /**
     * Initializes base page entity.
     */
    public BasePage() {
        driverManager = DriverManager.getInstance();
        driver = driverManager.getDriver();
        wait = driverManager.getWait();
        webElementAction = new WebElementAction();
        PageFactory.initElements(driver, this);
        waitForPageLoaded();
    }

    protected abstract void waitForPageLoaded();
}
