package pages;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;

public class CheckoutPage {
    public static final int PAYMENT_DETAILS_FIELD = R.id.todo_payment_details;
    public static final int CONFIRM_BUTTON = R.id.todo_confirm_button;
    public static final int PAYMENT_ERROR_MESSAGE = R.id.todo_payment_error;

    // TODO: Replace placeholder IDs with actual resource IDs

    public static void enterPaymentDetails(boolean valid) {
        String details = valid ? "valid_card_info" : "invalid_card_info";
        Espresso.onView(ViewMatchers.withId(PAYMENT_DETAILS_FIELD)).perform(ViewActions.replaceText(details));
    }

    public static void confirmPurchase() {
        Espresso.onView(ViewMatchers.withId(CONFIRM_BUTTON)).perform(ViewActions.click());
    }

    public static void checkPaymentErrorMessage() {
        Espresso.onView(ViewMatchers.withId(PAYMENT_ERROR_MESSAGE)).check(matches(withText("Payment error")));
    }
}