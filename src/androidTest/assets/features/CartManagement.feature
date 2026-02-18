Feature: Cart Management

  Scenario: Add a product to the cart
    Given the user is viewing the product details for "Running Shoes"
    When the user taps the "Add to Cart" button
    Then the product "Running Shoes" should be added to the cart
    And the cart icon should display 1 item

  Scenario: Remove a product from the cart
    Given the cart contains "Running Shoes"
    When the user removes "Running Shoes" from the cart
    Then the cart should be empty
    And the cart icon should display 0 items