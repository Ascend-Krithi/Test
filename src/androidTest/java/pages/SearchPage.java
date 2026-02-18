package pages;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.matcher.ViewMatchers;

public class SearchPage {
    public static final int RESULTS_LIST = R.id.todo_results_list;
    public static final int NO_RESULTS_MESSAGE = R.id.todo_no_results_message;

    // TODO: Replace placeholder IDs with actual resource IDs

    public static void checkResultsContain(String productName) {
        // TODO: Implement check for product in results
    }

    public static void checkNoResultsMessage() {
        Espresso.onView(ViewMatchers.withId(NO_RESULTS_MESSAGE)).check(matches(withText("No results found")));
    }
}