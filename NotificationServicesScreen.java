package com.dsg.automation.pages;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.action.ViewActions.click;

import com.dsg.automation.locators.NotificationServicesScreenLocators;

public class NotificationServicesScreen {

    // And user should see the notification services screen in DSG application
    public void assertNotificationServicesScreenDisplayed() {
        onView(withId(NotificationServicesScreenLocators.NOTIFICATION_SERVICES_TITLE)).check(matches(isDisplayed()));
    }

    // And user tap on next button in notification screen in DSG application
    public void tapNextButton() {
        onView(withId(NotificationServicesScreenLocators.NOTIFICATION_NEXT_BUTTON)).perform(click());
    }
}
