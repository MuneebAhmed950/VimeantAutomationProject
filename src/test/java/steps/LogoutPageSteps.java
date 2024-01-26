package steps;

import core.WebDriverHook;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import locators.Homepagelocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class LogoutPageSteps {

    private Homepagelocator homepagelocator;

    private WebDriverHook webDriverHook;

    private WebDriverWait wait;


    public LogoutPageSteps(){

        webDriverHook = WebDriverHook.getInstance();
        homepagelocator = new Homepagelocator(webDriverHook.getDriver());
        this.wait = new WebDriverWait(webDriverHook.getDriver(), Duration.ofSeconds(60));

    }
    @And("clicks on dropdown arrow on top right corner")
    public void profileDropdownClick(){

        try {
            System.out.println("I am in try profileDropdownClick");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //WebElement overlay = webDriverHook.getDriver().findElement(By.cssSelector("div.MuiBackdrop-root[data-testid='application-loader']"));
        //wait.until(ExpectedConditions.invisibilityOf(overlay));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".MuiBackdrop-root.css-1dgnwnj-backdrop")));

        homepagelocator.getArrow().click();
    }

    @And("user clicks on logout button")
    public void clickLogoutButton(){

        homepagelocator.logoutButton().click();
    }
    @Then("user see logout message {string}")
    public void theUserShouldSeeTheMessage(String expectedMessage) {


        By locator = By.cssSelector(".MuiAlert-message.css-1xsto0d");
        String expectedText = "User logged out successfully!";
        // Find the element by its CSS selector
        wait.until(ExpectedConditions.textToBePresentInElementLocated(locator,expectedText));

        WebElement alertElement = wait.until(ExpectedConditions.presenceOfElementLocated(locator));

        // Get the text of the element
        String actualMessage = alertElement.getText();

        // Assert the message
        assertTrue("Actual message: " + actualMessage, actualMessage.contains(expectedMessage));
    }








}
