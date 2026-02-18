Feature: Rewards Checkout

  Scenario: User redeems reward at checkout
    Given the app is launched
    When the user is on the landing page
    And the user taps the Sign In button
    And the user enters valid credentials
    And the user submits the login form
    And the home page is displayed
    When the user navigates to Rewards
    And the user redeems a reward
    And the user proceeds to checkout
    Then the reward is applied at checkout