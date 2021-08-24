@AddMovie @Test

Feature: Adding a movie feature

  Scenario: An admin adds a movie Title
    Given I am on the Add Movie Title page
    When I input the movie Title
    And I click Save and Continue
    Then I am redirected to the same page

