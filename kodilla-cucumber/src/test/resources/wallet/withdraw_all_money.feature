Feature: Withdraw all money from the wallet

Scenario: Withdraw all money
  Given there is $100 in my wallet
  When I withdraw $100
  Then I should receive $100
  And the balance of my wallet should be $0