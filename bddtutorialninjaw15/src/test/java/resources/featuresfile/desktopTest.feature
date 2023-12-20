Feature: Desktop Test

  Background:
    Given I am on homepage
    When I hover mouse on Desktop tab and click
    And  I click on Show all desktops link

  Scenario: verify Product Arrange In Alphabetical Order
    And  I select sort by position Name: Z to A
    Then I Verify the Product will arrange in Descending order

  Scenario: verify Product Added To Shopping Cart SuccessFully
    And I select sort by position Name: A to Z
    And I select product HP LP
    And I verify "HP LP3065"
    And I select delivery date
    And I enter quantity
    And I click on Add to Cart button
#    And I verify  Success message
    And I click on Shopping Cart link
    And I verify product "HP LP3065"
    And I verify delivery date "Delivery Date:2023-12-25"
    And I verify model "Product 21"
    Then I verify the total "$122.00"


