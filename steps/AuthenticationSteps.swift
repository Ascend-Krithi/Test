import Cucumberish
import XCTest

class AuthenticationSteps {
    func setupSteps() {
        Given("Launch DSG Application") { _, _ in
            AppLaunchHelper.launchApp()
            return nil
        }
        Then("user should see user is on Dicks Sporting Goods application landing screen") { _, _ in
            LandingScreen().verifyIsVisible()
            return nil
        }
        When("user tap on sign in button in DSG application") { _, _ in
            LandingScreen().tapSignInButton()
            return nil
        }
        Then("user should be navigated to sign in page in DSG application") { _, _ in
            SignInScreen().verifyIsVisible()
            return nil
        }
        When("user made a successful sign in after enter a valid username and password in DSG application") { _, _ in
            SignInScreen().signInWithValidCredentials()
            return nil
        }
        And("user tap on signIn button in Sign In screen in DSG application") { _, _ in
            SignInScreen().tapSignInButton()
            return nil
        }
        And("user should see the location services screen in DSG application") { _, _ in
            LocationServicesScreen().verifyIsVisible()
            return nil
        }
        And("user tap on next button and allow location in DSG application") { _, _ in
            LocationServicesScreen().allowLocation()
            return nil
        }
        And("user should see the notification services screen in DSG application") { _, _ in
            NotificationServicesScreen().verifyIsVisible()
            return nil
        }
        And("user tap on next button in notification screen in DSG application") { _, _ in
            NotificationServicesScreen().allowNotifications()
            return nil
        }
        Then("user should be navigated to home screen in DSG application") { _, _ in
            HomeScreen().verifyIsVisible()
            return nil
        }
        And("user is able to see sign in user home screen in DSG application") { _, _ in
            HomeScreen().verifySignedInUser()
            return nil
        }
    }
}