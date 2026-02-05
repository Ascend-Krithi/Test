import XCTest

class LocationPermissionPage {
    let app = XCUIApplication()
    lazy var nextButton = app.buttons["todo_location_next"]
    func allowLocation() {
        nextButton.tap()
        // TODO: Handle iOS location permission dialog
    }
}