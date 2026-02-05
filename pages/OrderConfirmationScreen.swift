import XCTest

class OrderConfirmationScreen {
    let app = XCUIApplication()
    var confirmationLabel: XCUIElement { app.staticTexts["orderConfirmationLabel"] } // TODO: Replace with actual Accessibility ID
    func verifyIsVisible() {
        XCTAssertTrue(confirmationLabel.exists)
    }
}