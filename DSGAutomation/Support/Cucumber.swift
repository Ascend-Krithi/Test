import Foundation
import CucumberSwift

class CucumberSupport {
    static func setup() {
        Cucumber.instance.setup {
            Given("the app is launched") { _, _ in
                XCUIApplication().launch()
            }
            And("I am on the login screen") { _, _ in
                // Assume already on login screen after launch
            }
            When("I enter valid credentials") { _, _ in
                let app = XCUIApplication()
                app.textFields["Username"].tap()
                app.textFields["Username"].typeText("testuser")
                app.secureTextFields["Password"].tap()
                app.secureTextFields["Password"].typeText("password123")
            }
            And("I tap the login button") { _, _ in
                XCUIApplication().buttons["Login"].tap()
            }
            Then("I should see the home screen") { _, _ in
                XCTAssertTrue(XCUIApplication().otherElements["HomeScreen"].exists)
            }
        }
    }
}
