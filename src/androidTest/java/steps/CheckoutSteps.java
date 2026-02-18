package steps;

import pages.CartPage;
import pages.CheckoutPage;
import pages.OrderConfirmationPage;
import utils.WaitUtils;

public class CheckoutSteps {

    @Given("the user has items in the cart")
    public void userHasItemsInCart() {
        CartPage.ensureCartHasItems();
    }

    @When("the user proceeds to checkout")
    public void userProceedsToCheckout() {
        CartPage.tapCheckoutButton();
    }

    @When("enters valid payment details")
    public void userEntersValidPaymentDetails() {
        CheckoutPage.enterPaymentDetails(true);
    }

    @When("enters invalid payment details")
    public void userEntersInvalidPaymentDetails() {
        CheckoutPage.enterPaymentDetails(false);
    }

    @And("confirms the purchase")
    public void userConfirmsPurchase() {
        CheckoutPage.confirmPurchase();
    }

    @Then("an order confirmation screen should be displayed")
    public void orderConfirmationDisplayed() {
        WaitUtils.waitForView(OrderConfirmationPage.CONFIRMATION_MESSAGE);
    }

    @Then("the cart should be emptied")
    public void cartShouldBeEmptied() {
        CartPage.checkCartEmpty();
    }

    @Then("a payment error message should be displayed")
    public void paymentErrorMessageDisplayed() {
        CheckoutPage.checkPaymentErrorMessage();
    }

    @Then("the cart should remain unchanged")
    public void cartShouldRemainUnchanged() {
        CartPage.checkCartUnchanged();
    }
}