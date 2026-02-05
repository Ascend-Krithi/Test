import XCTest

class ElementActions {
    static func tap(_ element: XCUIElement) {
        WaitUtils.waitForElementToBeHittable(element)
        element.tap()
    }
    static func typeText(_ element: XCUIElement, text: String) {
        WaitUtils.waitForElementToBeHittable(element)
        element.tap()
        element.typeText(text)
    }
}