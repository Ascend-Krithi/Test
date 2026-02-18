Feature: Product Search

  Scenario: Search for a product by name
    Given the user is on the home screen
    When the user enters "Running Shoes" in the search bar
    And the user taps the search button
    Then the search results should display products matching "Running Shoes"

  Scenario: Search returns no results
    Given the user is on the home screen
    When the user enters "NonExistentProduct" in the search bar
    And the user taps the search button
    Then a "No results found" message should be displayed