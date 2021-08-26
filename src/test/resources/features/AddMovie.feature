@AddMovie @Test

Feature: Adding a movie feature

  Scenario: An admin adds a movie Title
    Given I am on the Add Movie Title page
    When I submit the movie Title
    Then I am redirected to the same page

  Scenario: An Admin adds a movie poster
    Given I am on the Add Movie Poster page
    When I submit the movie poster URL
    Then I am redirected to the Add Movie Poster page

  Scenario: An Admin adds a movie plot
    Given I am on the Add Movie Plot page
    When I submit the movie plot
    Then I am redirected to the Add Movie Plot page

  Scenario: An admin adds an age rating
    Given I am on the Add Age Rating page
    When I select an age rating for the movie
    And I click the next button
    Then I am redirected to the Age Rating page

