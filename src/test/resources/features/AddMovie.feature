@AddMovie

Feature: Adding a movie feature

  Scenario: An admin adds a movie name
    Given I am on the Add Movie name page
    When I input the movie name
    And I click Save and Continue
    Then I am redirected to the same page

