import XCTest

class SignInScreen {
    let app = XCUIApplication()
    var usernameField: XCUIElement { app.textFields["usernameField"] } // TODO: Replace with actual Accessibility ID
    var passwordField: XCUIElement { app.secureTextFields["passwordField"] } // TODO: Replace with actual Accessibility ID
    var signInButton: XCUIElement { app.buttons["signInScreenSignInButton"] } // TODO: Replace with actual Accessibility ID
    func signInWithValidCredentials() {
        let creds = TestDataUtils.getCredentials()
        WaitUtils.waitForElementToBeHittable(usernameField)
        usernameField.tap()
        usernameField.typeText(creds.username)
        passwordField.tap()
        passwordField.typeText(creds.password)
    }
    func tapSignInButton() {
        WaitUtils.waitForElementToBeHittable(signInButton)
        signInButton.tap()
    }
    func verifyIsVisible() {
        XCTAssertTrue(signInButton.exists)
    }
}