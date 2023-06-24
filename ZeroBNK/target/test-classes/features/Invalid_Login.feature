@ignore
Feature: Invalid Login

  Background:

    Given I am on the login page



  Scenario Outline: Verify that login with invalid credentials displays the appropriate error message.


    When I enter my "<Login>" detail
    And my "<Password>" in the appropriate field
    And I click the sign in button
    Then I should see the appropriate "<error_message>" as designed

    Examples:
    |Login        |Password           |error_message                   |
    |username     |1234               |Login and/or password are wrong. |
    |1234         |password           |Login and/or password are wrong. |
    |1234         |abcd               |Login and/or password are wrong. |