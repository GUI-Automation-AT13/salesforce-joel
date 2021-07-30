package cucumber.steps;

import com.fasterxml.jackson.core.JsonProcessingException;
import core.utils.ToEntity;
import core.utils.dateconverter.DateConverter;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.Map;
import java.util.Set;
import salesforce.api.entity.Asset;
import salesforce.config.EnvConfig;
import salesforce.ui.PageTransporter;
import salesforce.ui.pages.assets.*;

public class CreateAssetSteps {

    private AssetPage assetPage;
    private String recentDateString;
    private Asset asset;
    private Set<String> fields;
    private BaseUtil base;

    public CreateAssetSteps(BaseUtil base) {
        this.base = base;
    }

    @Given("^I login to salesforce site as an? (.*?) user$")
    public void iLoginToSalesforceSiteAsAnDeveloperUser(final String userType) {
        base.getLoginPage().loginSuccessful(EnvConfig.getInstance().getUsername(),
                EnvConfig.getInstance().getPassword());
    }

    @And("^I navigate to (.*?) page$")
    public void iNavigateToAssetPage(final String endpoint) {
        PageTransporter.navigateToAnyPage(endpoint);
    }

    @When("I create a new Asset with fields")
    public void iCreateANewAssetWithFields(Map<String, String> table) throws JsonProcessingException {
        assetPage = new AssetPage();
        NewAssetPage createAssetPage = assetPage.clickCreateAssetBtn();
        asset = ToEntity.convert(table, Asset.class);
        asset.setName(asset.getName().concat(DateConverter.getRecentDate()));
        fields = table.keySet();
        base.setAssetDetailPage(createAssetPage.createAsset(fields, asset));
        recentDateString = DateConverter.getRecentDate();
    }

    @Then("Validate successful message of creating that is display")
    public void aSuccessfulMessageOfCreatingIsDisplay() {
        base.getSoftAssert().assertEquals(base.getAssetDetailPage().getActionMessage(), String.format("success\nAsset"
                + " \"%s\" was created.\nClose", asset.getName()), "Message of creating is not correct");
    }

    @And("Validate All header fields match")
    public void allHeaderFieldsMatch() {
        base.getAssetDetailPage().compareHeaderField(base.getSoftAssert(), fields, asset);
    }

    @And("Validate All detail fields match")
    public void allDetailFieldsMatch() {
        base.getAssetDetailPage().compareDetailField(base.getSoftAssert(), fields, asset);
    }

    @And("Validate The title matches")
    public void theTitleMatches() {
        base.getSoftAssert().assertEquals(base.getAssetDetailPage().getCreatedAssetTitleText(), asset.getName(),
                "Asset was not created");
    }

    @And("Validate The created date matches")
    public void theCreatedDateMatches() {
        base.getSoftAssert().assertTrue(base.getAssetDetailPage().getCreatedDate().contains(recentDateString));
    }
}
