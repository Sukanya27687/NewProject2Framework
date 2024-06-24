Feature: Verify Login Page
  As a user of the system
  I should be able to login with valid credentials
  so that I can login into my account


  Background: Navigate
    Given the user navigates to home page

@SmokeTest
    Scenario: 1. Verify login with Valid credentials
      When the user login with "standard_user" username and "secret_sauce" password
      Then the user should see "Products"
      And the user clicks on logout button

      Scenario: 2. Verify Login with invalid username
When the user login with "standard_usen" username and "secret_sauce" password
      Then the user should see "Epic sadface: Username and password do not match any user in this service"

      Scenario: 3. Verify Login with invalid Password
  When the user login with "standard_user" username and "secret_saucc" password
      Then the user should see "Epic sadface: Username and password do not match any user in this service"

@SmokeTest
      Scenario Outline: 4. Verify Login with invalid credentials using datadriven
  When the user login with "<username>" username and "<password>" password
      Then the user should see "<expectedTest>"

Examples:
  |username| password| expectedTest|
  |standard_usen | secret_sauce | Epic sadface: Username and password do not match any user in this service|
  |standard_user | secret_saucc | Epic sadface: Username and password do not match any user in this service|
  |standard_usen | secret_saucc | Epic sadface: Username and password do not match any user in this service|
