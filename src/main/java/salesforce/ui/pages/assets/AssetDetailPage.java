/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.ui.pages.assets;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.SoftAssert;
import salesforce.api.entity.Asset;
import salesforce.ui.FieldName;
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

    @FindBy(css = ".slds-theme--success")
    private WebElement actionMessage;

    @FindBy(xpath = "//span[text()='Created By']/../../div/span/span")
    private WebElement createdDate;

    /**
     * Clicks createdAssetOptionBtn webElement.
     *
     * @return an OptionMenuPage entity.
     */
    public OptionMenuPage clickCreatedAssetOptionBtn() {
        createdAssetOptionBtn.click();
        return new OptionMenuPage();
    }

    /**
     * Gets text of a webElement.
     *
     * @param field identifies what webElement is needed.
     * @return a string that is the text.
     */
    public String getField(final String field) {
        return driver.findElement(By.xpath(String.format(HEADER_ATTRIBUTE_LOCATOR, field))).getText();
    }

    /**
     * Gets text of a webElement in body section.
     *
     * @param field identifies what webElement is needed.
     * @return a string that is the text.
     */
    public String getFieldBody(final String field) {
        return driver.findElement(By.xpath(String.format(BODY_ATTRIBUTE_LOCATOR, field))).getText();
    }

    /**
     * Gets text of bodyQuantityText webElement.
     *
     * @return a string that is the text.
     */
    public String getBodyQuantity() {
        return bodyQuantityText.getText();
    }

    @Override
    protected void waitForPageLoaded() {
        wait.until(ExpectedConditions.visibilityOf(createdAssetTitle));
    }

    /**
     * Gets text of createdAssetTitle webElement.
     *
     * @return a string that is the text.
     */
    public String getCreatedAssetTitleText() {
        return createdAssetTitle.getText();
    }

    /**
     * Gets text of actionMessage webElement.
     *
     * @return a string that is the text.
     */
    public String getActionMessage() {
        return actionMessage.getText();
    }

    /**
     * Gets text of createdDate webElement.
     *
     * @return a string that is the text.
     */
    public String getCreatedDate() {
        return createdDate.getText();
    }

    /**
     * Compares header field values with asset values filtering what to compare using a set.
     *
     * @param softAssert is a SoftAssert entity.
     * @param fields is Set entity.
     * @param asset is an Asset entity.
     */
    public void compareHeaderField(SoftAssert softAssert, Set<String> fields, Asset asset) {
        Map<String, Runnable> strategyMap = new HashMap<>();
        strategyMap.put("AccountName",
                () -> softAssert.assertEquals(getField(FieldName.ACCOUNT.getText()), asset.getAccountName(),
                        "Account name of Header does not match"));
        strategyMap.put("ContactName",
                () -> softAssert.assertEquals(getField(FieldName.CONTACT.getText()), asset.getContactName(),
                        "Contact name of Header does not match"));
        strategyMap.put("Quantity",
                () -> softAssert.assertTrue(getBodyQuantity().contains(Integer.toString((int) asset.getQuantity())),
                        "Asset quantity of Header does not match"));
        fields.forEach(field -> {
            if (strategyMap.containsKey(field)) {
                strategyMap.get(field).run();
            }
        });
    }

    /**
     * Compares detail field values with asset values filtering what to compare using a set.
     *
     * @param softAssert is a SoftAssert entity.
     * @param fields is Set entity.
     * @param asset is an Asset entity.
     */
    public void compareDetailField(SoftAssert softAssert, Set<String> fields, Asset asset) {
        Map<String, Runnable> strategyMap = new HashMap<>();
        strategyMap.put("Name",
                () -> softAssert.assertEquals(getFieldBody(FieldName.ASSET_NAME.getText()), asset.getName(),
                        "Asset name of Details does not match"));
        strategyMap.put("SerialNumber",
                () -> softAssert.assertEquals(getFieldBody(FieldName.SERIAL_NUMBER.getText()), asset.getSerialNumber(),
                        "Asset serial number of Details does not match"));
        strategyMap.put("Quantity",
                () -> softAssert.assertTrue(getFieldBody(FieldName.QUANTITY.getText())
                                .contains(Integer.toString((int) asset.getQuantity())),
                        "Asset quantity of Details does not match"));
        strategyMap.put("Price",
                () -> softAssert.assertTrue(getFieldBody(FieldName.PRICE.getText())
                                .contains(Integer.toString((int) asset.getPrice())),
                        "Asset price of Details does not match"));
        strategyMap.put("InstallDate",
                () -> softAssert.assertEquals(getFieldBody(FieldName.INSTALL_DATE.getText()), asset.getInstallDate(),
                        "Asset install Date of Details does not match"));
        strategyMap.put("PurchaseDate",
                () -> softAssert.assertEquals(getFieldBody(FieldName.PURCHASE_DATE.getText()), asset.getPurchaseDate(),
                        "Asset purchase Date of Details does not match"));
        strategyMap.put("UsageEndDate",
                () -> softAssert.assertEquals(getFieldBody(FieldName.USAGE_END_DATE.getText()), asset.getUsageEndDate(),
                        "Asset usage End Date of Details does not match"));
        fields.forEach(field -> {
            if (strategyMap.containsKey(field)) {
                strategyMap.get(field).run();
            }
        });
    }
}
