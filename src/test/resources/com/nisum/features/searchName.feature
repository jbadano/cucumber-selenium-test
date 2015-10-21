@itTest
Feature: search a website in google
  Scenario: Provide keyword and navigate to website
    Given open firefox
    And browse google
    When I enter the keyword
    And take first website from the result
    Then I should be my desired page