package cucumber.steps;

import core.selenium.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import salesforce.ui.PageTransporter;
import salesforce.ui.pages.assets.DeleteConfirmationPage;
import salesforce.ui.pages.assets.OptionMenuPage;

public class Hooks {

    private BaseUtil base;

    public Hooks(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void init() {
        base.driverManager = DriverManager.getInstance();
        base.pageTransporter = new PageTransporter();
        base.loginPage = base.pageTransporter.navigateToLoginPage();
    }

    @After
    public void tearDown() {
        OptionMenuPage optionMenuPage = base.assetDetailPage.clickCreatedAssetOptionBtn();
        DeleteConfirmationPage deleteConfirmationPage = optionMenuPage.clickDeleteBtn();
        deleteConfirmationPage.clickDeleteConfirmationBtn();
        base.pageTransporter.navigateToAssetPage();
        DriverManager.getInstance().getDriver().quit();
    }
}
