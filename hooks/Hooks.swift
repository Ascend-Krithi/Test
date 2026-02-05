import Cucumberish
import XCTest

class Hooks {
    func setupHooks() {
        before { _ in
            DeviceUtils.resetApp()
        }
        after { scenario in
            if scenario?.testStatus == .failed {
                let screenshot = XCUIScreen.main.screenshot()
                let attachment = XCTAttachment(screenshot: screenshot)
                attachment.lifetime = .keepAlways
                XCTContext.runActivity(named: "Screenshot on Failure") { _ in
                    XCTContext.current.add(attachment)
                }
            }
        }
    }
}