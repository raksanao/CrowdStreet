@signUp
Feature: As user I should be able to create an account
  Scenario: Create account
    Given User is on main page
    When  User clicks on  create account on the top right
    And   Enters user information

    Then User clicks to sign up button
  And Congrats popups should be displayed


