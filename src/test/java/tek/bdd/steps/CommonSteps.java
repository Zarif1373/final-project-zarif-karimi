package tek.bdd.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.pages.CommonPage;
import tek.bdd.utility.SeleniumUtility;

import java.time.Duration;

public class CommonSteps extends SeleniumUtility {

    @Then("the page title should be {string}")
    public void validatePageTitle(String expectedPageTitle) {

        String actualPageTitle = getElementText(CommonPage.PAGE_TITLE);

        Assert.assertEquals("Page Title Validation",
                expectedPageTitle,
                actualPageTitle);
    }

   @And("validate Create Primary Account button is {string}")
    public void validateCPAbuttonIsClickable(String expectedCondition){
        boolean actualCondition = isElementEnabled(CommonPage.CPA_BUTTON);

        if (expectedCondition.equalsIgnoreCase("enabled")) {
            Assert.assertTrue("Create Primary Account Button is enabled", actualCondition);
        } else if (expectedCondition.equalsIgnoreCase("disabled")) {
            Assert.assertFalse("Create Primary Account Button is disabled", actualCondition);
        }
   }


}
