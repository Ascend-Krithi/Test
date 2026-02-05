import XCTest

class SignInPage {
    let app = XCUIApplication()
    lazy var usernameField = app.textFields["todo_username"]
    lazy var passwordField = app.secureTextFields["todo_password"]
    lazy var signInButton = app.buttons["todo_sign_in_button"]
    // TODO: Replace with actual Accessibility Identifiers
    func signIn(username: String, password: String) {
        usernameField.tap()
        usernameField.typeText(username)
        passwordField.tap()
        passwordField.typeText(password)
        signInButton.tap()
    }
}