Feature: Rewards in Order Summary

  Scenario: Verify reward should be displayed with the applied rewards in order summary
    Given Launch DSG Application
    Then user should see user is on Dicks Sporting Goods application landing screen
    Then user tap on sign in button in DSG application
    Then user should be navigated to sign in page in DSG application
    When user made a successful sign in after enter a valid username and password in DSG application
    And user tap on signin button in Sign In screen in DSG application
    And user should see the location services screen In DSG application
    And user tap on next button and allow location in DSG application
    And user should see the notification services screen in DSG application
    And user tap on next button in notification screen in DSG application
    Then user should be navigated to home screen in DSG application
    When user enters product keyword in search box in DSG application
    Then tap on View All button in DSG application
    Then user should be redirected to product listing screen in DSG application
    Then user tap on any product from the listing screen in DSG application
    Then user should be landing to product details page in DSG application
    When user should add all attribute value in DSG application
    Then user tap on add to cart button on PDP screen in DSG application
    Then user should see the View Cart Close icon in DSG application
    And user tap on View Cart button in the modal in DSG application
    And user should see the contact information in the next tab without Sign In Sign Up Tab in DSG application
    When user tap on Checkout button in the modal in DSG application
    And user tap on ContinueToPayment button in DSG application
    And user should be able view Revard under My Scorecard Rewards in DSG application
    And user should tap $10 Reward in DSG application
    And user should see reward applied in Order Summary in DSG application
    And user should see Order Summary display overall cost In DSG application
    And user able to remove added reward on tapping X close from order summary in DSG application
    And user should see Order Summary display overall cost in DSG application
    And user should tap $10 Reward in DSG application
    And user should see reward applied In Order Summary in DSG application
    And user should see Order Summary display overall cost in DSG application
    And user tap on reward and remove reward in DSG application
    And user should see Order Summary display overall cost in DSG application
    And user redirect back to Cart screen and remove the added products in DSG application