@Smoke
Feature: Validate Home Page Elements
  #Home Page
  #Validate When user navigate to home page title is TEK Insurance App and create Primary
  # Account Button is exist

  @HomePage_US_1
  Scenario: Verify Home Page Title and Primary Account Button
    Then the page title should be "TEK Insurance App"
    And validate Create Primary Account button is "enabled"


