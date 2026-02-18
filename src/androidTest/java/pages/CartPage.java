package pages;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.matcher.ViewMatchers;

public class CartPage {
    public static final int CART_ICON = R.id.todo_cart_icon;
    public static final int CART_LIST = R.id.todo_cart_list;
    public static final int CHECKOUT_BUTTON = R.id.todo_checkout_button;

    // TODO: Replace placeholder IDs with actual resource IDs

    public static void addProduct(String productName) {
        // TODO: Add product to cart
    }

    public static void removeProduct(String productName) {
        // TODO: Remove product from cart
    }

    public static void checkProductInCart(String productName) {
        // TODO: Check product is in cart
    }

    public static void checkCartIconCount(int count) {
        // TODO: Check cart icon displays correct count
    }

    public static void checkCartEmpty() {
        // TODO: Check cart is empty
    }

    public static void ensureCartHasItems() {
        // TODO: Ensure cart has items
    }

    public static void tapCheckoutButton() {
        Espresso.onView(ViewMatchers.withId(CHECKOUT_BUTTON)).perform(ViewActions.click());
    }

    public static void checkCartUnchanged() {
        // TODO: Check cart remains unchanged
    }
}