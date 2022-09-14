Feature: Login feature.
  As user I want to login app

  Scenario: Basic login
    Given user is on the landing page
    When user enters credentials
    And user clicks on login button
    Then user should see welcome message