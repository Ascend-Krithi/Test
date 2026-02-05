import XCTest

class OrderConfirmationPage {
    let app = XCUIApplication()
    func isVisible() -> Bool {
        return app.otherElements["todo_order_confirmation_screen"].exists // TODO: Replace
    }
    // TODO: Validate payment method
}