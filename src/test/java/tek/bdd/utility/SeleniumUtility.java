package tek.bdd.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.base.BaseSetup;

import java.time.Duration;
import java.util.List;

public class SeleniumUtility extends BaseSetup {

    private WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20));
    }

    private WebElement waitUntilVisibilityOfElement(By locator) {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public String getElementText(By locator) {
        WebElement element = waitUntilVisibilityOfElement(locator);
        return element.getText();
    }
    public byte[] takeScreenshot() {
        TakesScreenshot screenshot = (TakesScreenshot) getDriver();
        return screenshot.getScreenshotAs(OutputType.BYTES);
    }

    public boolean isElementEnabled(By locator) {
        WebElement element = waitUntilVisibilityOfElement(locator);
        return element.isEnabled();
    }

    private WebElement waitUntilElementClickable(By locator) {
        return getWait().until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void clickOnElement(By locator) {
        waitUntilElementClickable(locator).click();
    }

    public void enterValue(By locator, String text) {
        WebElement element = waitUntilVisibilityOfElement(locator);
        element.sendKeys(text);
    }

    private List<WebElement> waitUntilVisibilityOfAllElements(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public List<WebElement> getListOfElements(By locator) {
        return waitUntilVisibilityOfAllElements(locator);
    }

    public int getNumberOfRows(By locator){
        return waitUntilVisibilityOfAllElements(locator).size();
    }
    public void selectFromDropDown(By locator, String option) {
        List<WebElement> itemPerPageOptions = getListOfElements(locator);

        for(WebElement element : itemPerPageOptions) {
            String text = element.getText();
            if (text.contains(option)) {
                element.click();
            }
        }
    }

    public String getRandomEmail(){
        String email = "Zarif";
        int random = (int) (Math.random() * 892100);
        return email + random + "@gmail.com";
    }



}
