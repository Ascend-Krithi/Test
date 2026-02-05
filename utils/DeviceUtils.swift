import XCTest

class DeviceUtils {
    static func setOrientation(_ orientation: UIDeviceOrientation) {
        XCUIDevice.shared.orientation = orientation
    }
    // TODO: Add more device actions
}