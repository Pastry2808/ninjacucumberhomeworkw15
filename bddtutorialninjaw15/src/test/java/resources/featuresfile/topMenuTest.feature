Feature: Top Menu Test

  Background:
    Given I am on homepage

  Scenario: Verify User Should Navigate To Desktops Page Successfully
    When I hover mouse on Desktop tab and click
    And  I click on Show all desktops link
    Then I verify the text "Desktops"

  Scenario: Verify User Should Navigate To Laptops And Notebooks Page Successfully
    When I hover mouse on LaptopAndNotebooks tab and click
    And  I click on Show all LaptopsAndNotebooks link
    Then I verify the message "Laptops & Notebooks"

  Scenario: Verify User Should Navigate To Components Page Successfully
    When I hover mouse on Components tab and click
    And  I click on Show all components link
    Then I verify the word "Components"