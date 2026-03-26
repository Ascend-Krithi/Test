package com.dsg.stepdefinitions;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import com.dsg.pageobjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("^the user is on the login screen$")
    public void userOnLoginScreen() {
        // Assume app launches to login screen
    }

    @When("^the user enters valid credentials$")
    public void userEntersValidCredentials() {
        Espresso.onView(ViewMatchers.withId(LoginPage.USERNAME_FIELD))
                .perform(ViewActions.typeText("testuser"));
        Espresso.onView(ViewMatchers.withId(LoginPage.PASSWORD_FIELD))
                .perform(ViewActions.typeText("password"));
        Espresso.closeSoftKeyboard();
    }

    @When("^the user taps the login button$")
    public void userTapsLoginButton() {
        Espresso.onView(ViewMatchers.withId(LoginPage.LOGIN_BUTTON))
                .perform(ViewActions.click());
    }

    @Then("^the user should see the home screen$")
    public void userSeesHomeScreen() {
        Espresso.onView(ViewMatchers.withId(LoginPage.HOME_SCREEN))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}
