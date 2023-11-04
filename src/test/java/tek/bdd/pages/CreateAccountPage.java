package tek.bdd.pages;

import org.openqa.selenium.By;

public class CreateAccountPage {

    public final static By CPA_BUTTON = By.xpath("/html/body/div[1]/div/div[2]/div/div/a");

    public final static By CPA_ACCOUNT_CREATION_PAGE_TITLE = By.xpath("//div[2]/div/div/div/h2[1]");

    public final static By EMAIL_ADDRESS = By.name("email");

    public final static By TITLE_PREFIX = By.name("title");
    public final static By FIRST_NAME = By.id("firstName");

    public final static By LAST_NAME = By.id("lastName");

    public final static By GENDER = By.id("gender");

    public final static By MARITAL_STATUS = By.id("maritalStatus");

    public final static By EMPLOYMENT_STATUS = By.name("employmentStatus");

    public final static By DATE_OF_BIRTH = By.name("dateOfBirth");

    public final static By CREATE_ACCOUNT_BUTTON = By.xpath("//div/form/div/div[2]/button[1]");

    public final static By SIGNUP_PAGE_TITLE = By.xpath("//div[2]/div/div/div/h2[1]");

    public final static By CREATED_EMAIL_VALIDATION = By.xpath("//div[2]/div/div/div/h2[3]");

    public final static By ERROR_BANNER = By.xpath("//div[@role='alert']");



}
