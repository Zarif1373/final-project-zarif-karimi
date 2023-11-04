package tek.bdd.pages;

import org.openqa.selenium.By;

public class UserProfilePage {

    public final static By PROFILE_ICON_BUTTON = By.xpath("//div/div[1]/div/button");

    public final static By ACTIVE_STATUS = By.xpath("//div[1]/p[2]/span/span");

    public final static By USER_TYPE = By.xpath("//div[2]/p[2]");

    public final static By NAME = By.xpath("//div[3]/p[2]");

    public final static By USERNAME = By.xpath("//div[4]/p[2]");

    public final static By AUTHORITIES = By.xpath("//div/div[5]/ul/li");

    public final static By LOGOUT_BUTTON = By.xpath("//footer/div/button[1]");

    public final static By HOME_PAGE_TEXT = By.xpath("//div[2]/div/div/h2[1]");


}
