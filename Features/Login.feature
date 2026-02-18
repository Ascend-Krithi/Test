# language: en
@smoke
Feature: Login
  As a DSG user
  I want to log in to the app
  So that I can access my account

  Scenario: Successful login
    Given the app is launched
    And I am on the login screen
    When I enter valid credentials
    And I tap the login button
    Then I should see the home screen
