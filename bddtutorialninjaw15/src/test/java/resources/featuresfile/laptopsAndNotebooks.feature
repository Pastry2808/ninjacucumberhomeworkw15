Feature: Laptops And Notebooks Test

  Background:
    Given I am on homepage
    When I hover mouse on LaptopAndNotebooks tab and click
    And  I click on Show all LaptopsAndNotebooks link
    And  I select sort by Price (High > Low)

  Scenario: verify Products Price Display High To Low Successfully

  Scenario: verify That User Place Order Successfully
    And I select product MacBook
    And I verify text "MacBook"
    And I click on Add to Cart
#    And I verify the message “Success: You have added MacBook to your shopping cart!”
    And I click Shopping Cart link
    And I verify product name "MacBook"
    And I change quantity to 2
    And I click on Update tab
#    And I verify update message “Success: You have modified your shopping cart!”
    And I verify total "$1,204.00"
    And I click on checkout button
    And I verify customer "New Customer"
    And I click on Guest checkout
    And I click on continue tab
    And I fill the mandatory fields
    And I click on continue button
    And I add comments
    And I click on the terms and conditions button
    And I click  on the continue button
#    Then I Verify message “Warning: Payment method required!”
