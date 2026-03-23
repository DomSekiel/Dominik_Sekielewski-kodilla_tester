Feature: Multiple operations in my wallet

  Scenario: Multiple operations
    Given there is $200 in my wallet
    When I withdraw $50
    And I withdraw $30
    Then I should receive $30
    And the balance of my wallet should be $120