import XCTest

class NotificationPermissionPage {
    let app = XCUIApplication()
    lazy var nextButton = app.buttons["todo_notification_next"] // TODO: Replace
    func tapNext() {
        nextButton.tap()
        // TODO: Handle notification permission dialog
    }
    func isVisible() -> Bool {
        return app.otherElements["todo_notification_permission_screen"].exists // TODO: Replace
    }
}