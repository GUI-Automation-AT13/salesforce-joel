package salesforce.login;

import org.testng.annotations.BeforeClass;
import salesforce.base.BaseTest;
import salesforce.config.EnvConfig;
import salesforce.ui.pages.HomePage;
import salesforce.ui.pages.assets.AssetPage;
import salesforce.ui.pages.assets.AssetDetailPage;

public class LoginTest extends BaseTest {

    protected AssetPage assetPage;
    protected AssetDetailPage assetDetailPage;

    @BeforeClass
    public void login() {
        HomePage homePage = loginPage.loginSuccessful(EnvConfig.getInstance().getUsername(),
                EnvConfig.getInstance().getPassword());
        assetPage = pageTransporter.navigateToAssetPage();
    }
}
