import XCTest

class ElementActions {
    static func tap(_ element: XCUIElement) {
        WaitUtils.waitForElementToExist(element)
        element.tap()
    }
    static func typeText(_ element: XCUIElement, text: String) {
        WaitUtils.waitForElementToExist(element)
        element.tap()
        element.typeText(text)
    }
}