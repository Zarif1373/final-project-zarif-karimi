@Smoke
Feature: Validate Login elements
  #Login:
  #Scenario 1)
  #Navigate to login by clicking on Login button and enter valid csr user
  #Username: supervisor
  #Password: tek_supervisor
  #And validate user navigate to Customer Service Portal

  Background: setUpTest
    Then navigate and click login button
    And validate the login page title as "Sign in to your Account"

  @Login_US_1
  Scenario: Verify login page and successful login
    Then enter username as "supervisor" and password as "tek_supervisor"
    Then navigate and click sign in button
    And validate the signed in portal title as "Customer Service Portal"

  @Login_US_2
  Scenario Outline: Validate error message using wrong credentials
    Then enter username as "<username>" and password as "<password>"
    Then navigate and click sign in button
    And validate the "<errorMessage>" with wrong credentials
    Examples:
      | username    | password        | errorMessage               |
      | supervisorr | tek_supervisor  | User supervisorr not found |
      | supervisor  | ttek_supervisor | Password not matched       |
