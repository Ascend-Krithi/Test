import XCTest

class OrderConfirmationPage {
    let app = XCUIApplication()
    lazy var confirmationLabel = app.staticTexts["todo_confirmation_label"]
    func isOrderConfirmed() -> Bool {
        return confirmationLabel.exists
    }
}