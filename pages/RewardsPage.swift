import XCTest

class RewardsPage {
    let app = XCUIApplication()
    lazy var rewardButton = app.buttons["todo_reward_button"] // TODO: Replace
    func tapReward() {
        rewardButton.tap()
    }
    func removeReward() {
        // TODO: Tap X/close to remove reward
    }
    func isVisible() -> Bool {
        return app.otherElements["todo_rewards_screen"].exists // TODO: Replace
    }
}