import XCTest

class NotificationServicesScreen {
    let app = XCUIApplication()
    var nextButton: XCUIElement { app.buttons["notificationNextButton"] } // TODO: Replace with actual Accessibility ID
    func allowNotifications() {
        WaitUtils.waitForElementToBeHittable(nextButton)
        nextButton.tap()
        PermissionUtils.allowNotificationsIfNeeded()
    }
    func verifyIsVisible() {
        XCTAssertTrue(nextButton.exists)
    }
}