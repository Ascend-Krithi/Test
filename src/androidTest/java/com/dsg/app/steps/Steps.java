package com.dsg.app.steps;

import androidx.test.platform.app.InstrumentationRegistry;
import com.dsg.app.pages.*;
import com.dsg.app.utils.*;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class Steps {
    private final LandingPage landingPage = new LandingPage();
    private final SignInPage signInPage = new SignInPage();
    private final LocationPage locationPage = new LocationPage();
    private final NotificationPage notificationPage = new NotificationPage();
    private final HomePage homePage = new HomePage();
    private final SearchPage searchPage = new SearchPage();
    private final ProductListingPage productListingPage = new ProductListingPage();
    private final ProductDetailsPage productDetailsPage = new ProductDetailsPage();
    private final CartPage cartPage = new CartPage();
    private final CheckoutPage checkoutPage = new CheckoutPage();
    private final PaymentPage paymentPage = new PaymentPage();
    private final OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage();
    private final RewardsPage rewardsPage = new RewardsPage();

    @Given("the app is launched")
    public void the_app_is_launched() {
        DeviceUtils.ensureAppLaunched();
    }

    @When("the user is on the landing page")
    public void the_user_is_on_the_landing_page() {
        assertTrue("Landing page not displayed", landingPage.isDisplayed());
    }

    @And("the user taps the Sign In button")
    public void the_user_taps_sign_in() {
        landingPage.tapSignIn();
    }

    @And("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        String username = InstrumentationRegistry.getArguments().getString("username", "defaultuser");
        String password = InstrumentationRegistry.getArguments().getString("password", "defaultpass");
        signInPage.enterCredentials(username, password);
    }

    @And("the user submits the login form")
    public void the_user_submits_login() {
        signInPage.tapLogin();
    }

    @Then("the home page is displayed")
    public void the_home_page_is_displayed() {
        assertTrue("Home page not displayed", homePage.isDisplayed());
    }

    @When("the user searches for {string}")
    public void the_user_searches_for_product(String product) {
        homePage.tapSearch();
        searchPage.enterQuery(product);
        searchPage.submitSearch();
    }

    @And("the user selects the first product")
    public void the_user_selects_first_product() {
        productListingPage.selectFirstProduct();
    }

    @And("the user adds the product to the cart")
    public void the_user_adds_product_to_cart() {
        productDetailsPage.addToCart();
    }

    @And("the user proceeds to checkout")
    public void the_user_proceeds_to_checkout() {
        cartPage.proceedToCheckout();
    }

    @And("the user selects Visa as payment method")
    public void the_user_selects_visa_payment() {
        paymentPage.selectVisa();
    }

    @And("the user completes the payment")
    public void the_user_completes_payment() {
        paymentPage.completePayment();
    }

    @Then("the order confirmation page is displayed")
    public void the_order_confirmation_page_is_displayed() {
        assertTrue("Order confirmation not displayed", orderConfirmationPage.isDisplayed());
    }

    @When("the user navigates to Rewards")
    public void the_user_navigates_to_rewards() {
        homePage.openRewards();
    }

    @And("the user redeems a reward")
    public void the_user_redeems_a_reward() {
        rewardsPage.redeemReward();
    }

    @Then("the reward is applied at checkout")
    public void the_reward_is_applied_at_checkout() {
        assertTrue("Reward not applied", checkoutPage.isRewardApplied());
    }
    // TODO: Add additional step definitions for all BDD scenarios from Excel
}