@Smoke
Feature: Validate Plans elements

#Plans
#Scenario 1)
#Navigate to Customer Service Portal with valid CSR credentials and navigate to Plans Page.
# Validate 4 row of data is present.

  Background: Successful Login
    Then navigate and click login button
    Then enter username as "supervisor" and password as "tek_supervisor"
    Then navigate and click sign in button
    Then click on Plans


  @Plans_US_1
  Scenario: validate 4 row of data is present in plans page
    Then validate plans section title as "Today's Plans Price"
    Then validate plan table headers
      | PLAN TYPE | PLANE BASE PRICE | DATE CREATED | DATE EXPIRE |
    Then validate 4 row of data is present


  #Scenario 2)
  #Navigate to Customer Service Portal with valid CSR credentials and navigate to Plans Page.
  # Then validate Create Date is todays date in (EST Time zone) and Date Expire is a day
  # after (EST Time Zone)

  @Plan_US_2
  Scenario: validate create date and expire date
    Then validate create date should be today's date
    Then validate the expire date should be tomorrow's date

