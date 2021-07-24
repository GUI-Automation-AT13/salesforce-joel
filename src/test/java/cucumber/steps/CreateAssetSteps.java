package cucumber.steps;

import core.selenium.DriverManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import salesforce.config.EnvConfig;
import salesforce.ui.PageTransporter;
import salesforce.ui.pages.HomePage;
import salesforce.ui.pages.LoginPage;
import salesforce.ui.pages.assets.*;

public class CreateAssetSteps {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected DriverManager driverManager;
    protected PageTransporter pageTransporter;
    protected AssetPage assetPage;
    protected AssetDetailPage assetDetailPage;
    SoftAssert softAssert = new SoftAssert();
    String recentDateString;

    @Before
    public void init() {
        driverManager = DriverManager.getInstance();
        pageTransporter = new PageTransporter();
        loginPage = pageTransporter.navigateToLoginPage();
    }

    @After
    public void tearDown() {
        OptionMenuPage optionMenuPage = assetDetailPage.clickCreatedAssetOptionBtn();
        DeleteConfirmationPage deleteConfirmationPage = optionMenuPage.clickDeleteBtn();
        deleteConfirmationPage.clickDeleteConfirmationBtn();
        pageTransporter.navigateToAssetPage();
        DriverManager.getInstance().getDriver().quit();
    }

    @Given("I login to salesforce site as an developer user")
    public void iLoginToSalesforceSiteAsAnDeveloperUser() {
        HomePage homePage = loginPage.loginSuccessful(EnvConfig.getInstance().getUsername(),
                EnvConfig.getInstance().getPassword());
    }

    @And("I navigate to Asset page")
    public void iNavigateToAssetPage() {
        assetPage = pageTransporter.navigateToAssetPage();
    }

    @When("I create a new Asset with fields")
    public void iCreateANewAssetWithFields(DataTable table) {
        Map<String, String> attributes = table.asMap(String.class, String.class);
        System.out.println(attributes.get("Asset name"));
        System.out.println(attributes.get("Account name"));
        NewAssetPage createAssetPage = assetPage.clickCreateAssetBtn();
        createAssetPage.setField("Asset Name", attributes.get("Asset name"))
                .clickField("Account")
                .clickRoleFirstOption();
        assetDetailPage = createAssetPage.clickSaveBtn();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        recentDateString = sdf.format(new Date());
    }

    @Then("A successful message of creating is display")
    public void aSuccessfulMessageOfCreatingIsDisplay() {
        softAssert.assertEquals(assetDetailPage.getActionMessage(),
                "Asset \"Name Asset 1\" was created.", "Message of creating is not correct");
    }

    @And("All header fields match")
    public void allHeaderFieldsMatch() {
        softAssert.assertEquals(assetDetailPage.getField("Account"), "cuenta 13",
                "Account name does not match");
    }

    @And("All detail fields match")
    public void allDetailFieldsMatch() {
    }

    @And("The title matches")
    public void theTitleMatches() {
        softAssert.assertEquals(assetDetailPage.getCreatedAssetTitleText(), "Name Asset 1",
                "Asset title does not match");
    }

    @And("The created date matches")
    public void theCreatedDateMatches() {
        softAssert.assertTrue(assetDetailPage.getCreatedDate().contains(recentDateString));
    }
}
