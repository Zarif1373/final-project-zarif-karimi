package tek.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.ca.Cal;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tek.bdd.pages.PlansPage;
import tek.bdd.utility.SeleniumUtility;

import javax.swing.text.DateFormatter;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class PlansSteps extends SeleniumUtility {

    @Then("click on Plans")
    public void clickOnPlansButton(){
        clickOnElement(PlansPage.PLANS_BUTTON);
    }

    @Then("validate plans section title as {string}")
    public void validatePlansSectionTitle(String expectedPlansSectionTitle){
        String actualPlansSectionTitle = getElementText(PlansPage.PLANS_SECTION_TITLE);
        Assert.assertEquals("Validate Plans section title ",
                expectedPlansSectionTitle,
                actualPlansSectionTitle);
    }

    @Then("validate plan table headers")
    public void validatePlansTableHeaders(DataTable dataTable){
        List<List<String>> tableHeadersAsList = dataTable.asLists();

        List<WebElement> headerElements = getListOfElements(PlansPage.PLAN_TABLE_HEADER_ROW);

        List<String> expectedHeaders = tableHeadersAsList.get(0);

        for (int i = 0; i < headerElements.size(); i++){
            String actualHeader = headerElements.get(i).getText();
            String expectedHeader = expectedHeaders.get(i);

            Assert.assertEquals("Validate plan table header",
                    expectedHeader,
                    actualHeader);
        }

    }

    @Then("validate {int} row of data is present")
    public void validateRowsOfData(int expectedSize) {
        int actualSize = getNumberOfRows(PlansPage.TABLE_ROW_LOCATOR);
        Assert.assertEquals("Validate number of table rows",
                expectedSize,
                actualSize);
    }


    @Then("validate create date should be today's date")
    public void validateCreateDateIsTodaySDate(){
        Calendar calendar = Calendar.getInstance();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM d, yyyy");

        String expectedCreateDate = simpleDateFormat.format(calendar.getTime());
        String actualCreateDate = getElementText(PlansPage.DATE_CREATED);

        Assert.assertEquals("Validate Create Date should be today's date",
                expectedCreateDate,
                actualCreateDate);



    }

    @Then("validate the expire date should be tomorrow's date")
    public void validateExpireDateIsTomorrowSDate(){
        Calendar calendar = Calendar.getInstance();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM d, yyyy");

        calendar.add(Calendar.DATE, 1);
        String expectedExpireDate = simpleDateFormat.format(calendar.getTime());
        String actualExpireDate = getElementText(PlansPage.DATE_EXPIRE);
    }



}
