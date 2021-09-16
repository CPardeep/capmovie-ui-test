@Test
Feature: FLogging in as an user

  Scenario: Logging in an user
    Given that I am on the user Login Page
    When I fill in the username and password field
    And I click the Login
    Then I am navigated to the home page where a list movies are displayed

