import XCTest

class ProductDetailsPage {
    let app = XCUIApplication()
    lazy var addToCartButton = app.buttons["todo_add_to_cart"] // TODO: Replace
    func addAttributesAndAddToCart() {
        // TODO: Select all required attributes
        addToCartButton.tap()
    }
    func isVisible() -> Bool {
        return app.otherElements["todo_product_details_screen"].exists // TODO: Replace
    }
}