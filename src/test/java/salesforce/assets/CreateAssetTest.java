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
import salesforce.ui.pages.assets.DeleteConfirmationPage;
import salesforce.ui.pages.assets.NewAssetPage;
import salesforce.ui.pages.assets.OptionMenuPage;

public class CreateAssetTest extends LoginTest {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testCreateAssetWithNecessaryAttributes() {
        NewAssetPage createAssetPage = assetPage.clickCreateAssetBtn();
        createAssetPage.setField("Asset Name", "Name Asset 1")
                .clickField("Account")
                .clickRoleFirstOption();
        assetDetailPage = createAssetPage.clickSaveBtn();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String recentDateString = sdf.format(new Date());
        softAssert.assertEquals(assetDetailPage.getField("Account"), "cuenta 13",
                "Account name does not match");
        softAssert.assertEquals(assetDetailPage.getActionMessage(),
                "Asset \"Name Asset 1\" was created.", "Message of creating is not correct");
        softAssert.assertTrue(assetDetailPage.getCreatedDate().contains(recentDateString));
        Assert.assertEquals(assetDetailPage.getCreatedAssetTitleText(), "Name Asset 1",
                "Asset was not created");
    }

    @Test
    public void testCreateAssetWithAllAttributes() {
        NewAssetPage createAssetPage = assetPage.clickCreateAssetBtn();
        createAssetPage.setField("Asset Name", "Name Asset 1")
                .setField("Serial Number", "Serial Number")
                .setField("Quantity", "10")
                .setField("Price", "100")
                .setDescription("Description")
                .setField("Install Date", "8/7/2021")
                .setField("Purchase Date", "15/7/2021")
                .setField("Usage End Date", "25/7/2021")
                .clickActive()
                .clickStatus()
                .clickStatusOptions()
                .clickField("Account")
                .clickRoleFirstOption()
                .clickField("Contact")
                .clickContactFirstOption()
                .clickField("Product")
                .clickProductFirstOption();
        assetDetailPage = createAssetPage.clickSaveBtn();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String recentDateString = sdf.format(new Date());
        softAssert.assertEquals(assetDetailPage.getField("Account"), "cuenta 13",
                "Account name from header does not match");
        softAssert.assertEquals(assetDetailPage.getField("Contact"), "contact 2",
                "Contact name from header does not match");
        softAssert.assertEquals(assetDetailPage.getBodyQuantity(), "100",
                "Asset quantity from header does not match");
        softAssert.assertEquals(assetDetailPage.getFieldBody("Asset Name"), "Serial Number",
                "Asset name does not match");
        softAssert.assertEquals(assetDetailPage.getFieldBody("Quantity"), "10",
                "Asset quantity does not match");
        softAssert.assertEquals(assetDetailPage.getFieldBody("Price"), "100",
                "Asset price does not match");
        softAssert.assertEquals(assetDetailPage.getFieldBody("Install Date"), "8/7/2021",
                "Asset install Date does not match");
        softAssert.assertEquals(assetDetailPage.getFieldBody("Purchase Date"), "15/7/2021",
                "Asset purchase Date does not match");
        softAssert.assertEquals(assetDetailPage.getFieldBody("Usage End Date"), "25/7/2021",
                "Asset usage End Date does not match");
        softAssert.assertEquals(assetDetailPage.getActionMessage(),
                "Asset \"Name Asset 1\" was created.", "Message of creating is not correct");
        softAssert.assertTrue(assetDetailPage.getCreatedDate().contains(recentDateString));
        Assert.assertEquals(assetDetailPage.getCreatedAssetTitleText(), "Name Asset 1",
                "Asset was not created");
    }

    @AfterMethod
    public void deleteAsset() {
        OptionMenuPage optionMenuPage = assetDetailPage.clickCreatedAssetOptionBtn();
        DeleteConfirmationPage deleteConfirmationPage = optionMenuPage.clickDeleteBtn();
        deleteConfirmationPage.clickDeleteConfirmationBtn();
        pageTransporter.navigateToAssetPage();
    }
}
