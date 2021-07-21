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

    /**
     * Sets a webElement with a value.
     *
     * @param webElement that will be set.
     * @param text as value that will set.
     */
    public void setInputFields(final WebElement webElement, final String text) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(text);
    }

    /**
     * Clicks a webElement.
     *
     * @param webElement is what we want to click.
     */
    public void clickFields(final WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.click();
    }

    /**
     * Clicks a webElement after other.
     *
     * @param field is what we want to click.
     * @param optionField is the next one.
     */
    public void clickOptionField(final WebElement field, final WebElement optionField) {
        wait.until(ExpectedConditions.visibilityOf(field));
        field.click();
        wait.until(ExpectedConditions.visibilityOf(optionField));
        optionField.click();
    }
}
