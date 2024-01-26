package steps;

import core.WebDriverHook;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.Loginlocator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class LoginPageSteps {

private Loginlocator loginlocator;

private WebDriverHook webDriverHook;

private WebDriverWait wait;

public LoginPageSteps(){

    webDriverHook = WebDriverHook.getInstance();
    loginlocator = new Loginlocator(webDriverHook.getDriver());
    this.wait = new WebDriverWait(webDriverHook.getDriver(),Duration.ofSeconds(60));

}
    @Given("user is on login page")
    public void goToWebApp(){
        loginlocator= new Loginlocator(webDriverHook.getDriver());
    }
    @When("user enters username")
    public void enterUserName(){
    loginlocator.getEmail().sendKeys("hasan.mujtaba+21@vimient.com");
    }
    @And("user enters password")
    public void enterPassword(){
    loginlocator.getPassword().sendKeys("Vista!@#135!@#");
    }
    @And("clicks on login button")
    public void clickOnLoginButton(){
    loginlocator.getLoginButton().click();
    }
    @Then("the user should see the message {string}")
    public void theUserShouldSeeTheMessage(String expectedMessage) {

        // Get the alert text
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("MuiAlert-message")));
        String actualMessage = alert.getText();
        // Close the alert
        // Assert the message
        assertTrue("Actual message: " + actualMessage, actualMessage.contains(expectedMessage));
    }
}
