@Test
Feature: ALogging in as an admin

  Scenario: Logging in an admin
    Given that I am on the Login Page
    When I fill in the username and password fields with valid credentials
    And I click the Login button
    Then I am navigated to the home page where a list movies are shown

