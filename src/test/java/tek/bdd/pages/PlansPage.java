package tek.bdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PlansPage {

    public final static By PLANS_BUTTON = By.xpath("//div[2]/div/div/a[2]");

    public final static By PLANS_SECTION_TITLE = By.xpath("//div[3]/div/div/div/h2");

    public final static By PLAN_TABLE_HEADER_ROW = By.xpath("//div/table/thead/tr/th[2]");

    public final static By TABLE_ROW_LOCATOR = By.xpath("//tbody/tr");

    public static By getTablePlan4Rows(int row, int column){
        return By.xpath("//table/tbody/tr["+row+"]/td["+column+"+]");
    }

    public static final By DUPLICATE_DATE_CREATE = By.xpath("//tbody/tr/td[4]");

    public static final By DUPLICATE_DATE_EXPIRE = By.xpath("//tbody/tr/td[5]");

    public static final By DATE_CREATED = By.xpath("//div/table/tbody/tr[1]/td[4]");

    public static final By DATE_EXPIRE = By.xpath("//div/table/tbody/tr[1]/td[5]");


}
