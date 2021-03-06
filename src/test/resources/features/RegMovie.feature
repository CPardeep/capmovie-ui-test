@AddMovie @Test

Feature: CRegistering a movie feature

  Scenario: An admin adds a movie title
    Given I am on the Add Movie Title page
    When I submit the movie Title
    Then I am redirected to the Add Genres page

  Scenario: An Admin adds one movie genre
    Given I am on the Add Movie Genres page
    When I submit a movie genre
    Then I am redirected to the Genres Confirmation page

  Scenario: An Admin adds another movie genre
    Given I have already added one movie genre
    When I submit another movie genre
    Then both genres are listed on the Genres Confirmation page

  Scenario: An admin removes a movie genre
    Given I am on the Genres Confirmation page with two genres
    When I remove a genre
    Then there should be one genre left
    And I remain on the same page

  Scenario: An Admin confirms list of genres
    Given I am on the Genres Confirmation page
    When I confirm genres by clicking continue
    Then I am redirected to the Add Age Rating page

  Scenario: An admin adds an age rating
    Given I am on the Add Age Rating page
    When I submit an age rating for the movie
    Then I am redirected to the Plot page

  Scenario: An Admin adds a movie plot
    Given I am on the Add Movie Plot page
    When I submit the movie plot
    Then I am redirected to the Add Movie Poster page

  Scenario: An Admin adds a movie poster
    Given I am on the Add Movie Poster page
    When I submit the movie poster URL
    Then I am redirected to the Add Movie Cast page

  Scenario: An Admin adds one cast member for a movie
    Given I am on the Add Movie Cast page
    When I submit a cast member
    Then I am redirected to the Cast Confirmation page

  Scenario: An Admin adds another cast member
    Given I have already added one cast member for this movie
    When I submit another cast member
    Then both cast members are listed on the Cast Confirmation page

  Scenario: An admin removes a cast member
    Given I am on the Cast Confirmation page with two genres
    When I remove a cast member
    Then there should be one cast member listed
    And I remain on the Cast Confirmation Page

  Scenario: An Admin confirms list of cast members
    Given I am on the Cast Confirmation page
    When I confirm the cast by clicking continue
    Then I am redirected to the Summary page

  Scenario: An Admin edits movie details from the summary page
    Given I am on the Movie Summary page after entering valid details for a movie
    When I click the change link for Movie Title
    And I am redirected to the Movie Title page
    And I update the Movie Title
    Then I am redirected to the Summary Page where I can see the updated movie title

  Scenario: An Admin confirms Movie details submission
    Given I am on the Movie Summary page after entering valid details for a movie
    When  I have confirmed the movie details match what has been inputted
    And   I click the submit button
    Then I am redirected to the Submission Confirmation Page



