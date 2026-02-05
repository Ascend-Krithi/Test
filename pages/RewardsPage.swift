import XCTest

class RewardsPage {
    let app = XCUIApplication()
    lazy var rewardButton = app.buttons["todo_reward_button"]
    func applyReward() {
        rewardButton.tap()
    }
    func removeReward() {
        // TODO: Implement reward removal logic
    }
}