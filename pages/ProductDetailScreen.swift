import XCTest

class ProductDetailScreen {
    let app = XCUIApplication()
    var addToCartButton: XCUIElement { app.buttons["addToCartButton"] } // TODO: Replace with actual Accessibility ID
    var viewCartButton: XCUIElement { app.buttons["viewCartButton"] } // TODO: Replace with actual Accessibility ID
    func addAllAttributes() {
        // TODO: Implement attribute selection
    }
    func tapAddToCart() {
        WaitUtils.waitForElementToBeHittable(addToCartButton)
        addToCartButton.tap()
    }
    func tapViewCart() {
        WaitUtils.waitForElementToBeHittable(viewCartButton)
        viewCartButton.tap()
    }
    func verifyIsVisible() {
        XCTAssertTrue(addToCartButton.exists)
    }
}