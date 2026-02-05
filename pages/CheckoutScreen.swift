import XCTest

class CheckoutScreen {
    let app = XCUIApplication()
    var continueToPaymentButton: XCUIElement { app.buttons["continueToPaymentButton"] } // TODO: Replace with actual Accessibility ID
    var placeOrderButton: XCUIElement { app.buttons["placeOrderButton"] } // TODO: Replace with actual Accessibility ID
    func verifyIsVisible() {
        XCTAssertTrue(continueToPaymentButton.exists)
    }
    func tapContinueToPayment() {
        WaitUtils.waitForElementToBeHittable(continueToPaymentButton)
        continueToPaymentButton.tap()
    }
    func verifyPlaceOrderEnabled() {
        XCTAssertTrue(placeOrderButton.isEnabled)
    }
    func tapPlaceOrder() {
        WaitUtils.waitForElementToBeHittable(placeOrderButton)
        placeOrderButton.tap()
    }
}