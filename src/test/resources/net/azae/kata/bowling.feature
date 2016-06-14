Feature: Bowling
  As a player
  I want to know my bowling score

  Background:
    Given a new bowling game

  Scenario: I never knock down pin
    When all of my balls are landing in the gutter
    Then my score should be 0

  Scenario: I knock down 1 pins by roll
    When all of my balls knock down 1 pin
    Then my score should be 20