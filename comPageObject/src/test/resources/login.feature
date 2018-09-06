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
#
#    ****Test 1 - done (however you can add some more possible scenarios***
#    ***Test 2 - done (Going to send zip file - Done in Page object model - Both tests are passed
#    Please check the screenshot
#
#    ***Test 3
#    Don't have time - Please write the same Login scenario using the Login credentials from the document.
#
#    Thanks