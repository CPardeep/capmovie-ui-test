@HomePage @Test

Feature: BView list of movies

  Scenario: StartPage allows you to move to homepage
    Given I am on the startPage
    When I click on view all movies
    Then I am moved to homepage

  Scenario: Homepage displays list of movies
    Given I am on the homepage
    Then I can view the list of movies

  Scenario: MoviePage shows a movie
    Given I am on the homepage
    When I click on a movie link
    Then I am redirected to that movies page

    Scenario: Deleting a movie
      Given I am on the homepage
      When I click on a movie link
      And I click delete
      And I click confirm
      Then I will be on the delete success page