Feature: CheckOutAsGuest
  @CheckOutAsGuest
  Scenario: As guest User, I should be able to buy any Product
    Given I am On Home Page
    When I click on Add to cart button of HTC One M8 Android L 5.0 Lollipop product
    And I click on Shopping Button
    And I tick on terms and condition and I click on checkout button
    And I click on check out as guest
    And I enter Billing Address Details and click on continue button
    And I select Shipping method and I click on continue button
    And I select Payment method and I click on continue button
    And I enter credit Card details and I click on continue button
    And I click on Confirm button
    Then I verify checkout complete msg and order no is display


