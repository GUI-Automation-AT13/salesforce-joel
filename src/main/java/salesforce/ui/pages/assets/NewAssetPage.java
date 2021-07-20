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
 * Represents asset creation page.
 */
public class NewAssetPage extends BasePage {

    @FindBy(xpath = "(//div[contains(@class, \'uiInputText\')][.//label])[1]/input")
    private WebElement userNameTxtBox;

    @FindBy(xpath = "(//div[contains(@class, \'uiInputText\')][.//label])[2]/input")
    private WebElement serialNumberTxtBox;

    @FindBy(xpath = "(//input[contains(@class, \'uiInputSmartNumber\')])[1]")
    private WebElement quantityTxtBox;

    @FindBy(xpath = "(//input[contains(@class, \'uiInputSmartNumber\')])[2]")
    private WebElement priceTxtBox;

    @FindBy(xpath = "//textarea")
    private WebElement descriptionTxtBox;

    @FindBy(xpath = "//div[@class=\'slds-form-element__control\']//input[@type=\'checkbox\']")
    private WebElement activeCheckBox;

    @FindBy(xpath = "//a[@class=\'select\']")
    private WebElement statusComboBox;

    @FindBy(xpath = "//a[@title=\'Shipped\']")
    private WebElement statusOptionsComboBox;

    @FindBy(xpath = "(//div[contains(@class,\'uiInputDate\')]/div/input)[1]")
    private WebElement installDateCalendar;

    @FindBy(xpath = "(//div[contains(@class,\'uiInputDate\')]/div/input)[2]")
    private WebElement purchaseDateCalendar;

    @FindBy(xpath = "(//div[contains(@class,\'uiInputDate\')]/div/input)[3]")
    private WebElement usageDateCalendar;

    @FindBy(xpath = "(//div[@class=\'autocompleteWrapper slds-grow\']/input)[1]")
    private WebElement roleOptionBox;

    @FindBy(xpath = "(//div[@role=\'listbox\']//a)[1]")
    private WebElement roleFirstOptionBox;

    @FindBy(xpath = "(//div[@class=\'autocompleteWrapper slds-grow\']/input)[2]")
    private WebElement productOptionBox;

    @FindBy(xpath = "(//div[@class=\'listContent\']//a)[3]")
    private WebElement productFirstOptionBox;

    @FindBy(xpath = "(//div[@class=\'autocompleteWrapper slds-grow\']/input)[3]")
    private WebElement contactOptionBox;

    @FindBy(xpath = "(//div[@class=\'listContent\']//a)[3]")
    private WebElement contactFirstOptionBox;

    @FindBy(xpath = "//button[@title=\'Save\']")
    private WebElement saveBtn;

    private static final String COMMON_LOCATOR = "//label/span[text()='%s']/../..//input";
    private static final String DESCRIPTION_LOCATOR = "//label/span[text()='Description']/../..//textarea";
    private static final String SELECT_LOCATOR = "//div[@role='listbox']//a[.//div[text()='%s']]";
    private static final String BUTTON_LOCATOR = "//button[@title=\'%s\']";

    @Override
    protected void waitForPageLoaded() {
        wait.until(ExpectedConditions.visibilityOf(saveBtn));
        wait.until(ExpectedConditions.visibilityOf(userNameTxtBox));
    }

    public NewAssetPage setUserName(final String userName) {
        webElementAction.setInputFields(userNameTxtBox, userName);
        return this;
    }

    public NewAssetPage setField(final String field, final String value) {
        webElementAction.setInputFields(driver.findElement(By.xpath(String.format(COMMON_LOCATOR, field))), value);
        return this;
    }

    public NewAssetPage clickField(final String field) {
        webElementAction.clickFields(driver.findElement(By.xpath(String.format(COMMON_LOCATOR, field))));
        return this;
    }

    public NewAssetPage selectField(final String field) {
        webElementAction.clickFields(driver.findElement(By.xpath(String.format(SELECT_LOCATOR, field))));
        return this;
    }

    public NewAssetPage setDescription(final String value) {
        webElementAction.setInputFields(driver.findElement(By.xpath(DESCRIPTION_LOCATOR)), value);
        return this;
    }

    public NewAssetPage setSerialNumber(final String serialNumber) {
        webElementAction.setInputFields(serialNumberTxtBox, serialNumber);
        return this;
    }

    public NewAssetPage setQuantity(final String  quantity) {
        webElementAction.setInputFields(quantityTxtBox, quantity);
        return this;
    }

    public NewAssetPage setPrice(final String  price) {
        webElementAction.setInputFields(priceTxtBox, price);
        return this;
    }

    public NewAssetPage setDescriptionTxtBox(final String  description) {
        webElementAction.setInputFields(descriptionTxtBox, description);
        return this;
    }

    public NewAssetPage clickActive() {
        activeCheckBox.click();
        return this;
    }

    public NewAssetPage clickStatus() {
        statusComboBox.click();
        return this;
    }

    public NewAssetPage clickStatusOptions() {
        statusOptionsComboBox.click();
        return this;
    }

    public NewAssetPage clickRoleOption() {
        webElementAction.clickFields(roleOptionBox);
        return this;
    }

    public NewAssetPage clickRoleFirstOption() {
        webElementAction.clickFields(roleFirstOptionBox);
        return this;
    }

    public NewAssetPage clickProductOption() {
        webElementAction.clickFields(productOptionBox);
        return this;
    }

    public NewAssetPage clickProductFirstOption() {
        webElementAction.clickFields(productFirstOptionBox);
        return this;
    }

    public NewAssetPage clickContactOption() {
        webElementAction.clickFields(contactOptionBox);
        return this;
    }

    public NewAssetPage clickContactFirstOption() {
        webElementAction.clickFields(contactFirstOptionBox);
        return this;
    }

    public NewAssetPage setInstallDateCalendar(final String  installDate) {
        webElementAction.setInputFields(installDateCalendar, installDate);
        return this;
    }

    public NewAssetPage setPurchaseDateCalendar(final String  purchaseDate) {
        webElementAction.setInputFields(purchaseDateCalendar, purchaseDate);
        return this;
    }

    public NewAssetPage setUsageDateCalendar(final String  usageDate) {
        webElementAction.setInputFields(usageDateCalendar, usageDate);
        return this;
    }

    public AssetDetailPage clickSaveBtn() {
        saveBtn.click();
        return new AssetDetailPage();
    }
}
