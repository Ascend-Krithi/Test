import Cucumberish

@objc public class TestRunner: NSObject {
    @objc public class func setup() {
        AuthenticationSteps().setupSteps()
        PaymentsSteps().setupSteps()
        RewardsSteps().setupSteps()
        Hooks().setupHooks()
        let bundle = Bundle(for: TestRunner.self)
        Cucumberish.executeFeatures(inDirectory: "features", from: bundle, includeTags: nil, excludeTags: nil)
    }
}