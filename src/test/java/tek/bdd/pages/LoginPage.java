package tek.bdd.pages;

import org.openqa.selenium.By;

public class LoginPage {

    public final static By LOGIN_BUTTON = By.xpath("//div[1]/div/a[2]");

    public final static By LOGIN_PAGE_TITLE = By.xpath("//div[2]/div/div/div/h2");

    public final static By USERNAME_INPUT = By.id("username");

    public final static By PASSWORD_INPUT = By.name("password");

    public final static By SIGN_IN_BUTTON = By.xpath("//div/form/div/div[3]/button[1]");

    public final static By SIGNED_IN_PORTAL_TITLE = By.cssSelector("#root > div > div.css-175rvmj > div > h2");

    public final static By ERROR_MESSAGE_USING_WRONG_CREDENTIALS = By.xpath("//div[@role=\"alert\"]");



}
