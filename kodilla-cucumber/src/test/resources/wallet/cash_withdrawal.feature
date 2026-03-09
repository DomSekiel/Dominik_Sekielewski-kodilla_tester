Feature: Cash Withdrawal

  //Scenario: Successful withdrawal from a wallet in credit

  //  Given I have deposited $200 in my wallet
  //  When I request $30
  //  Then $30 should be dispensed
  //  And the balance of my wallet should be $170

  Scenario Outline: Successful withdrawal from wallet

    Given my wallet balance is 200
    When I request $<withdraw>
    Then $<withdraw> should be dispensed
    And the balance of my wallet should be $<remaining>

    Examples:
      | withdraw | remaining |
      | 30       | 170       |
      | 50       | 150       |
      | 200      | 0         |

  Scenario Outline: Withdrawal exceeding wallet balance

    Given my wallet balance is <balance>
    When I request $<withdraw>
    Then the withdrawal should be rejected
    And the balance of my wallet should remain $<balance>

    Examples:
      | balance | withdraw |
      | 200     | 250      |
      | 100     | 150      |
      | 0       |  50      |

  Scenario Outline: Withdrawal edge cases

    Given my wallet balance is <balance>
    When I request $<withdraw>
    Then the withdrawal should be rejected
    And the balance of my wallet should remain $<balance>

    Examples:
      | balance | withdraw |
      | 200     | 0        |
      | 0       | 0        |