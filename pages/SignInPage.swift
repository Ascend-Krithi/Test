import XCTest

class SignInPage {
    let app = XCUIApplication()
    lazy var usernameField = app.textFields["todo_username"] // TODO: Replace
    lazy var passwordField = app.secureTextFields["todo_password"] // TODO: Replace
    lazy var signInButton = app.buttons["todo_sign_in_submit"] // TODO: Replace
    func enterCredentials(username: String, password: String) {
        usernameField.tap()
        usernameField.typeText(username)
        passwordField.tap()
        passwordField.typeText(password)
    }
    func tapSignIn() {
        signInButton.tap()
    }
    func isVisible() -> Bool {
        return app.otherElements["todo_sign_in_screen"].exists // TODO: Replace
    }
}