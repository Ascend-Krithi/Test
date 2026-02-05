package com.dsg.automation.tests;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.dsg.automation.pages.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class DSGSignInFlowTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    /**
     * BDD: Validate the user is able to sign in from sign in or sign up screen
     * Steps mapped below as comments.
     */
    @Test
    public void testDSGSignInFlow() {
        // Arrange
        LandingScreen landingScreen = new LandingScreen();
        SignInScreen signInScreen = new SignInScreen();
        LocationServicesScreen locationScreen = new LocationServicesScreen();
        NotificationServicesScreen notificationScreen = new NotificationServicesScreen();
        HomeScreen homeScreen = new HomeScreen();

        // Act & Assert

        // Given Launch DSG Application
        // (Handled by ActivityScenarioRule)

        // Then user should see user is on Dicks Sporting Goods application landing screen
        landingScreen.assertLandingScreenDisplayed();

        // When user tap on sign in button in DSG application
        landingScreen.tapSignInButton();

        // Then user should be navigated to sign in page in DSG application
        signInScreen.assertSignInPageDisplayed();

        // When user made a successful sign in after enter a valid username and password in DS
        signInScreen.enterUsername("validUsername");
        signInScreen.enterPassword("validPassword");

        // And user tap on signIn button in Sign In screen in DSG application
        signInScreen.tapSignInButton();

        // And user should see the location services screen in DSG application
        locationScreen.assertLocationServicesScreenDisplayed();

        // And user tap on next button and allow location in DSG application
        locationScreen.tapNextButton();
        locationScreen.allowLocation();

        // And user should see the notification services screen in DSG application
        notificationScreen.assertNotificationServicesScreenDisplayed();

        // And user tap on next button in notification screen in DSG application
        notificationScreen.tapNextButton();

        // Then user should be navigated to home screen in DSG application
        homeScreen.assertHomeScreenDisplayed();

        // And user is able to see sign in user home screen in DSG application
        homeScreen.assertSignedInUserIndicatorDisplayed();
    }
}
