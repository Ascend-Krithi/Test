import XCTest

class ProductListingPage {
    let app = XCUIApplication()
    func tapProduct(at index: Int) {
        app.cells.element(boundBy: index).tap() // TODO: Use Accessibility ID
    }
    func isVisible() -> Bool {
        return app.otherElements["todo_product_listing_screen"].exists // TODO: Replace
    }
}