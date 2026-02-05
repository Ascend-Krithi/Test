import XCTest

class HomePage {
    let app = XCUIApplication()
    func isVisible() -> Bool {
        return app.otherElements["todo_home_screen"].exists // TODO: Replace
    }
    // TODO: Add methods for signed-in user validation
}