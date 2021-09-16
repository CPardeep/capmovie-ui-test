@Delete @Test
Feature: EDeleting a Movie

  Scenario: Deleting a movie
    Given I am on a movie page
    When I click delete
    And I click confirm
    Then I will be on the delete success page

