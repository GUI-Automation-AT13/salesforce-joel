/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.assets;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import salesforce.login.LoginTest;
import salesforce.ui.FieldName;
import salesforce.ui.pages.assets.DeleteConfirmationPage;
import salesforce.ui.pages.assets.NewAssetPage;
import salesforce.ui.pages.assets.OptionMenuPage;

public class CreateAssetTest extends LoginTest {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testCreateAssetWithNecessaryAttributes() {
        String assetName = "Name Asset 1";
        NewAssetPage createAssetPage = assetPage.clickCreateAssetBtn();
        createAssetPage.setField(FieldName.ASSET_NAME.getText(), assetName)
                .clickField(FieldName.ACCOUNT.getText())
                .clickRoleFirstOption();
        assetDetailPage = createAssetPage.clickSaveBtn();
        SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy");
        String recentDateString = sdf.format(new Date());
        softAssert.assertEquals(assetDetailPage.getField(FieldName.ACCOUNT.getText()), "cuenta 13",
                "Account name does not match");
        softAssert.assertEquals(assetDetailPage.getActionMessage(), "success\nAsset \"Name Asset 1\" was"
                + " created.\nClose", "Message of creating is not correct");
        softAssert.assertTrue(assetDetailPage.getCreatedDate().contains(recentDateString));
        Assert.assertEquals(assetDetailPage.getCreatedAssetTitleText(), assetName,
                "Asset was not created");
        softAssert.assertAll();
    }

    @Test
    public void testCreateAssetWithAllAttributes() {
        String assetName = "Name Asset 1";
        String serialNumber = "Serial Number";
        String quantity = "10";
        String price = "100";
        String description = "Description";
        String installDate = "8/7/2021";
        String purchaseDate = "15/7/2021";
        String usageEndDate = "25/7/2021";
        String accountName = "cuenta 13";
        String contactName = "contact 2";
        NewAssetPage createAssetPage = assetPage.clickCreateAssetBtn();
        createAssetPage.setField(FieldName.ASSET_NAME.getText(), assetName)
                .setField(FieldName.SERIAL_NUMBER.getText(), serialNumber)
                .setField(FieldName.QUANTITY.getText(), quantity)
                .setField(FieldName.PRICE.getText(), price)
                .setDescription(description)
                .setField(FieldName.INSTALL_DATE.getText(), installDate)
                .setField(FieldName.PURCHASE_DATE.getText(), purchaseDate)
                .setField(FieldName.USAGE_END_DATE.getText(), usageEndDate)
                .clickActive()
                .clickStatus()
                .clickStatusOptions()
                .clickField(FieldName.ACCOUNT.getText())
                .clickRoleFirstOption()
                .clickField(FieldName.CONTACT.getText())
                .clickContactFirstOption()
                .clickField(FieldName.PRODUCT.getText())
                .clickProductFirstOption();
        assetDetailPage = createAssetPage.clickSaveBtn();
        SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy");
        String recentDateString = sdf.format(new Date());
        softAssert.assertEquals(assetDetailPage.getField(FieldName.ACCOUNT.getText()), accountName,
                "Account name from header does not match");
        softAssert.assertEquals(assetDetailPage.getField(FieldName.CONTACT.getText()), contactName,
                "Contact name from header does not match");
        softAssert.assertTrue(assetDetailPage.getBodyQuantity().contains(quantity),
                "Asset quantity from header does not match");
        softAssert.assertEquals(assetDetailPage.getFieldBody(FieldName.ASSET_NAME.getText()), assetName,
                "Asset name does not match");
        softAssert.assertEquals(assetDetailPage.getFieldBody(FieldName.SERIAL_NUMBER.getText()), serialNumber,
                "Asset name does not match");
        softAssert.assertTrue(assetDetailPage.getFieldBody(FieldName.QUANTITY.getText()).contains(quantity),
                "Asset quantity does not match");
        softAssert.assertTrue(assetDetailPage.getFieldBody(FieldName.PRICE.getText()).contains(price),
                "Asset price does not match");
        softAssert.assertEquals(assetDetailPage.getFieldBody(FieldName.INSTALL_DATE.getText()), installDate,
                "Asset install Date does not match");
        softAssert.assertEquals(assetDetailPage.getFieldBody(FieldName.PURCHASE_DATE.getText()), purchaseDate,
                "Asset purchase Date does not match");
        softAssert.assertEquals(assetDetailPage.getFieldBody(FieldName.USAGE_END_DATE.getText()), usageEndDate,
                "Asset usage End Date does not match");
        softAssert.assertEquals(assetDetailPage.getActionMessage(),
                "success\nAsset \"Name Asset 1\" was created.\nClose",
                "Message of creating is not correct");
        softAssert.assertTrue(assetDetailPage.getCreatedDate().contains(recentDateString));
        Assert.assertEquals(assetDetailPage.getCreatedAssetTitleText(), assetName,
                "Asset was not created");
        softAssert.assertAll();
    }

    @AfterMethod
    public void deleteAsset() {
        OptionMenuPage optionMenuPage = assetDetailPage.clickCreatedAssetOptionBtn();
        DeleteConfirmationPage deleteConfirmationPage = optionMenuPage.clickDeleteBtn();
        deleteConfirmationPage.clickDeleteConfirmationBtn();
        pageTransporter.navigateToAssetPage();
    }
}
