package com.dsg.app.pages;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.matcher.ViewMatchers;
import com.dsg.app.utils.WaitUtils;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;

public class LandingPage {
    public boolean isDisplayed() {
        try {
            WaitUtils.waitForView(ViewMatchers.withId(R.id.landing_root), 5000);
            Espresso.onView(ViewMatchers.withId(R.id.landing_root))
                    .check(matches(ViewMatchers.isDisplayed()));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public void tapSignIn() {
        WaitUtils.waitForView(ViewMatchers.withId(R.id.sign_in_button), 5000);
        Espresso.onView(ViewMatchers.withId(R.id.sign_in_button)).perform(click());
    }
    // TODO: Update R.id.* with actual resource IDs
}