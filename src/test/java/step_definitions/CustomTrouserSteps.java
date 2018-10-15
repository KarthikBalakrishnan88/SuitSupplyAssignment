package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import listener.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.Page;
import support.TestProperties;

public class CustomTrouserSteps {
    private WebDriver driver = Browser.getDriver();
    private Page page = new Page();

    @Given("^I navigate to the custom made trousers page$")
    public void iNavigateToTheCustomMadeTrouserPage() {
        String appUrl = TestProperties.loadProperty().getProperty("application.host");
        driver.navigate().to(appUrl + "/on/demandware.store/Sites-INT-Site/en/Configurator-Show?type=trousers");
    }

    @Given("^Im on the customise trouser page$")
    public void imOnTheCustomiseTrouserPage() {
        Assert.assertTrue(page.customDriverPage.customTrouserHeader.isDisplayed());
    }

    @And("^I select the Fabric as \"([^\"]*)\"$")
    public void iSelectTheFabricAs(String fabric) throws InterruptedException {
        Assert.assertTrue(page.customDriverPage.slidePanel.isDisplayed());
        page.customDriverPage.selectFabric(fabric);
    }

    @And("^I select the Fit as \"([^\"]*)\"$")
    public void iSelectTheFitAs(String fit) throws InterruptedException {
        Assert.assertTrue(page.customDriverPage.slidePanel.isDisplayed());
        page.customDriverPage.selectFit(fit);

    }

    @And("^I select the Turn up as \"([^\"]*)\"$")
    public void iSelectTheTurnUpAs(String turnUp) throws InterruptedException {
        Assert.assertTrue(page.customDriverPage.slidePanel.isDisplayed());
        page.customDriverPage.selectTurnUp(turnUp);

    }

    @And("^I select the belt loop as \"([^\"]*)\"$")
    public void iSelectTheBeltLoopAs(String belt) throws InterruptedException {
        Assert.assertTrue(page.customDriverPage.slidePanel.isDisplayed());
        page.customDriverPage.selectBelt(belt);

    }

    @And("^I select the size as \"([^\"]*)\"$")
    public void iSelectTheSizeAs(String size) throws InterruptedException {
        Assert.assertTrue(page.customDriverPage.slidePanel.isDisplayed());
        page.customDriverPage.selectSize(size);

    }

    @When("^I click on Add to bag$")
    public void iClickOnAddToBag() throws Throwable {
        page.customDriverPage.addToBagButton.click();
    }

    @Then("^my order should be in the bucket$")
    public void myOrderShouldBeInTheBucket()  {
        Assert.assertTrue(page.customDriverPage.bucket.isDisplayed());
    }
}


