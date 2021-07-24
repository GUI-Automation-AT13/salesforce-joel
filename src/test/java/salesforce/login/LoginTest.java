/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.login;

import org.testng.annotations.BeforeSuite;
import salesforce.base.BaseTest;
import salesforce.config.EnvConfig;
import salesforce.ui.pages.HomePage;
import salesforce.ui.pages.assets.AssetPage;
import salesforce.ui.pages.assets.AssetDetailPage;

public class LoginTest extends BaseTest {

    protected AssetPage assetPage;
    protected AssetDetailPage assetDetailPage;

    @BeforeSuite
    public void login() {
        HomePage homePage = loginPage.loginSuccessful(EnvConfig.getInstance().getUsername(),
                EnvConfig.getInstance().getPassword());
        assetPage = pageTransporter.navigateToAssetPage();
    }
}
