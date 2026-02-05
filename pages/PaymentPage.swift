import XCTest

class PaymentPage {
    let app = XCUIApplication()
    lazy var creditCardSection = app.otherElements["todo_credit_card_section"]
    lazy var saveButton = app.buttons["todo_save"]
    func enterCardDetails(cardNo: String, expDate: String, cvv: String) {
        // TODO: Implement card details entry
    }
    func tapSave() {
        saveButton.tap()
    }
}