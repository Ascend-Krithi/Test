import XCTest

class WaitUtils {
    static func waitForElementToExist(_ element: XCUIElement, timeout: TimeInterval = 10) {
        let exists = element.waitForExistence(timeout: timeout)
        XCTAssertTrue(exists, "Element \(element) did not appear")
    }
}