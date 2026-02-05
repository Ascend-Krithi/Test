import XCTest

class RewardsScreen {
    let app = XCUIApplication()
    var rewardCell: XCUIElement { app.cells["rewardCell"] } // TODO: Replace with actual Accessibility ID
    var orderSummary: XCUIElement { app.otherElements["orderSummary"] } // TODO: Replace with actual Accessibility ID
    func verifyRewardVisible() {
        XCTAssertTrue(rewardCell.exists)
    }
    func tapReward() {
        WaitUtils.waitForElementToBeHittable(rewardCell)
        rewardCell.tap()
    }
    func verifyRewardApplied() {
        // TODO: Implement reward applied check
    }
    func verifyOrderSummaryCost() {
        XCTAssertTrue(orderSummary.exists)
    }
    func removeReward() {
        // TODO: Implement reward removal
    }
}