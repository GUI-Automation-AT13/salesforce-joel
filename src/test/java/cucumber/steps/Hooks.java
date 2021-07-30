package cucumber.steps;

import core.selenium.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.asserts.SoftAssert;
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
        base.setDriverManager(DriverManager.getInstance());
        base.setPageTransporter(new PageTransporter());
        base.setSoftAssert(new SoftAssert());
        base.setLoginPage(base.getPageTransporter().navigateToLoginPage());
    }

    @After
    public void tearDown() {
        OptionMenuPage optionMenuPage = base.getAssetDetailPage().clickCreatedAssetOptionBtn();
        DeleteConfirmationPage deleteConfirmationPage = optionMenuPage.clickDeleteBtn();
        deleteConfirmationPage.clickDeleteConfirmationBtn();
        base.getPageTransporter().navigateToAssetPage();
        DriverManager.getInstance().getDriver().quit();
        base.getSoftAssert().assertAll();
    }
}
