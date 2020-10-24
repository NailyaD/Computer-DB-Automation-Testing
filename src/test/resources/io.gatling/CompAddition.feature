Feature: CompAddition

  @addition
  Scenario: Positive computer addition test
    Given I am on the Computer Addition page
    When I add new computer with the valid data
    And I click Create this computer button
    Then I see a confirmation message
