package com.dsg.app.steps;

import io.cucumber.java.en.*;
import com.dsg.app.pageobjects.*;
import com.dsg.app.utils.*;
import static org.junit.Assert.*;

public class SignInSteps {
    @Given("Launch DSG Application")
    public void launchDSGApplication() {
        // TODO: Launch main activity if not already launched
    }

    @Then("user should see user is on Dicks Sporting Goods application landing screen")
    public void verifyLandingScreen() {
        assertTrue(LandingPage.isDisplayed());
    }

    @When("user tap on sign in button in DSG application")
    public void tapSignInButton() {
        LandingPage.tapSignIn();
    }

    @Then("user should be navigated to sign in page in DSG application")
    public void verifySignInPage() {
        assertTrue(SignInPage.isDisplayed());
    }

    @When("user made a successful sign in after enter a valid username and password in DS")
    public void enterCredentialsAndSignIn() {
        String username = DeviceUtils.getArgument("username");
        String password = DeviceUtils.getArgument("password");
        SignInPage.enterCredentials(username, password);
    }

    @And("user tap on signIn button in Sign In screen in DSG application")
    public void tapSignInOnSignInPage() {
        SignInPage.tapSignIn();
    }

    @And("user should see the location services screen in DSG application")
    public void verifyLocationScreen() {
        assertTrue(LocationPage.isDisplayed());
    }

    @And("user tap on next button and allow location in DSG application")
    public void allowLocation() {
        LocationPage.tapNext();
        PermissionUtils.allowLocation();
    }

    @And("user should see the notification services screen in DSG application")
    public void verifyNotificationScreen() {
        assertTrue(NotificationPage.isDisplayed());
    }

    @And("user tap on next button in notification screen in DSG application")
    public void allowNotification() {
        NotificationPage.tapNext();
        PermissionUtils.allowNotifications();
    }

    @Then("user should be navigated to home screen in DSG application")
    public void verifyHomeScreen() {
        assertTrue(HomePage.isDisplayed());
    }

    @And("user is able to see sign in user home screen in DSG application")
    public void verifySignedInHomeScreen() {
        assertTrue(HomePage.isUserSignedIn());
    }
}
