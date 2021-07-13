package salesforce.login;

import config.EnvironmentVariable;
import org.testng.annotations.BeforeClass;
import salesforce.base.BaseTest;
import salesforce.ui.pages.HomePage;

public class LoginTest extends BaseTest {

    @BeforeClass
    public void login() {
        HomePage homePage = loginPage.loginSuccessful("jrojas@freeorg01.com", "fundacionjalaat13");
        driver.get(EnvironmentVariable.PROPERTIES.getProperty("Endpoint_url"));
    }

}
