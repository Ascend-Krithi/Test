package steps;

import pages.ProductDetailsPage;
import pages.CartPage;
import utils.WaitUtils;

public class CartManagementSteps {

    @Given("the user is viewing the product details for \"Running Shoes\"")
    public void userViewingProductDetails() {
        ProductDetailsPage.launch("Running Shoes");
        WaitUtils.waitForView(ProductDetailsPage.ADD_TO_CART_BUTTON);
    }

    @When("the user taps the \"Add to Cart\" button")
    public void userTapsAddToCart() {
        ProductDetailsPage.tapAddToCart();
    }

    @Then("the product \"Running Shoes\" should be added to the cart")
    public void productAddedToCart() {
        CartPage.checkProductInCart("Running Shoes");
    }

    @Then("the cart icon should display 1 item")
    public void cartIconDisplaysOneItem() {
        CartPage.checkCartIconCount(1);
    }

    @Given("the cart contains \"Running Shoes\"")
    public void cartContainsProduct() {
        CartPage.addProduct("Running Shoes");
    }

    @When("the user removes \"Running Shoes\" from the cart")
    public void userRemovesProductFromCart() {
        CartPage.removeProduct("Running Shoes");
    }

    @Then("the cart should be empty")
    public void cartShouldBeEmpty() {
        CartPage.checkCartEmpty();
    }

    @Then("the cart icon should display 0 items")
    public void cartIconDisplaysZeroItems() {
        CartPage.checkCartIconCount(0);
    }
}