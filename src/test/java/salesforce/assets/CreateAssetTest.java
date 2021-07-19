/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.assets;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import salesforce.login.LoginTest;
import salesforce.ui.pages.assets.CreateAssetPage;
import salesforce.ui.pages.assets.DeleteConfirmationPage;
import salesforce.ui.pages.assets.OptionMenuPage;

public class CreateAssetTest extends LoginTest {

    @Test
    public void testCreateAssetWithNecesaryAttributes() {
        CreateAssetPage createAssetPage = assetPage.clickCreateAssetBtn();
        createAssetPage.setUserName("Name Asset 1");
        createAssetPage.clickRoleOption();
        createAssetPage.clickRoleFirstOption();
        createdAssetPage = createAssetPage.clickSaveBtn();
        Assert.assertEquals(createdAssetPage.getCreatedAssetTitleText(), "Name Asset 1",
                "Asset was not created");
    }

    @Test
    public void testCreateAssetWithAllAttributes() {
        CreateAssetPage createAssetPage = assetPage.clickCreateAssetBtn();
        createAssetPage.setUserName("Name Asset 1");
        createAssetPage.setSerialNumber("Serial Number");
        createAssetPage.setQuantity("10");
        createAssetPage.setPrice("100");
        createAssetPage.setDescriptionTxtBox("Description");
        createAssetPage.setInstallDateCalendar("8/7/2021");
        createAssetPage.setPurchaseDateCalendar("15/7/2021");
        createAssetPage.setUsageDateCalendar("25/7/2021");
        createAssetPage.clickActive();
        createAssetPage.clickStatus();
        createAssetPage.clickStatusOptions();
        createAssetPage.clickRoleOption();
        createAssetPage.clickRoleFirstOption();
        createAssetPage.clickContactOption();
        createAssetPage.clickContactFirstOption();
        createAssetPage.clickProductOption();
        createAssetPage.clickProductFirstOption();
        createdAssetPage = createAssetPage.clickSaveBtn();
        Assert.assertEquals(createdAssetPage.getCreatedAssetTitleText(), "Name Asset 1",
                "Asset was not created");
    }

    @AfterClass
    public void deleteAsset() {
        OptionMenuPage optionMenuPage = createdAssetPage.clickCreatedAssetOptionBtn();
        DeleteConfirmationPage deleteConfirmationPage = optionMenuPage.clickDeleteBtn();
        deleteConfirmationPage.clickDeleteConfirmationBtn();
        pageTransporter.navigateToAssetPage();
    }

}
