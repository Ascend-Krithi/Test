package com.dsg.app.pageobjects;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static androidx.test.espresso.assertion.ViewAssertions.*;

public class HomePage {
    public static boolean isDisplayed() {
        // TODO: Replace with actual resource id
        try {
            onView(withId(R.id.home_screen)).check(matches(isDisplayed()));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isUserSignedIn() {
        // TODO: Replace with actual resource id or logic
        try {
            onView(withId(R.id.user_profile_icon)).check(matches(isDisplayed()));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
