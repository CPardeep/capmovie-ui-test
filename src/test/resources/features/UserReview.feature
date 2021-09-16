@Test @UserReview

Feature: User leaves a review and rating for a movie

  Scenario: User leaves a review and rating
    Given I am logged in a user
    And I am on the movie page
    When I submit a rating
    And I submit a review
    Then I am redirected to the Review Summary Page

  Scenario: User checks their review details and submits the review
    Given I am on the Review Summary page
    When I confirm that details are correct and submit it
    Then I redirected to the Review Success page

  Scenario: Movie's average rating is updated after a User leaves a review
    Given a movie already has one review and rating
    When another user adds a new rating
    Then the updated Average User Rating is displayed on the movie page