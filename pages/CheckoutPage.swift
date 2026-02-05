import XCTest

class CheckoutPage {
    let app = XCUIApplication()
    lazy var continueToPaymentButton = app.buttons["todo_continue_to_payment"]
    func tapContinueToPayment() {
        continueToPaymentButton.tap()
    }
}