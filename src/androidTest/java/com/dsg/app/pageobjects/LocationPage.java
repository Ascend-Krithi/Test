package com.dsg.app.pageobjects;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static androidx.test.espresso.action.ViewActions.*;

public class LocationPage {
    public static boolean isDisplayed() {
        // TODO: Replace with actual resource id
        try {
            onView(withId(R.id.location_screen)).check(matches(isDisplayed()));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void tapNext() {
        // TODO: Replace with actual resource id
        onView(withId(R.id.location_next_button)).perform(click());
    }
}
