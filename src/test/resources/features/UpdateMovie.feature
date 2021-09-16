@Update @Test

Feature: DUpdate Movie Details

  Scenario: An admin chooses to update a movie's genres and rating
    Given I am on the homepage
    When I click update on a movie page
    Then I am redirected to the update title page
    And the title input is pre-populated with the movie title

  Scenario: An admin makes no changes to a movie's title
    Given I am on the update title page
    When I click continue
    Then I am redirected to the update genres confirmation page

  Scenario: An admin adds another genre to update the movie's genres
    Given I am on the update genres confirmation page
    When I submit another movie genre
    Then the new genre is listed on the confirmation page

  Scenario: An admin confirms the updated movie genres
    Given I am on the update genres confirmation page
    When I click continue
    Then I am redirected to the update age rating page

  Scenario: An admin updates a movie's rating
    Given I am on the update age rating page
    When I update the age rating for the movie
    Then I am redirected to the update plot page

  Scenario: An admin makes no changes to the movie plot, poster and cast
    Given I am on the update plot page
    When I click continue on the plot, poster and cast confirmation page without making any changes
    Then I am redirected back to the movie page
    And the updated details are displayed

