import XCTest

class LocationPermissionPage {
    let app = XCUIApplication()
    lazy var nextButton = app.buttons["todo_location_next"] // TODO: Replace
    func tapNextAndAllow() {
        nextButton.tap()
        // TODO: Handle location permission dialog
    }
    func isVisible() -> Bool {
        return app.otherElements["todo_location_permission_screen"].exists // TODO: Replace
    }
}