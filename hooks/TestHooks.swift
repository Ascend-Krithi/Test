import Cucumberish

class TestHooks {
    func setupHooks() {
        before { _ in
            // TODO: Initialize app or reset state
        }
        after { scenario in
            // TODO: Capture screenshot on failure, cleanup
        }
    }
}