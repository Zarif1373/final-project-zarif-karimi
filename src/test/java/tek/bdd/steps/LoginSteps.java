package tek.bdd.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.pages.LoginPage;
import tek.bdd.utility.SeleniumUtility;

import java.time.Duration;

public class LoginSteps extends SeleniumUtility {

    @Then("navigate and click login button")
    public void navigateAndClickLoginButton(){
        clickOnElement(LoginPage.LOGIN_BUTTON);
    }

    @And("validate the login page title as {string}")
    public void validateLoginPageTitle(String expectedLoginPageTitle){
        String actualLoginPageTitle = getElementText(LoginPage.LOGIN_PAGE_TITLE);

        Assert.assertEquals("Validate Login Page Title",
                expectedLoginPageTitle,
                actualLoginPageTitle);
    }

    @Then ("enter username as {string} and password as {string}")
    public void enterValidCredentials(String username, String password){
        enterValue(LoginPage.USERNAME_INPUT, username);
        enterValue(LoginPage.PASSWORD_INPUT, password);
    }

    @Then ("navigate and click sign in button")
    public void clickOnSignInButton() throws InterruptedException {
        clickOnElement(LoginPage.SIGN_IN_BUTTON);
        Thread.sleep(1000);
    }

    @And ("validate the signed in portal title as {string}")
    public void validateSignedInPortalTitle(String expectedSignedInPortalTitle){
        String actualSignInPortalTitle = getElementText(LoginPage.SIGNED_IN_PORTAL_TITLE);

        Assert.assertEquals("Validate signed in portal title",
                expectedSignedInPortalTitle,
                actualSignInPortalTitle);
    }

    @And ("validate the {string} with wrong credentials")
    public void validateErrorMessageWithWrongCredentials(String expectedErrorMessageUsingWrongCredentials){
        String actualErrorMessageUsingWrongCredentials = getElementText(LoginPage.ERROR_MESSAGE_USING_WRONG_CREDENTIALS);

        Assert.assertEquals("validate the error message using wrong credentials",
                "ERROR\n"+
                        expectedErrorMessageUsingWrongCredentials,
                actualErrorMessageUsingWrongCredentials);
    }


}
