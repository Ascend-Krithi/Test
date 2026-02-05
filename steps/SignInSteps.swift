import Cucumberish

class SignInSteps {
    func setupSteps() {
        Given("Launch DSG Application") { _,_ in
            // TODO: Launch app and verify initial state
            return nil
        }
        Then("user should see user is on Dicks Sporting Goods application landing screen") { _,_ in
            // TODO: Assert landing screen
            return nil
        }
        When("user tap on sign in button in DSG application") { _,_ in
            // TODO: Tap sign in button via LandingPage
            return nil
        }
        Then("user should be navigated to sign in page in DSG application") { _,_ in
            // TODO: Assert navigation to SignInPage
            return nil
        }
        When("user made a successful sign in after enter a valid username and password in DS") { _,_ in
            // TODO: Enter credentials and sign in
            return nil
        }
        And("user tap on signIn button in Sign In screen in DSG application") { _,_ in
            // TODO: Tap sign in on SignInPage
            return nil
        }
        And("user should see the location services screen in DSG application") { _,_ in
            // TODO: Assert LocationPermissionPage
            return nil
        }
        And("user tap on next button and allow location in DSG application") { _,_ in
            // TODO: Allow location permission
            return nil
        }
        And("user should see the notification services screen in DSG application") { _,_ in
            // TODO: Assert NotificationPermissionPage
            return nil
        }
        And("user tap on next button in notification screen in DSG application") { _,_ in
            // TODO: Allow notification permission
            return nil
        }
        Then("user should be navigated to home screen in DSG application") { _,_ in
            // TODO: Assert HomePage
            return nil
        }
        And("user is able to see sign in user home screen in DSG application") { _,_ in
            // TODO: Assert user is signed in
            return nil
        }
    }
}