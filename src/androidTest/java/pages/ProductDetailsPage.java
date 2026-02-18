package pages;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;

public class ProductDetailsPage {
    public static final int ADD_TO_CART_BUTTON = R.id.todo_add_to_cart;

    // TODO: Replace placeholder IDs with actual resource IDs

    public static void launch(String productName) {
        // TODO: Launch product details activity for productName
    }

    public static void tapAddToCart() {
        Espresso.onView(ViewMatchers.withId(ADD_TO_CART_BUTTON)).perform(ViewActions.click());
    }
}