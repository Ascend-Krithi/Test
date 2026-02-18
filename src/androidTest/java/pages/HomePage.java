package pages;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;

public class HomePage {
    public static final int SEARCH_BAR = R.id.todo_search_bar;
    public static final int SEARCH_BUTTON = R.id.todo_search_button;
    public static final int WELCOME_MESSAGE = R.id.todo_welcome_message;

    // TODO: Replace placeholder IDs with actual resource IDs

    public static void launch() {
        // TODO: Launch home activity
    }

    public static void enterSearchText(String text) {
        Espresso.onView(ViewMatchers.withId(SEARCH_BAR)).perform(ViewActions.replaceText(text));
    }

    public static void tapSearchButton() {
        Espresso.onView(ViewMatchers.withId(SEARCH_BUTTON)).perform(ViewActions.click());
    }

    public static void checkWelcomeMessage() {
        Espresso.onView(ViewMatchers.withId(WELCOME_MESSAGE)).check(matches(withText("Welcome")));
    }
}