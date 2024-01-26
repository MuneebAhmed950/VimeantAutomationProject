package steps;

import core.WebDriverHook;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import locators.AssessmentPageLocator;
import locators.Homepagelocator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class WellbeingAssessmentSteps {

    private Homepagelocator homepagelocator;

    private AssessmentPageLocator assessmentPageLocator;

    private WebDriverHook webDriverHook;

    private WebDriverWait wait;

     public WellbeingAssessmentSteps(){

         webDriverHook = WebDriverHook.getInstance();
         homepagelocator = new Homepagelocator(webDriverHook.getDriver());
         assessmentPageLocator = new AssessmentPageLocator(webDriverHook.getDriver());
         this.wait = new WebDriverWait(webDriverHook.getDriver(), Duration.ofSeconds(10));
     }

    @And("user clicks on senior")
    public void clickOnSenior(){

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".MuiBackdrop-root.css-1dgnwnj-backdrop")));
        homepagelocator.searchResult().click();


    }

    @And("user clicks on assessment")
    public void clickOnAssessment(){

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".MuiBackdrop-root.css-1dgnwnj-backdrop")));
        assessmentPageLocator.getAssessmentlocator().click();

    }

    @And("user clicks on wellbeing survey")
    public void clickOnWellbeing(){

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".MuiBackdrop-root.css-1dgnwnj-backdrop")));
        assessmentPageLocator.getWellbeingSurvey().click();

    }

    @And("click on busy and add comment")
    public void clickonBusyAndComment () {

        try {
            System.out.println("I am in try");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement element = assessmentPageLocator.getBusyRadioElement();
        ((JavascriptExecutor) webDriverHook.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".MuiBackdrop-root.css-1dgnwnj-backdrop")));
//       assessmentPageLocator.getBusyRadioElement().click();
        WebElement element1= assessmentPageLocator.getBusyCommentElement();
        ((JavascriptExecutor) webDriverHook.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element1);
        element1.clear();
        element1.sendKeys("Busy Test automation");
        //assessmentPageLocator.getBusyCommentElement().sendKeys("Busy Test Automation");

    }

    @And("click on happy and add comment")
    public void clickHappyAndComment(){

         assessmentPageLocator.getHappyRadioElement().click();
         assessmentPageLocator.getHappyCommentElement().sendKeys("Happy Test Automation");
    }

    @And("click on purpose and add comment")
    public void clickPurposeAndComment(){

         assessmentPageLocator.getPurposeRadioElement().click();
         assessmentPageLocator.getPurposeCommentElement().sendKeys("Purpose Test Automation");
    }

    @And("click on social and add comment")
    public void clickSocialAndComment(){

         assessmentPageLocator.getSocialRadioElement().click();
         assessmentPageLocator.getSocialCommentElement().sendKeys("Social Test Automation");
    }

    @And("click on relaxed and add comment")
    public void clickRelaxedAndComment(){

         assessmentPageLocator.getRelaxedRadioElement().click();
         assessmentPageLocator.getRelaxedCommentElement().sendKeys("Relexed Test Automation");
    }

    @And("click on painfree and add comment")
    public void clickPainfreeAndComment(){

         assessmentPageLocator.getPainFreeRadioElement().click();
         assessmentPageLocator.getPainCommentElement().sendKeys("Painfree Test Automation");
    }

    @And("click on rested and add comment")
    public void clickRestedAndComment(){

         assessmentPageLocator.getRestedRadioElement().click();
         assessmentPageLocator.getRestedCommentElement().sendKeys("Rested Test Automation");
    }

    @And("click on submit button")
    public void clickOnSubmitButton(){

         WebElement submit = assessmentPageLocator.getSubmitElement();
        ((JavascriptExecutor) webDriverHook.getDriver()).executeScript("arguments[0].scrollIntoView(true);", submit);
        submit.click();

    }

    @Then("It shows message in alert window {string}")
    public void showAlertMessage(String expectedMessage){


        // Get the alert text
        WebElement alert = assessmentPageLocator.getWellbeingAlertElement();
        String actualMessage = alert.getText();

        // Assert the message
        assertTrue("Actual message: " + actualMessage, actualMessage.contains(expectedMessage));

    }

}
