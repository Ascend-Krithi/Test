package steps;

import pages.LoginPage;
import pages.HomePage;
import utils.WaitUtils;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class LoginSteps {

    @Given("the user is on the login screen")
    public void userIsOnLoginScreen() {
        LoginPage.launch();
        WaitUtils.waitForView(LoginPage.USERNAME_FIELD);
    }

    @When("the user enters valid username \"testuser\" and password \"password123\"")
    public void userEntersValidCredentials() {
        LoginPage.enterUsername("testuser");
        LoginPage.enterPassword("password123");
    }

    @When("the user enters invalid username \"wronguser\" and password \"wrongpass\"")
    public void userEntersInvalidCredentials() {
        LoginPage.enterUsername("wronguser");
        LoginPage.enterPassword("wrongpass");
    }

    @And("the user taps the login button")
    public void userTapsLoginButton() {
        LoginPage.tapLoginButton();
    }

    @Then("the user should be navigated to the home screen")
    public void userNavigatedToHomeScreen() {
        WaitUtils.waitForView(HomePage.WELCOME_MESSAGE);
    }

    @Then("a welcome message should be displayed")
    public void welcomeMessageDisplayed() {
        HomePage.checkWelcomeMessage();
    }

    @Then("an error message \"Invalid credentials\" should be displayed")
    public void errorMessageDisplayed() {
        LoginPage.checkErrorMessage("Invalid credentials");
    }
}