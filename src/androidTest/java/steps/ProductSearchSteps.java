package steps;

import pages.HomePage;
import pages.SearchPage;
import utils.WaitUtils;

public class ProductSearchSteps {

    @Given("the user is on the home screen")
    public void userIsOnHomeScreen() {
        HomePage.launch();
        WaitUtils.waitForView(HomePage.SEARCH_BAR);
    }

    @When("the user enters \"Running Shoes\" in the search bar")
    public void userEntersProductName() {
        HomePage.enterSearchText("Running Shoes");
    }

    @When("the user enters \"NonExistentProduct\" in the search bar")
    public void userEntersNonExistentProduct() {
        HomePage.enterSearchText("NonExistentProduct");
    }

    @And("the user taps the search button")
    public void userTapsSearchButton() {
        HomePage.tapSearchButton();
    }

    @Then("the search results should display products matching \"Running Shoes\"")
    public void searchResultsDisplayProducts() {
        SearchPage.checkResultsContain("Running Shoes");
    }

    @Then("a \"No results found\" message should be displayed")
    public void noResultsMessageDisplayed() {
        SearchPage.checkNoResultsMessage();
    }
}