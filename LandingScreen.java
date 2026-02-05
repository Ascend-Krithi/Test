package com.dsg.automation.pages;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.action.ViewActions.click;

import com.dsg.automation.locators.LandingScreenLocators;

public class LandingScreen {

    // Then user should see user is on Dicks Sporting Goods application landing screen
    public void assertLandingScreenDisplayed() {
        onView(withId(LandingScreenLocators.LANDING_SCREEN_TITLE)).check(matches(isDisplayed()));
    }

    // When user tap on sign in button in DSG application
    public void tapSignInButton() {
        onView(withId(LandingScreenLocators.SIGN_IN_BUTTON)).perform(click());
    }
}
