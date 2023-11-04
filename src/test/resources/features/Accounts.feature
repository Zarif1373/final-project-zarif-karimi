@Smoke
Feature: Validate accounts elements
#Accounts
#Scenario 1)
#Navigate to Customer Service Portal with valid CSR credentials and navigate to Accounts
# verify 5 row /page is default

  Background: Successful Login
    Then navigate and click login button
    Then enter username as "supervisor" and password as "tek_supervisor"
    Then navigate and click sign in button
    Then click on Accounts

  @Accounts_US_1
  Scenario: validate display of Accounts rows
    Then verify 5 row is present
    Then validate the default accounts page row as "Show 5"

    #Scenario 2)
    #Navigate to Customer Service Portal with valid CSR credentials and navigate to Accounts change show per
    # page to 10, 25, 50 and validate table records per page according to selected show per page.
  @Accounts_US_2
  Scenario Outline: validate display of Accounts rows
    When selecting "<OptionsOfDropDown>"
    Then <NumberOfAccountsPageRow> per page should be visible
    Examples:
      | OptionsOfDropDown | NumberOfAccountsPageRow |
      | Show 5            | 5                       |
      | Show 10           | 10                      |
      | Show 25           | 25                      |
      | Show 50           | 50                      |


