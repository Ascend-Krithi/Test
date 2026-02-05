import XCTest

class ProductListingScreen {
    let app = XCUIApplication()
    var productCell: XCUIElement { app.cells["productCell"] } // TODO: Replace with actual Accessibility ID
    func tapAnyProduct() {
        WaitUtils.waitForElementToBeHittable(productCell)
        productCell.tap()
    }
    func verifyIsVisible() {
        XCTAssertTrue(productCell.exists)
    }
}