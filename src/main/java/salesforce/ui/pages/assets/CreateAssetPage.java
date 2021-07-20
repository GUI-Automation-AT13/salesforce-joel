/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.ui.pages.assets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.pages.BasePage;

/**
 * Represents asset creation page.
 */
public class CreateAssetPage extends BasePage {

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

    @Override
    protected void waitForPageLoaded() {
        wait.until(ExpectedConditions.visibilityOf(saveBtn));
    }

    public CreateAssetPage setUserName(final String userName) {
        webElementAction.setInputFields(userNameTxtBox, userName);
        return this;
    }

    public CreateAssetPage setSerialNumber(final String serialNumber) {
        webElementAction.setInputFields(serialNumberTxtBox, serialNumber);
        return this;
    }

    public CreateAssetPage setQuantity(final String  quantity) {
        webElementAction.setInputFields(quantityTxtBox, quantity);
        return this;
    }

    public CreateAssetPage setPrice(final String  price) {
        webElementAction.setInputFields(priceTxtBox, price);
        return this;
    }

    public CreateAssetPage setDescriptionTxtBox(final String  description) {
        webElementAction.setInputFields(descriptionTxtBox, description);
        return this;
    }

    public void clickActive() {
        activeCheckBox.click();
    }

    public void clickStatus() {
        statusComboBox.click();
    }

    public void clickStatusOptions() {
        statusOptionsComboBox.click();
    }

    public void clickRoleOption() {
        webElementAction.clickFields(roleOptionBox);
    }

    public void clickRoleFirstOption() {
        webElementAction.clickFields(roleFirstOptionBox);
    }

    public void clickProductOption() {
        webElementAction.clickFields(productOptionBox);
    }

    public void clickProductFirstOption() {
        webElementAction.clickFields(productFirstOptionBox);
    }

    public void clickContactOption() {
        webElementAction.clickFields(contactOptionBox);
    }

    public void clickContactFirstOption() {
        webElementAction.clickFields(contactFirstOptionBox);
    }

    public CreateAssetPage setInstallDateCalendar(final String  installDate) {
        webElementAction.setInputFields(installDateCalendar, installDate);
        return this;
    }

    public CreateAssetPage setPurchaseDateCalendar(final String  purchaseDate) {
        webElementAction.setInputFields(purchaseDateCalendar, purchaseDate);
        return this;
    }

    public CreateAssetPage setUsageDateCalendar(final String  usageDate) {
        webElementAction.setInputFields(usageDateCalendar, usageDate);
        return this;
    }

    public CreatedAssetPage clickSaveBtn() {
        saveBtn.click();
        return new CreatedAssetPage();
    }
}
