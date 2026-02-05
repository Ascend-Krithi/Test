import XCTest

class CartPage {
    let app = XCUIApplication()
    lazy var checkoutButton = app.buttons["todo_checkout"] // TODO: Replace
    func tapCheckout() {
        checkoutButton.tap()
    }
    func isVisible() -> Bool {
        return app.otherElements["todo_cart_screen"].exists // TODO: Replace
    }
}