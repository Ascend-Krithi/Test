import XCTest

class LandingPage {
    let app = XCUIApplication()
    lazy var signInButton = app.buttons["todo_sign_in_button"] // TODO: Replace with actual Accessibility ID
    func tapSignIn() {
        signInButton.tap()
    }
    func isVisible() -> Bool {
        return app.otherElements["todo_landing_screen"].exists // TODO: Replace
    }
}