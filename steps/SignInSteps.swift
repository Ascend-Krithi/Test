import Cucumberish

class SignInSteps {
    func setupSteps() {
        Given("Launch DSG Application") { _,_ in
            // TODO: Launch app using XCUIApplication()
        }
        Then("user should see user is on Dicks Sporting Goods application landing screen") { _,_ in
            // TODO: Assert landing screen visible via LandingPage
        }
        When("user tap on sign in button in DSG application") { _,_ in
            // TODO: Tap sign in button via LandingPage
        }
        Then("user should be navigated to sign in page in DSG application") { _,_ in
            // TODO: Assert navigation to SignInPage
        }
        When("user made a successful sign in after enter a valid username and password in DSG application") { _,_ in
            // TODO: Enter credentials via SignInPage
        }
        And("user tap on signIn button in Sign In screen in DSG application") { _,_ in
            // TODO: Tap signIn button via SignInPage
        }
        And("user should see the location services screen in DSG application") { _,_ in
            // TODO: Assert LocationPermissionPage visible
        }
        And("user tap on next button and allow location in DSG application") { _,_ in
            // TODO: Tap next and allow location via LocationPermissionPage
        }
        And("user should see the notification services screen in DSG application") { _,_ in
            // TODO: Assert NotificationPermissionPage visible
        }
        And("user tap on next button in notification screen in DSG application") { _,_ in
            // TODO: Tap next via NotificationPermissionPage
        }
        Then("user should be navigated to home screen in DSG application") { _,_ in
            // TODO: Assert HomePage visible
        }
        And("user is able to see sign in user home screen in DSG application") { _,_ in
            // TODO: Assert HomePage for signed-in user
        }
    }
}