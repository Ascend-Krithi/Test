import XCTest

class ProductDetailsPage {
    let app = XCUIApplication()
    lazy var addToCartButton = app.buttons["todo_add_to_cart"]
    func addToCart() {
        addToCartButton.tap()
    }
}