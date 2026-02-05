import XCTest

class PaymentPage {
    let app = XCUIApplication()
    lazy var paymentMethodSection = app.otherElements["todo_payment_method_section"] // TODO: Replace
    lazy var creditCardInfoSection = app.otherElements["todo_credit_card_info_section"] // TODO: Replace
    lazy var saveButton = app.buttons["todo_save_cc"] // TODO: Replace
    func enterCreditCardDetails(cardNo: String, expDate: String, cvv: String) {
        // TODO: Enter card details
        saveButton.tap()
    }
    func isVisible() -> Bool {
        return app.otherElements["todo_payment_screen"].exists // TODO: Replace
    }
}