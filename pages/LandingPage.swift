import XCTest

class LandingPage {
    let app = XCUIApplication()
    lazy var signInButton = app.buttons["todo_sign_in_button"]
    // TODO: Replace with actual Accessibility Identifier
    func tapSignIn() {
        signInButton.tap()
    }
}