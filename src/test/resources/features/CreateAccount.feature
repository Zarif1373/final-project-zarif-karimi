@Smoke
Feature: Validate Create Primary Accounts Elements
  #Scenario 1)
  #Navigate to Home page then click on Create Primary Account Button. User should navigate to
  # Create Account form page validate Form Title as Expected “Create Primary Account Holder”

  Background: setUpTest
    Then click on Create Primary Account Button
    And the form title should be "Create Primary Account Holder"

  @CreateAccount_US_1
  Scenario: Clicking on Create Primary Account Button and validating page title

#Scenario 2)
#On Create primary account holder form fill up the form and click on create Account Button
#Validate user navigate to Sign up your Account page and email address shows as expected.

  @CreateAccount_US_2
  Scenario: Filling up the sign up form validation
    When enter dynamicEmail Address
    When select title as "Mr."
    When enter First Name as "Tika"
    When enter Last Name as "BBB"
    When select Gender as "Male"
    When select Marital Status as "Single"
    When enter Employment Status as "SDET"
    When enter Date Of Birth as "01/01/2021"
    Then click on Create Account
    And signUp page title should be "Sign up your account"
    Then validate created email should be dynamicEmail

    @CreateAccount_US_3
    Scenario: Validate error message when creating account with existing email address
      When enter Email Address as "Laal@gmail.com"
      When select title as "Mr."
      When enter First Name as "Laal"
      When enter Last Name as "BBB"
      When select Gender as "Male"
      When select Marital Status as "Single"
      When enter Employment Status as "SDET"
      When enter Date Of Birth as "01/01/2021"
      Then click on Create Account
      Then validate error message "Account with email Laal@gmail.com is exist"





