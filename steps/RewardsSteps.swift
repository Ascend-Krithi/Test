import Cucumberish
import XCTest

class RewardsSteps {
    func setupSteps() {
        And("user should be able view Reward under My Scorecard Rewards in DSG application") { _, _ in
            RewardsScreen().verifyRewardVisible()
            return nil
        }
        And("user should tap $10 Reward in DSG application") { _, _ in
            RewardsScreen().tapReward()
            return nil
        }
        And("user should see reward applied in Order Summary in DSG application") { _, _ in
            RewardsScreen().verifyRewardApplied()
            return nil
        }
        And("user should see Order Summary display overall cost in DSG application") { _, _ in
            RewardsScreen().verifyOrderSummaryCost()
            return nil
        }
        And("user able to remove added reward on tapping X close from order summary in DSG application") { _, _ in
            RewardsScreen().removeReward()
            return nil
        }
        And("user tap on reward and remove reward in DSG application") { _, _ in
            RewardsScreen().removeReward()
            return nil
        }
        And("user redirect back to Cart screen and remove the added products in DSG application") { _, _ in
            CartScreen().removeAllProducts()
            return nil
        }
    }
}