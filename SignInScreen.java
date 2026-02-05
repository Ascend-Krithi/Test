package com.dsg.automation.pages;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import com.dsg.automation.locators.SignInScreenLocators;

public class SignInScreen {

    // Then user should be navigated to sign in page in DSG application
    public void assertSignInPageDisplayed() {
        onView(withId(SignInScreenLocators.SIGN_IN_PAGE_TITLE)).check(matches(isDisplayed()));
    }

    // When user made a successful sign in after enter a valid username and password in DS
    public void enterUsername(String username) {
        onView(withId(SignInScreenLocators.USERNAME_FIELD)).perform(typeText(username));
    }

    public void enterPassword(String password) {
        onView(withId(SignInScreenLocators.PASSWORD_FIELD)).perform(typeText(password));
    }

    // And user tap on signIn button in Sign In screen in DSG application
    public void tapSignInButton() {
        onView(withId(SignInScreenLocators.SIGN_IN_SUBMIT_BUTTON)).perform(click());
    }
}
