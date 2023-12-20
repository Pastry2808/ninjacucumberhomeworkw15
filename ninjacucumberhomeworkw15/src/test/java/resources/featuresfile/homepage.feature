Feature: Homepage Test

  Background:
    Given I am on homepage

    Scenario: User should navigate to desktop page successfully
      When I click on desktop link
      And I click on show all desktops link
