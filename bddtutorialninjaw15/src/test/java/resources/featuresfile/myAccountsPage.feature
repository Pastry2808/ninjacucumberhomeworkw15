Feature: Top Menu Test

  Background:
    Given I am on homepage
    When I click on My Account Link

  Scenario: verify User Should Navigate To Register Page Successfully
    And I click on Register
    Then I verify "Register Account" text

  Scenario: verify User Should Navigate To Login Page Successfully
    And I click on Login
    Then I verify "Returning Customer" heading

  Scenario: verify That User Register Account Successfully
    And I click on Register
    And I Enter First Name
    And I Enter Last Name
    And I Enter Email
    And I Enter Telephone
    And I Enter Password
    And I Enter Password Confirm
    And I Select Subscribe Yes radio button
    And I Click on Privacy Policy check box
    And I Click on Continue button
#    And I Verify the message “Your Account Has Been Created!”
#    And I Click on Continue button
    And I click on My Account Link
    And I click on Logout
    Then I Click on Continue Tab

  Scenario: verify That User Should Login And Logout Successfully
    And I click on Login
    And I Enter Email
    And I Enter Password
    And Click on Login button
#    And Verify text “My Account”
    And I click on My Account Link
    And I click on Logout
    Then I Click on Continue Tab
