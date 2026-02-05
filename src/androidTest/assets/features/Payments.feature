Feature: Payments

  Scenario: Validating Payments scenarios-Sign in at checkout, verify contact Information displayed, confirm order placement with Visa
    Given Launch DSG Application
    Then user should see user is on Dicks Sporting Goods application landing screen
    When user tap on sign in button in DSG application
    When user made a successful sign in after enter a valid username and password in DSG 5BX application
    And user tap on signin button in Sign In screen in DSG SBX application
    And user should see the location services screen In DSG application
    And user tap on next button and allow location in DSG application
    And user should see the notification services screen in DSG application
    And user tap on next button in notification screen In DSG application
    Then user should be navigated to home screen in DSG application
    When user enters product keyword in search box In DSG application
    Then tap on View All button in DSG application
    Then user should be redirected to product listing screen In DSG application
    When user tap on any product from the listing screen in DSG application
    Then user should be landing to product details page in DSG application S0X
    When user should add all attribute value in DSG application
    Then user tap on add to cart button on PDP screen in DSG application 5BX
    And user tap on View Cart button in the modal in DSG application
    Then user should be displayed with the title CART with the Cart ID in DSG application
    When user tap on Checkout button in the modal in DSG application
    And user validate checkout screen in DSG application And user tap on ContinueToPayment button In DSG application
    And user tap on Payment Method section in DSG application
    When user tap on Credit Card Information section in DSG application
    Then user should see the Credit Card Information screen with below section/fields in DSG application
    And user should be allowed to enter CC details cardno, expdate and cvv manually in DSG application
    And user tap Save button in DSG application
    And user should be navigated to the Checkout screen in DSG application
    Then user should see PLACE ORDER button enabled in DSG application
    And user tap on Place Order button in DS6 application
    And user order should be processed and should displayed the Order Confirmation Screen with payment Method in DSG SBX application