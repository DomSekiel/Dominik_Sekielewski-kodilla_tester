Feature: FizzBuzz

  Scenario Outline: Return the correct text for a given number

    Given number <number>
    When method is called
    Then result should be "<result>"

    Examples:
      | number | result |
      | 3 | Fizz|
      | 5 | Buzz|
      | 15 | FizzBuzz|
      | 1 | None|
      | 30 | FizzBuzz|
      | 8 | None|
      | 9 | Fizz|
      | 10 | Buzz|