import XCTest

class NotificationPermissionPage {
    let app = XCUIApplication()
    lazy var nextButton = app.buttons["todo_notification_next"]
    func allowNotification() {
        nextButton.tap()
        // TODO: Handle iOS notification permission dialog
    }
}