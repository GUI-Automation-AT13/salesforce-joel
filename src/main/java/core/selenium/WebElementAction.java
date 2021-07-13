/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package core.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Helps with filling the web elements.
 */
public class WebElementAction {
    private WebDriver driver;
    private WebDriverWait wait;

    public WebElementAction() {
        driver = DriverManager.getInstance().getDriver();
        wait = DriverManager.getInstance().getWait();
    }

    public void setInputFields(final WebElement webElement, final String text) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(text);
    }
}
