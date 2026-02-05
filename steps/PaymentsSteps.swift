import Cucumberish
import XCTest

class PaymentsSteps {
    func setupSteps() {
        // Steps for payments scenario
        When("user enters product keyword in search box in DSG application") { _, _ in
            SearchScreen().enterProductKeyword()
            return nil
        }
        Then("tap on View All button in DSG application") { _, _ in
            SearchScreen().tapViewAll()
            return nil
        }
        Then("user should be redirected to product listing screen in DSG application") { _, _ in
            ProductListingScreen().verifyIsVisible()
            return nil
        }
        When("user tap on any product from the listing screen in DSG application") { _, _ in
            ProductListingScreen().tapAnyProduct()
            return nil
        }
        Then("user should be landing to product details page in DSG application") { _, _ in
            ProductDetailScreen().verifyIsVisible()
            return nil
        }
        When("user should add all attribute value in DSG application") { _, _ in
            ProductDetailScreen().addAllAttributes()
            return nil
        }
        Then("user tap on add to cart button on PDP screen in DSG application") { _, _ in
            ProductDetailScreen().tapAddToCart()
            return nil
        }
        And("user tap on View Cart button in the modal in DSG application") { _, _ in
            ProductDetailScreen().tapViewCart()
            return nil
        }
        Then("user should be displayed with the title CART with the Cart ID in DSG application") { _, _ in
            CartScreen().verifyIsVisible()
            return nil
        }
        When("user tap on Checkout button in the modal in DSG application") { _, _ in
            CartScreen().tapCheckout()
            return nil
        }
        And("user validate checkout screen in DSG application") { _, _ in
            CheckoutScreen().verifyIsVisible()
            return nil
        }
        And("user tap on ContinueToPayment button in DSG application") { _, _ in
            CheckoutScreen().tapContinueToPayment()
            return nil
        }
        And("user tap on Payment Method section in DSG application") { _, _ in
            PaymentScreen().tapPaymentMethodSection()
            return nil
        }
        When("user tap on Credit Card Information section in DSG application") { _, _ in
            PaymentScreen().tapCreditCardSection()
            return nil
        }
        Then("user should see the Credit Card Information screen with below section/fields in DSG application") { _, _ in
            PaymentScreen().verifyCreditCardFields()
            return nil
        }
        And("user should be allowed to enter CC details cardno, expdate and cvv manually in DSG application") { _, _ in
            PaymentScreen().enterCreditCardDetails()
            return nil
        }
        And("user tap Save button in DSG application") { _, _ in
            PaymentScreen().tapSave()
            return nil
        }
        And("user should be navigated to the Checkout screen in DSG application") { _, _ in
            CheckoutScreen().verifyIsVisible()
            return nil
        }
        Then("user should see PLACE ORDER button enabled in DSG application") { _, _ in
            CheckoutScreen().verifyPlaceOrderEnabled()
            return nil
        }
        And("user tap on Place Order button in DSG application") { _, _ in
            CheckoutScreen().tapPlaceOrder()
            return nil
        }
        And("user order should be processed and should displayed the Order Confirmation Screen with payment Method in DSG application") { _, _ in
            OrderConfirmationScreen().verifyIsVisible()
            return nil
        }
    }
}