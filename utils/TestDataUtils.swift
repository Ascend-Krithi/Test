import Foundation

class TestDataUtils {
    static func getCredentials() -> (username: String, password: String) {
        // TODO: Load credentials from EnvironmentConfig.json or env variables
        return ("test_user", "secure_password")
    }
}