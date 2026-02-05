package com.dsg.automation.pages;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import com.dsg.automation.locators.HomeScreenLocators;

public class HomeScreen {

    // Then user should be navigated to home screen in DSG application
    public void assertHomeScreenDisplayed() {
        onView(withId(HomeScreenLocators.HOME_SCREEN_TITLE)).check(matches(isDisplayed()));
    }

    // And user is able to see sign in user home screen in DSG application
    public void assertSignedInUserIndicatorDisplayed() {
        onView(withId(HomeScreenLocators.USER_HOME_INDICATOR)).check(matches(isDisplayed()));
    }
}
