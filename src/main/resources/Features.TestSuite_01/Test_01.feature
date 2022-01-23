
Feature: Plugin.nop-station functionality

  Scenario: Check login is successfully with valid credentials
    Given browser is open
    And user is on login page
    When user enters username and password
    Then user is navigated to the home page


  Scenario:Successful checkout
    Given add an item to my shoping cart
    When click add to cart
    And select billing address and shipping address
    And select a shipping method
    And select a payment method
    And select a payment information
    And confirm order
    Then successfully check out

  Scenario: Check logout is successfully
    When user is logout
    Then logout successfully
    And browser is quit by driver
