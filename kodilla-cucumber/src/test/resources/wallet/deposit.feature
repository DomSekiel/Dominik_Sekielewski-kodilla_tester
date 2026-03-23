Feature: Deposit money

  Scenario: User deposits money into wallet
    Given there is $100 in my wallet
    When I deposit $50
    Then the balance of my wallet should be $150