import XCTest

class SearchPage {
    let app = XCUIApplication()
    lazy var searchField = app.textFields["todo_search_box"] // TODO: Replace
    lazy var viewAllButton = app.buttons["todo_view_all"] // TODO: Replace
    func enterKeyword(_ keyword: String) {
        searchField.tap()
        searchField.typeText(keyword)
    }
    func tapViewAll() {
        viewAllButton.tap()
    }
}