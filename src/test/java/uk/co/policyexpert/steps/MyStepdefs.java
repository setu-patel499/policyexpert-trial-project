package uk.co.policyexpert.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.policyexpert.pages.HomePage;

public class MyStepdefs {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on helpCentre link$")
    public void iClickOnHelpCentreLink() {
        new HomePage().clickOnHelpCentreLink();
    }

    @And("^I mouse hover and click on searchbar$")
    public void iMouseHoverAndClickOnSearchbar() {
        new HomePage().clickOnSearchBar();
    }

    @Then("^I entre text \"([^\"]*)\"$")
    public void iEntreText(String text) {
        new HomePage().enterText(text);

    }

    @And("^I mouse hover and click on searchBtn$")
    public void iMouseHoverAndClickOnSearchBtn() {
        new HomePage().clickOnSearchBtn();
    }

    @Then("^I should able to verify text results$")
    public void iShouldAbleToVerifyTextResults() {
        String expectedMessage = "73 results for cheap home insurance";
        String actualMessage = new HomePage().getVerifyResults();
        Assert.assertEquals("text not displayed", expectedMessage, actualMessage);
    }
}
