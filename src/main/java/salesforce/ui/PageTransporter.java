/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.ui;

import core.selenium.DriverManager;
import salesforce.config.EnvConfig;
import salesforce.ui.pages.LoginPage;
import salesforce.ui.pages.assets.AssetPage;

/**
 * Controls navigation of pages.
 */
public class PageTransporter {
    private String baseUrl = EnvConfig.getInstance().getBaseurl();

    public void goToUrl(final String url) {
        DriverManager.getInstance().getDriver().navigate().to(url);
    }

    public AssetPage navigateToAssetPage() {
        goToUrl(baseUrl.concat(EnvConfig.getInstance().getEndpointUrl()));
        return new AssetPage();
    }

    public LoginPage navigateToLoginPage() {
        goToUrl(EnvConfig.getInstance().getLoginUrl());
        return new LoginPage();
    }
}
