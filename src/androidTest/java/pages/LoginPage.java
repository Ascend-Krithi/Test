package pages;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;

public class LoginPage {
    public static final int USERNAME_FIELD = R.id.todo_username;
    public static final int PASSWORD_FIELD = R.id.todo_password;
    public static final int LOGIN_BUTTON = R.id.todo_login_button;
    public static final int ERROR_MESSAGE = R.id.todo_error_message;

    // TODO: Replace placeholder IDs with actual resource IDs

    public static void launch() {
        // TODO: Launch login activity
    }

    public static void enterUsername(String username) {
        Espresso.onView(ViewMatchers.withId(USERNAME_FIELD)).perform(ViewActions.replaceText(username));
    }

    public static void enterPassword(String password) {
        Espresso.onView(ViewMatchers.withId(PASSWORD_FIELD)).perform(ViewActions.replaceText(password));
    }

    public static void tapLoginButton() {
        Espresso.onView(ViewMatchers.withId(LOGIN_BUTTON)).perform(ViewActions.click());
    }

    public static void checkErrorMessage(String message) {
        Espresso.onView(ViewMatchers.withId(ERROR_MESSAGE)).check(matches(withText(message)));
    }
}