@HomePage @Test

  Feature: BView list of movies
    Scenario: Homepage displays list of movies
      Given I am on the homepage
      Then I can view the list of movies

    Scenario: MoviePage shows a movie
      Given I am on the homepage
      When I click on a movie link
      Then I am redirected to that movies page