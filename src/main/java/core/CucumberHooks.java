package core;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CucumberHooks {

    @Before
    public void beforeScenario(Scenario scenario) {
        // Any setup before each scenario can go here
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot if the scenario fails
            WebDriver driver = WebDriverHook.getInstance().getDriver();
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);

            // Attach the screenshot to the report
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        // Cleanup, such as closing the WebDriver
        WebDriverHook.getInstance().closeDriver();
    }


}


