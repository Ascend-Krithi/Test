package com.dsg.app.pageobjects;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static androidx.test.espresso.action.ViewActions.*;

public class LandingPage {
    public static boolean isDisplayed() {
        // TODO: Replace with actual resource id
        try {
            onView(withId(R.id.landing_screen)).check(matches(isDisplayed()));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void tapSignIn() {
        // TODO: Replace with actual resource id
        onView(withId(R.id.sign_in_button)).perform(click());
    }
}
