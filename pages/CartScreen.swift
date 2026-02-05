import XCTest

class CartScreen {
    let app = XCUIApplication()
    var checkoutButton: XCUIElement { app.buttons["checkoutButton"] } // TODO: Replace with actual Accessibility ID
    func tapCheckout() {
        WaitUtils.waitForElementToBeHittable(checkoutButton)
        checkoutButton.tap()
    }
    func verifyIsVisible() {
        XCTAssertTrue(checkoutButton.exists)
    }
    func removeAllProducts() {
        // TODO: Implement product removal
    }
}