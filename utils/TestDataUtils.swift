import Foundation

struct Credentials {
    let username: String
    let password: String
}

class TestDataUtils {
    static func getCredentials() -> Credentials {
        // TODO: Load from environment/config
        return Credentials(username: "test_user", password: "secure_password")
    }
}