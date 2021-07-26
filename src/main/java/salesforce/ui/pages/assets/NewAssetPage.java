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
import salesforce.api.entity.Account;
import salesforce.api.entity.Asset;
import salesforce.ui.FieldName;
import salesforce.ui.pages.BasePage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Represents asset creation page.
 */
public class NewAssetPage extends BasePage {

    @FindBy(xpath = "(//div[contains(@class, \'uiInputText\')][.//label])[1]/input")
    private WebElement userNameTxtBox;

    @FindBy(xpath = "//div[@class=\'slds-form-element__control\']//input[@type=\'checkbox\']")
    private WebElement activeCheckBox;

    @FindBy(xpath = "//a[@class=\'select\']")
    private WebElement statusComboBox;

    @FindBy(xpath = "//a[@title=\'Shipped\']")
    private WebElement statusOptionsComboBox;

    @FindBy(xpath = "(//div[@role=\'listbox\']//a)[1]")
    private WebElement roleFirstOptionBox;

    @FindBy(xpath = "(//div[@class=\'listContent\']//a)[3]")
    private WebElement productFirstOptionBox;

    @FindBy(xpath = "(//div[@class=\'listContent\']//a)[3]")
    private WebElement contactFirstOptionBox;

    @FindBy(xpath = "//button[@title=\'Save\']")
    private WebElement saveBtn;

    private static final String COMMON_LOCATOR = "//label/span[text()='%s']/../..//input";
    private static final String DESCRIPTION_LOCATOR = "//label/span[text()='Description']/../..//textarea";
    private static final String SELECT_LOCATOR = "//div[@role='listbox']//a[.//div[text()='%s']]";
    private static final String BUTTON_LOCATOR = "//button[@title='%s']";

    @Override
    protected void waitForPageLoaded() {
        wait.until(ExpectedConditions.visibilityOf(saveBtn));
        wait.until(ExpectedConditions.visibilityOf(userNameTxtBox));
    }

    /**
     * Sets a webElement with a value.
     *
     * @param field identifies what webElement will be set.
     * @param value represents what value sets inside webElement.
     * @return a NewAssetPage entity.
     */
    public NewAssetPage setField(final String field, final String value) {
        webElementAction.setInputFields(driver.findElement(By.xpath(String.format(COMMON_LOCATOR, field))), value);
        return this;
    }

    /**
     * Clicks a webElement.
     *
     * @param field identifies what webElement will be clicked.
     * @return a NewAssetPage entity.
     */
    public NewAssetPage clickField(final String field) {
        webElementAction.clickFields(driver.findElement(By.xpath(String.format(COMMON_LOCATOR, field))));
        return this;
    }

    /**
     * Selects a webElement and a inside one.
     *
     * @param field is first webElement that will be clicked.
     * @param optionField is second webElement that will be clicked.
     * @return a NewAssetPage entity.
     */
    public NewAssetPage clickOptionField(final String field, final String optionField) {
        webElementAction.clickFields(driver.findElement(By.xpath(String.format(COMMON_LOCATOR, field))));
        webElementAction.clickFields(driver.findElement(By.xpath(String.format(SELECT_LOCATOR, optionField))));
        return this;
    }

    /**
     * Selects a webElement.
     *
     * @param field identifies what webElement will be selected.
     * @return a NewAssetPage entity.
     */
    public NewAssetPage selectField(final String field) {
        webElementAction.clickFields(driver.findElement(By.xpath(String.format(SELECT_LOCATOR, field))));
        return this;
    }

    /**
     * Sets description webElement with a value.
     *
     * @param value represents what value sets inside description webElement.
     * @return a NewAssetPage entity.
     */
    public NewAssetPage setDescription(final String value) {
        webElementAction.setInputFields(driver.findElement(By.xpath(DESCRIPTION_LOCATOR)), value);
        return this;
    }

    /**
     * Clicks activeCheckBox webElement.
     *
     * @return a NewAssetPage entity.
     */
    public NewAssetPage clickActive() {
        activeCheckBox.click();
        return this;
    }

    /**
     * Clicks statusComboBox webElement.
     *
     * @return a NewAssetPage entity.
     */
    public NewAssetPage clickStatus() {
        statusComboBox.click();
        return this;
    }

    /**
     * Clicks statusOptionsComboBox webElement.
     *
     * @return a NewAssetPage entity.
     */
    public NewAssetPage clickStatusOptions() {
        statusOptionsComboBox.click();
        return this;
    }

    /**
     * Clicks roleFirstOptionBox webElement.
     *
     * @return a NewAssetPage entity.
     */
    public NewAssetPage clickRoleFirstOption() {
        webElementAction.clickFields(roleFirstOptionBox);
        return this;
    }

    /**
     * Clicks productFirstOptionBox webElement.
     *
     * @return a NewAssetPage entity.
     */
    public NewAssetPage clickProductFirstOption() {
        webElementAction.clickFields(productFirstOptionBox);
        return this;
    }

    /**
     * Clicks contactFirstOptionBox webElement.
     *
     * @return a NewAssetPage entity.
     */
    public NewAssetPage clickContactFirstOption() {
        webElementAction.clickFields(contactFirstOptionBox);
        return this;
    }

    /**
     * Clicks saveBtn webElement.
     *
     * @return a AssetDetailPage entity.
     */
    public AssetDetailPage clickSaveBtn() {
        saveBtn.click();
        return new AssetDetailPage();
    }

    /**
     * Sets NewAssetPage webElement.
     *
     * @return a AssetDetailPage entity.
     */
    public AssetDetailPage createAsset(Set<String> fields, Asset asset) {
        Map<String, Runnable> strategyMap = new HashMap<>();
        strategyMap.put("Name",
                () -> setField(FieldName.ASSET_NAME.getText(), asset.getName()));
        strategyMap.put("SerialNumber",
                () -> setField(FieldName.SERIAL_NUMBER.getText(), asset.getSerialNumber()));
        strategyMap.put("Quantity",
                () -> setField(FieldName.QUANTITY.getText(), Double.toString(asset.getQuantity())));
        strategyMap.put("Price",
                () -> setField(FieldName.PRICE.getText(), Double.toString(asset.getPrice())));
        strategyMap.put("Description", () -> setDescription(asset.getDescription()));
        strategyMap.put("InstallDate",
                () -> setField(FieldName.INSTALL_DATE.getText(), asset.getInstallDate()));
        strategyMap.put("PurchaseDate",
                () -> setField(FieldName.PURCHASE_DATE.getText(), asset.getPurchaseDate()));
        strategyMap.put("UsageEndDate",
                () -> setField(FieldName.USAGE_END_DATE.getText(), asset.getUsageEndDate()));
        strategyMap.put("AccountName", () -> clickField(FieldName.ACCOUNT.getText())
                .clickRoleFirstOption());
        strategyMap.put("ContactName", () -> clickField(FieldName.CONTACT.getText())
                .clickContactFirstOption());
        strategyMap.put("ProductName", () -> clickField(FieldName.PRODUCT.getText())
                .clickProductFirstOption());
        fields.forEach(field -> strategyMap.get(field).run());
        return clickSaveBtn();
    }
}
