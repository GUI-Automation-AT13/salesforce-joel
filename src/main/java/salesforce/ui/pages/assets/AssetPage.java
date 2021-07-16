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
 * Represents asset principal page.
 */
public class AssetPage extends BasePage {

    @FindBy(css = ".forceActionLink > div")
    private WebElement createAssetBtn;

    public CreateAssetPage clickCreateAssetBtn() {
        createAssetBtn.click();
        return new CreateAssetPage();
    }

    @Override
    protected void waitForPageLoaded() {
        wait.until(ExpectedConditions.visibilityOf(createAssetBtn));
    }

    public WebElement getCreateAssetBtn() {
        return createAssetBtn;
    }
}
