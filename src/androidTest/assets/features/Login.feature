Feature: Login Functionality

  Scenario: Successful login with valid credentials
    Given the user is on the login screen
    When the user enters valid username "testuser" and password "password123"
    And the user taps the login button
    Then the user should be navigated to the home screen
    And a welcome message should be displayed

  Scenario: Login fails with invalid credentials
    Given the user is on the login screen
    When the user enters invalid username "wronguser" and password "wrongpass"
    And the user taps the login button
    Then an error message "Invalid credentials" should be displayed