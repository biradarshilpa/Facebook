Feature: Test login Functionality
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enter username and password
    And clicks on login button
    Then user is navigated to Home page

