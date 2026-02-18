package com.dsg.app.pages;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import com.dsg.app.utils.WaitUtils;

public class SignInPage {
    public void enterCredentials(String username, String password) {
        WaitUtils.waitForView(ViewMatchers.withId(R.id.username_field), 5000);
        Espresso.onView(ViewMatchers.withId(R.id.username_field))
                .perform(ViewActions.replaceText(username));
        Espresso.onView(ViewMatchers.withId(R.id.password_field))
                .perform(ViewActions.replaceText(password));
    }
    public void tapLogin() {
        WaitUtils.waitForView(ViewMatchers.withId(R.id.login_button), 5000);
        Espresso.onView(ViewMatchers.withId(R.id.login_button)).perform(ViewActions.click());
    }
    // TODO: Update R.id.* with actual resource IDs
}