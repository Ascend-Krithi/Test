import XCTest

class ProductListingPage {
    let app = XCUIApplication()
    lazy var viewAllButton = app.buttons["todo_view_all"]
    func tapViewAll() {
        viewAllButton.tap()
    }
}