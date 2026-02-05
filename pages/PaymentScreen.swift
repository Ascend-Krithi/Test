import XCTest

class PaymentScreen {
    let app = XCUIApplication()
    var paymentMethodSection: XCUIElement { app.otherElements["paymentMethodSection"] } // TODO: Replace with actual Accessibility ID
    var creditCardSection: XCUIElement { app.otherElements["creditCardSection"] } // TODO: Replace with actual Accessibility ID
    var cardNumberField: XCUIElement { app.textFields["cardNumberField"] } // TODO: Replace with actual Accessibility ID
    var expDateField: XCUIElement { app.textFields["expDateField"] } // TODO: Replace with actual Accessibility ID
    var cvvField: XCUIElement { app.secureTextFields["cvvField"] } // TODO: Replace with actual Accessibility ID
    var saveButton: XCUIElement { app.buttons["saveButton"] } // TODO: Replace with actual Accessibility ID
    func tapPaymentMethodSection() {
        WaitUtils.waitForElementToBeHittable(paymentMethodSection)
        paymentMethodSection.tap()
    }
    func tapCreditCardSection() {
        WaitUtils.waitForElementToBeHittable(creditCardSection)
        creditCardSection.tap()
    }
    func verifyCreditCardFields() {
        XCTAssertTrue(cardNumberField.exists)
        XCTAssertTrue(expDateField.exists)
        XCTAssertTrue(cvvField.exists)
    }
    func enterCreditCardDetails() {
        // TODO: Use test data
        cardNumberField.tap()
        cardNumberField.typeText("4111111111111111")
        expDateField.tap()
        expDateField.typeText("12/25")
        cvvField.tap()
        cvvField.typeText("123")
    }
    func tapSave() {
        WaitUtils.waitForElementToBeHittable(saveButton)
        saveButton.tap()
    }
}