package tek.bdd.steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import tek.bdd.pages.AccountsPage;
import tek.bdd.utility.SeleniumUtility;

public class AccountsSteps extends SeleniumUtility {

    @Then("click on Accounts")
    public void clickOnAccounts() {
        clickOnElement(AccountsPage.ACCOUNTS_BUTTON);
    }

@Then("verify {int} row is present")
    public void verifyNumberofAccountsRows(int expectedSize) {
        int actualSize = getNumberOfRows(AccountsPage.Accounts_Rows);
    Assert.assertEquals("Validate Accounts Rows",
            expectedSize,
            actualSize);
    }

    @Then("validate the default accounts page row as {string}")
    public void validateDefaultAccountsPageRow(String expectedDefault){
        Select selectAccountPageRow = new Select(getDriver().findElement(AccountsPage.ACCOUNTS_DROPDOWN_ROW_OPTIONS));
        WebElement defaultPageRowElement = selectAccountPageRow.getFirstSelectedOption();

        String actualDefault = defaultPageRowElement.getText();
        System.out.println("actualDefault: " + actualDefault);
        Assert.assertEquals("Validate default rows in accounts page",
                expectedDefault,
                actualDefault);
    }


    @When("selecting {string}")
    public void selecting(String optionsOfDropDown) {
        Select selectDropDown = new Select(getDriver().findElement(AccountsPage.ACCOUNTS_DROPDOWN_ROW_OPTIONS));
        selectDropDown.selectByVisibleText(optionsOfDropDown);
    }

    @Then("{int} per page should be visible")
    public void validateAccountPageRowNumbers(int expectedRowNumber) {
        int actualNumberOfAccountsRow = getNumberOfRows(AccountsPage.Accounts_Rows);
        Assert.assertEquals("Validate Accounts page row",
                expectedRowNumber,
                actualNumberOfAccountsRow);
    }

}
