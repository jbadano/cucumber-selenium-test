@resultPageTest
Feature: Review each category
  As a admin logged user
  In order to validate the differents categories
  I want to navigate for each one

  Scenario: Show the results category list
    Given A logged user with username "admin" and password "admin"
    When I enter into the results
    Then Should be display the Results

  Scenario: Show the first category
    Given A logged user with username "admin" and password "admin"
    And A user into the results page
    When I click in the "Before And After" link
    Then Should display the first category winner name "Dennis"

  Scenario: Show the second category
    Given A logged user with username "admin" and password "admin"
    And A user into the results page
    When I click in the "Best Couple" link
    Then Should display the second category winner name "Jose Ventura y Dennis"

  Scenario: Show the third category
    Given A logged user with username "admin" and password "admin"
    And A user into the results page
    When I click in the "Best Fellow" link
    Then Should display the third category winner name "Andres Peragallo"

  Scenario: Show the fourth category
    Given A logged user with username "admin" and password "admin"
    And A user into the results page
    When I click in the "Best Pretender" link
    Then Should display the fourth category winner name ""

  Scenario: Show the fifth category
    Given A logged user with username "admin" and password "admin"
    And A user into the results page
    When I click in the "Fancy dress" link
    Then Should display the fifth category winner name "Carlos Medina"

  Scenario: Show the sixth category
    Given A logged user with username "admin" and password "admin"
    And A user into the results page
    When I click in the "Look Alike" link
    Then Should display the sixth category winner name "Panchito - Tom Araya"

  Scenario: Show the seventh category
    Given A logged user with username "admin" and password "admin"
    And A user into the results page
    When I click in the "The Most Beautiful" link
    Then Should display the seventh category winner name "Veronica Michelson"

  Scenario: Show the eighth category
    Given A logged user with username "admin" and password "admin"
    And A user into the results page
    When I click in the "Ugly King" link
    Then Should display the eighth category winner name ""