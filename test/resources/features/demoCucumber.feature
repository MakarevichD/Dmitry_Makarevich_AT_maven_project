Feature: TestRail API Test

  Scenario: Check project was added
    Given I start execution
    When I add 1 and 2
    Then I verify that result equals 3


  Scenario: Check suite was added
    Given I start execution
    When I substract 2 and 1
    Then I verify that result equa