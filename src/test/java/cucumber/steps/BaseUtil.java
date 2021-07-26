package cucumber.steps;

import core.selenium.DriverManager;
import salesforce.ui.PageTransporter;
import salesforce.ui.pages.LoginPage;
import salesforce.ui.pages.assets.AssetDetailPage;

public class BaseUtil {
    public LoginPage loginPage;
    public DriverManager driverManager;
    public PageTransporter pageTransporter;
    public AssetDetailPage assetDetailPage;
}
