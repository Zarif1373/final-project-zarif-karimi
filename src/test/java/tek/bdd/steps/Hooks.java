package tek.bdd.steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import tek.bdd.utility.SeleniumUtility;

public class Hooks extends SeleniumUtility {

    @Before
    public void setUpTests(){
        openBrowser();
    }

    @After
    public void cleanUpTests(Scenario scenario){
        if(scenario.isFailed()) {
            byte[] picture = takeScreenshot();
            scenario.attach(picture, "image/png", "failedScreenShot");
        }
        driverQuit();
    }
}
