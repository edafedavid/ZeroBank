Feature: OnlineBanking

  Background:

    Given I am on the application home page
    And I login


  Scenario: Verify the functionality of the online_banking feature

    When I click the online banking btn
    Then I should be directed to the online banking page

