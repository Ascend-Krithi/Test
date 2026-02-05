import XCTest

class CheckoutPage {
    let app = XCUIApplication()
    lazy var continueToPaymentButton = app.buttons["todo_continue_to_payment"] // TODO: Replace
    func tapContinueToPayment() {
        continueToPaymentButton.tap()
    }
    func isVisible() -> Bool {
        return app.otherElements["todo_checkout_screen"].exists // TODO: Replace
    }
}