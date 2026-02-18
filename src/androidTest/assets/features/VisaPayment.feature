Feature: Visa Payment

  Scenario: User completes a purchase with Visa
    Given the app is launched
    When the user is on the landing page
    And the user taps the Sign In button
    And the user enters valid credentials
    And the user submits the login form
    And the home page is displayed
    When the user searches for "Running Shoes"
    And the user selects the first product
    And the user adds the product to the cart
    And the user proceeds to checkout
    And the user selects Visa as payment method
    And the user completes the payment
    Then the order confirmation page is displayed