import XCTest

class SearchScreen {
    let app = XCUIApplication()
    var searchBox: XCUIElement { app.searchFields["searchBox"] } // TODO: Replace with actual Accessibility ID
    var viewAllButton: XCUIElement { app.buttons["viewAllButton"] } // TODO: Replace with actual Accessibility ID
    func enterProductKeyword() {
        WaitUtils.waitForElementToBeHittable(searchBox)
        searchBox.tap()
        searchBox.typeText("shoes") // TODO: Parameterize as needed
    }
    func tapViewAll() {
        WaitUtils.waitForElementToBeHittable(viewAllButton)
        viewAllButton.tap()
    }
}