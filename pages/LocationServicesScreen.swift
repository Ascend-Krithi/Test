import XCTest

class LocationServicesScreen {
    let app = XCUIApplication()
    var nextButton: XCUIElement { app.buttons["locationNextButton"] } // TODO: Replace with actual Accessibility ID
    func allowLocation() {
        WaitUtils.waitForElementToBeHittable(nextButton)
        nextButton.tap()
        PermissionUtils.allowLocationIfNeeded()
    }
    func verifyIsVisible() {
        XCTAssertTrue(nextButton.exists)
    }
}