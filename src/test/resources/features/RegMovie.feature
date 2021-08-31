@AddMovie @Test

Feature: CRegistering a movie feature

  Scenario: An admin adds a movie Title
    Given I am on the Add Movie Title page
    When I submit the movie Title
    Then I am redirected to the Add Movie Plot page

  Scenario: An Admin adds a movie plot
    Given I am on the Add Movie Plot page
    When I submit the movie plot
    Then I am redirected to the Add Movie Poster page

  Scenario: An Admin adds a movie poster
    Given I am on the Add Movie Poster page
    When I submit the movie poster URL
    Then I am redirected to the Add Movie Age Rating page

  Scenario: An admin adds an age rating
    Given I am on the Add Age Rating page
    When I submit an age rating for the movie
    Then I am redirected to the Age Rating page

  Scenario: An Admin adds one movie genre
    Given I am on the Add Movie Genres page
    When I submit a movie genre
    Then I am redirected to the Genres Confirmation page

  Scenario: An Admin adds another movie genre
    Given I have already added one movie genre
    When I submit another movie genre
    Then both genres are listed on the Genres Confirmation page

  Scenario: An Admin confirms list of genres
    Given I am on the add genres confirmation page
    And I confirm genres by clicking continue
    Then I am redirected to the Add Age Rating page

