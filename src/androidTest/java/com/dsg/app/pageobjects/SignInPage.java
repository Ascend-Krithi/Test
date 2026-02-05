package com.dsg.app.pageobjects;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static androidx.test.espresso.action.ViewActions.*;

public class SignInPage {
    public static boolean isDisplayed() {
        // TODO: Replace with actual resource id
        try {
            onView(withId(R.id.sign_in_screen)).check(matches(isDisplayed()));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void enterCredentials(String username, String password) {
        // TODO: Replace with actual resource ids
        onView(withId(R.id.username_field)).perform(typeText(username));
        onView(withId(R.id.password_field)).perform(typeText(password));
    }

    public static void tapSignIn() {
        // TODO: Replace with actual resource id
        onView(withId(R.id.sign_in_button)).perform(click());
    }
}
