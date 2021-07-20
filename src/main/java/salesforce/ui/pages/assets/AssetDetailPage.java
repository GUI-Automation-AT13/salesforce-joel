/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.ui.pages.assets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.pages.BasePage;

/**
 * Represents page of a created asset.
 */
public class AssetDetailPage extends BasePage {

    @FindBy(xpath = "//h1/div/span")
    private WebElement createdAssetTitle;

    @FindBy(xpath = "//ul[contains(@class,\'branding-actions\')]/li/div//a[@role=\'button\']")
    private WebElement createdAssetOptionBtn;

    private static final String HEADER_ATTRIBUTE_LOCATOR = "//div/span[text()='%s']/..//a";

    private static final String BODY_ATTRIBUTE_LOCATOR = "//div/span[text()='%s']/../..//span/span";

    @FindBy(xpath = "//div/span[text()='Quantity']/../div//span")
    private WebElement bodyQuantityText;

    public OptionMenuPage clickCreatedAssetOptionBtn() {
        createdAssetOptionBtn.click();
        return new OptionMenuPage();
    }

    public String getField(final String field) {
        return driver.findElement(By.xpath(String.format(HEADER_ATTRIBUTE_LOCATOR, field))).getText();
    }

    public String getFieldBody(final String field) {
        return driver.findElement(By.xpath(String.format(BODY_ATTRIBUTE_LOCATOR, field))).getText();
    }

    public String getBodyQuantity() {
        return bodyQuantityText.getText();
    }

    @Override
    protected void waitForPageLoaded() {
        wait.until(ExpectedConditions.visibilityOf(createdAssetTitle));
    }

    public String getCreatedAssetTitleText() {
        return createdAssetTitle.getText();
    }
}
