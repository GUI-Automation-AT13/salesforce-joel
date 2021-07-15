package salesforce.login;

import org.testng.annotations.BeforeClass;
import salesforce.base.BaseTest;
import salesforce.config.EnvConfig;
import salesforce.ui.pages.HomePage;
import salesforce.ui.pages.assets.AssetPage;

public class LoginTest extends BaseTest {

    protected AssetPage assetPage;

    @BeforeClass
    public void login() {
        HomePage homePage = loginPage.loginSuccessful(EnvConfig.getInstance().getUsername(),
                EnvConfig.getInstance().getPassword());
        assetPage = pageTransporter.navigateToAssetPage();
    }
}
