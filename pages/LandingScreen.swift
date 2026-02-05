import XCTest

class LandingScreen {
    let app = XCUIApplication()
    var signInButton: XCUIElement { app.buttons["signInButton"] } // TODO: Replace with actual Accessibility ID
    func tapSignInButton() {
        WaitUtils.waitForElementToBeHittable(signInButton)
        signInButton.tap()
    }
    func verifyIsVisible() {
        XCTAssertTrue(signInButton.exists)
    }
}