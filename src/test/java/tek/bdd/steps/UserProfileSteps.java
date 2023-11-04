package tek.bdd.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.pages.UserProfilePage;
import tek.bdd.utility.SeleniumUtility;

public class UserProfileSteps extends SeleniumUtility {

    @Then("click on profile icon")
    public void clickOnProfileIcon() {
        clickOnElement(UserProfilePage.PROFILE_ICON_BUTTON);
    }

    @And("validate Status as {string}, UserType as {string}, Name as {string}, Username as {string} and Authorities as {string}")
    public void validateInfoInProfileSideBar(String expectedStatus, String expectedUserType,
                                             String expectedName, String expectedUsername, String expectedAuthorities) {

        String actualStatus = getElementText(UserProfilePage.ACTIVE_STATUS);
        Assert.assertEquals("Validate Status",
                expectedStatus,
                actualStatus );

        String actualUserType = getElementText(UserProfilePage.USER_TYPE);
        Assert.assertEquals("Validate User Type",
                expectedUserType,
                actualUserType);

        String actualName = getElementText(UserProfilePage.NAME);
        Assert.assertEquals("Validate Name",
                expectedName,
                actualName);

        String actualUsername = getElementText(UserProfilePage.USERNAME);
        Assert.assertEquals("Validate Username ",
                expectedUsername,
                actualUsername);

        String actualAuthorities = getElementText(UserProfilePage.AUTHORITIES);
        Assert.assertEquals("Validate Authoritites",
                expectedAuthorities,
                actualAuthorities);
    }


    @And("logout button should be {string}")
    public void logoutButtonStatus(String expectedLogoutButtonStatus) throws InterruptedException {
    boolean actualLogoutButtonStatus = isElementEnabled(UserProfilePage.LOGOUT_BUTTON);

    if(expectedLogoutButtonStatus.equalsIgnoreCase("enabled")) {
        Assert.assertTrue("Logout button should be enabled", actualLogoutButtonStatus);
    } else if (expectedLogoutButtonStatus.equalsIgnoreCase("disabled")) {
        Assert.assertFalse("Login button is disabled", actualLogoutButtonStatus);
        }
    }


    @Then("click on logout Button")
    public void clickOnLogoutButton(){
        clickOnElement(UserProfilePage.LOGOUT_BUTTON);
    }

    @And("validate home Page Text as {string}")
    public void validateHomePageText(String expectedHomePageText){
        String actualHomePageText = getElementText(UserProfilePage.HOME_PAGE_TEXT);
        Assert.assertEquals("Validate Home Page Text after logout",
                expectedHomePageText,
                actualHomePageText);
    }


}
