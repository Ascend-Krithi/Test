Feature: Checkout Process

  Scenario: Successful checkout with valid payment details
    Given the user has items in the cart
    When the user proceeds to checkout
    And enters valid payment details
    And confirms the purchase
    Then an order confirmation screen should be displayed
    And the cart should be emptied

  Scenario: Checkout fails with invalid payment details
    Given the user has items in the cart
    When the user proceeds to checkout
    And enters invalid payment details
    And confirms the purchase
    Then a payment error message should be displayed
    And the cart should remain unchanged