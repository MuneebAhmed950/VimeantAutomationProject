package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AssessmentPageLocator {

    private String ASSESSMENT = "div.MuiBox-root.css-1lzo07v-container >div:nth-child(4)";
    private WebDriver driver;
    private WebDriverWait wait;

    private String    WELLBEING=  "//button[normalize-space()='Wellbeing Survey']";

    private String   BUSYRADIO = "//span[normalize-space()='Busy']";
    private String   BUSYCOMMENT= "//textarea[contains(@name,'engagement')]";


    private String HAPPYRADIO = "//span[normalize-space()='Happy']";
    private String   HAPPYCOMMENT= "//textarea[contains(@name,'happiness')]";

    private String PURPOSERADIO ="//span[normalize-space()='Purpose']";
    private String   PURPOSECOMMENT= "//textarea[contains(@name,'purpose')]";

    private String SOCIALRADIO ="//span[normalize-space()='Social']";
    private String   SOCIALCOMMENT= "//textarea[contains(@name,'social')]";

    private String RELAXEDRADIO ="//span[normalize-space()='Relaxed']";
    private String   RELAXEDCOMMENT= "//textarea[contains(@name,'relax')]";

    private String PAINFREERADIO ="//span[normalize-space()='Pain Free']";
    private String   PAINCOMMENT= "//textarea[contains(@name,'comfort')]";

    private String RESTEDRADIO ="//span[normalize-space()='Rested']";
    private String   RESTEDCOMMENT= "//textarea[contains(@name,'energy')]";

    private String SUBMIT = "//button[contains(.,'Submit')]";

    private String WELLBEINGALERT = ".MuiDialogContent-root.css-lw2vey-content";

    public AssessmentPageLocator(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));

    }

    public WebElement getAssessmentlocator(){

        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(ASSESSMENT)));
    }

    public WebElement getWellbeingSurvey(){

        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(WELLBEING)));
    }

    public WebElement getBusyRadioElement() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BUSYRADIO)));
    }

    public WebElement getHappyRadioElement() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(HAPPYRADIO)));
    }

    public WebElement getPurposeRadioElement() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PURPOSERADIO)));
    }

    public WebElement getSocialRadioElement() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SOCIALRADIO)));
    }

    public WebElement getRelaxedRadioElement() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RELAXEDRADIO)));
    }

    public WebElement getPainFreeRadioElement() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PAINFREERADIO)));    }

    public WebElement getRestedRadioElement() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RESTEDRADIO)));
    }
    public WebElement getBusyCommentElement() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BUSYCOMMENT)));
    }

    public WebElement getHappyCommentElement() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(HAPPYCOMMENT)));
    }

    public WebElement getPurposeCommentElement() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PURPOSECOMMENT)));
    }

    public WebElement getSocialCommentElement() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SOCIALCOMMENT)));
    }

    public WebElement getRelaxedCommentElement() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RELAXEDCOMMENT)));
    }

    public WebElement getPainCommentElement() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PAINCOMMENT)));
    }

    public WebElement getRestedCommentElement() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RESTEDCOMMENT)));
    }

    public WebElement getSubmitElement() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SUBMIT)));
    }

    public WebElement getWellbeingAlertElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(WELLBEINGALERT)));
    }


}
