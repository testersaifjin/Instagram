Feature: Login Functionality

  Scenario: Valid Login

    Given User is in Home Page
#    When User select the Login link
    And User enter email and password
    And User click Login button
    Then User enter welcome screen

  Scenario: Invalid Login

    Given User is in Home Page
#    When User select the Login link
    And User enter Invalid email and password
    And User click Login button
    Then User getting error message