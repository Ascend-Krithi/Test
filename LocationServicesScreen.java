package com.dsg.automation.pages;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.espresso.action.ViewActions.click;

import com.dsg.automation.locators.LocationServicesScreenLocators;

public class LocationServicesScreen {

    // And user should see the location services screen in DSG application
    public void assertLocationServicesScreenDisplayed() {
        onView(withId(LocationServicesScreenLocators.LOCATION_SERVICES_TITLE)).check(matches(isDisplayed()));
    }

    // And user tap on next button and allow location in DSG application
    public void tapNextButton() {
        onView(withId(LocationServicesScreenLocators.LOCATION_NEXT_BUTTON)).perform(click());
    }

    public void allowLocation() {
        onView(withText(LocationServicesScreenLocators.ALLOW_LOCATION_TEXT)).perform(click());
    }
}
