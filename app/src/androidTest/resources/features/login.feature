Feature: Login

  Scenario: Successful login
    Given the user is on the login screen
    When the user enters valid credentials
    And the user taps the login button
    Then the user should see the home screen
