import XCTest

class HomePage {
    let app = XCUIApplication()
    lazy var searchBox = app.searchFields["todo_search_box"]
    func enterSearchKeyword(_ keyword: String) {
        searchBox.tap()
        searchBox.typeText(keyword)
    }
}