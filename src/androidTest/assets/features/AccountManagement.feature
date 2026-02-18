Feature: Account Management

  Scenario: User signs in successfully
    Given the app is launched
    When the user is on the landing page
    And the user taps the Sign In button
    And the user enters valid credentials
    And the user submits the login form
    Then the home page is displayed