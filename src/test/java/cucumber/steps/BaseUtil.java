package cucumber.steps;

import core.selenium.DriverManager;
import org.testng.asserts.SoftAssert;
import salesforce.ui.PageTransporter;
import salesforce.ui.pages.LoginPage;
import salesforce.ui.pages.assets.AssetDetailPage;

public class BaseUtil {
    private LoginPage loginPage;
    private DriverManager driverManager;
    private PageTransporter pageTransporter;
    private AssetDetailPage assetDetailPage;
    private SoftAssert softAssert;

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public DriverManager getDriverManager() {
        return driverManager;
    }

    public PageTransporter getPageTransporter() {
        return pageTransporter;
    }

    public AssetDetailPage getAssetDetailPage() {
        return assetDetailPage;
    }

    public SoftAssert getSoftAssert() {
        return softAssert;
    }

    public void setLoginPage(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    public void setDriverManager(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    public void setPageTransporter(PageTransporter pageTransporter) {
        this.pageTransporter = pageTransporter;
    }

    public void setAssetDetailPage(AssetDetailPage assetDetailPage) {
        this.assetDetailPage = assetDetailPage;
    }

    public void setSoftAssert(SoftAssert softAssert) {
        this.softAssert = softAssert;
    }
}
