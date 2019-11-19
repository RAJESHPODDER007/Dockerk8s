Feature: fizzbuzz feature game

  Scenario: Play FizzBuzz to get Buzz
    Given Create a fizzbuzz game
    When I play with number 15
    Then The result is "FizzBuzz"

  Scenario: Play FizzBuzz to get Fizz
    Given Create a fizzbuzz game
    When I play with number 3
    Then The result is "Fizz"

  Scenario: Play FizzBuzz to get Buzz
    Given Create a fizzbuzz game
    When I play with number 5
    Then The result is "Buzz"


