Feature: Celsius temperature converter

  Background: User in celsius converter
    Given the user is in the celsius converter

  Scenario: Convert Celsius degrees to Fahrenheit degrees
    When the user enters "20" Celsius degrees to Fahrenheit
    Then the result should be "68.00" Fahrenheit degrees

  Scenario: Convert Celsius degrees to Kelvin degrees
    When the user enters "20" Celsius degrees to Kelvin
    Then the result should be "293.15" Kelvin degrees
