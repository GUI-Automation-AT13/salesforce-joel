package cucumber.steps;

import com.fasterxml.jackson.core.JsonProcessingException;
import core.utils.ToEntity;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import org.testng.asserts.SoftAssert;
import salesforce.api.entity.Asset;
import salesforce.config.EnvConfig;
import salesforce.ui.PageTransporter;
import salesforce.ui.pages.assets.*;

public class CreateAssetSteps {

    protected AssetPage assetPage;
    SoftAssert softAssert = new SoftAssert();
    String recentDateString;
    Asset asset;
    Set<String> fields;

    private BaseUtil base;

    public CreateAssetSteps(BaseUtil base) {
        this.base = base;
    }

    @Given("^I login to salesforce site as an? (.*?) user$")
    public void iLoginToSalesforceSiteAsAnDeveloperUser(final String userType) {
        base.loginPage.loginSuccessful(EnvConfig.getInstance().getUsername(),
                EnvConfig.getInstance().getPassword());
    }

    @And("^I navigate to (.*?) page$")
    public void iNavigateToAssetPage(final String endpoint) {
        PageTransporter.navigateToAnyPage(endpoint);
    }

    @When("I create a new Asset with fields")
    public void iCreateANewAssetWithFields(Map<String, String> table) throws JsonProcessingException, ClassNotFoundException {

        assetPage = new AssetPage();

        NewAssetPage createAssetPage = assetPage.clickCreateAssetBtn();
        asset = ToEntity.convert(table, Asset.class);

        fields = table.keySet();
        base.assetDetailPage = createAssetPage.createAsset(table.keySet(), asset);

        SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy");
        recentDateString = sdf.format(new Date());
    }

    @Then("Validate successful message of creating that is display")
    public void aSuccessfulMessageOfCreatingIsDisplay() {
        softAssert.assertEquals(base.assetDetailPage.getActionMessage(), "success\nAsset \"Name Asset 1\" was"
                + " created.\nClose", "Message of creating is not correct");
    }

    @And("Validate All header fields match")
    public void allHeaderFieldsMatch() {
        base.assetDetailPage.compareHeaderField(softAssert, fields, asset);
    }

    @And("Validate All detail fields match")
    public void allDetailFieldsMatch() {
        base.assetDetailPage.compareDetailField(softAssert, fields, asset);
    }

    @And("Validate The title matches")
    public void theTitleMatches() {
        softAssert.assertEquals(base.assetDetailPage.getCreatedAssetTitleText(), asset.getName(),
                "Asset was not created");
    }

    @And("Validate The created date matches")
    public void theCreatedDateMatches() {
        softAssert.assertTrue(base.assetDetailPage.getCreatedDate().contains(recentDateString));
        softAssert.assertAll();
    }
}
