@Smoke
Feature: Validate user profile elements
  #User Profile:
  # Scenario 1)
  #Navigate to login and enter valid CSR credentials and navigate to Customer Service Portal
  # then click on profile button validate information is in Profile Side Drawer is correct.

  Background: Successful Login
    Then navigate and click login button
    Then enter username as "supervisor" and password as "tek_supervisor"
    Then navigate and click sign in button
    Then click on profile icon

  @UserProfile_US_1
  Scenario: validate profile information on side drawer
    And validate Status as "Active", UserType as "CSR", Name as "Supervisor", Username as "supervisor" and Authorities as "admin"
    And logout button should be "enabled"


    #Scenario 2)
    #Navigate to login and enter valid CSR credentials and navigate to Customer Service
    # Portal then click on profile button and then click on Logout button make sure user
    # navigate to home page
  @UserProfile_US_2
  Scenario: validate sign in and logout functionality
    Then click on logout Button
    And validate home Page Text as "Lets get you started"

