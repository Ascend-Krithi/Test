import Foundation

class TestDataUtils {
    static func getTestCredentials() -> (username: String, password: String) {
        // TODO: Load from config/environment variables
        return ("test_user", "secure_password")
    }
}