Feature: CompDeletion

  @deletion
  Scenario: Computer deletion test
    Given I am on the Main page
    When I click on the ASCI Blue Pacific computer name
    And I click Delete this computer button
    Then I see a confirmation message:
    """
    Done ! Computer ASCI Blue Pacific has been deleted
    """
