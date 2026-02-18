import XCTest
import CucumberSwift

class LoginTests: XCTestCase {
    func testSuccessfulLogin() {
        let app = XCUIApplication()
        app.launch()
        app.textFields["Username"].tap()
        app.textFields["Username"].typeText("testuser")
        app.secureTextFields["Password"].tap()
        app.secureTextFields["Password"].typeText("password123")
        app.buttons["Login"].tap()
        XCTAssertTrue(app.otherElements["HomeScreen"].exists)
    }
}
