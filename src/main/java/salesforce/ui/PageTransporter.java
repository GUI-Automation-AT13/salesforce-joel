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

    public static void goToUrl(final String url) {
        DriverManager.getInstance().getDriver().navigate().to(url);
    }

    /**
     * Navigates to asset page.
     *
     * @return an AssetPage entity.
     */
    public AssetPage navigateToAssetPage() {
        goToUrl(baseUrl.concat(EnvConfig.getInstance().getEndpointUrl()));
        return new AssetPage();
    }

    /**
     * Navigates to login page.
     *
     * @return a LoginPage entity.
     */
    public LoginPage navigateToLoginPage() {
        goToUrl(EnvConfig.getInstance().getLoginUrl());
        return new LoginPage();
    }

    /**
     * Navigates to any page.
     */
    public static void navigateToAnyPage(final String endpoint) {
        goToUrl(EnvConfig.getInstance().getBaseurl().concat(String.format(EnvConfig.getInstance().getEndpointUrl(),
                endpoint)));
    }
}
