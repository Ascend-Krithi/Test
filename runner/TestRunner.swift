import Cucumberish

@objc public class TestRunner: NSObject {
    @objc public class func setup() {
        SignInSteps().setupSteps()
        PaymentCheckoutSteps().setupSteps()
        RewardsOrderSummarySteps().setupSteps()
        TestHooks().setupHooks()
        let bundle = Bundle(for: TestRunner.self)
        Cucumberish.executeFeatures(inDirectory: "features", from: bundle, includeTags: nil, excludeTags: nil)
    }
}