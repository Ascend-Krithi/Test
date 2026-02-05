import XCTest

class CartPage {
    let app = XCUIApplication()
    lazy var checkoutButton = app.buttons["todo_checkout"]
    func tapCheckout() {
        checkoutButton.tap()
    }
}