package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.plaf.basic.BasicArrowButton;
import java.time.Duration;

public class Homepagelocator {


    private WebDriver driver;
    private WebDriverWait wait;

    private String ARROW = "#root > div.printHide.MuiBox-root.css-0 > header > div.MuiBox-root.css-u4p24i > div.MuiBox-root.css-0 > div";

    private String LOGOUT = "div[class='MuiBox-root css-0'] div:nth-child(2)";

    private String SEARCHBAR = "input[placeholder='Search by name']";

    private String SEARCHRESULT = ".MuiTableBody-root.css-1xnox0e";



    public Homepagelocator(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));

    }

    public WebElement getArrow() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement arrow = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(ARROW)));
        return arrow;
    }

    public WebElement logoutButton() {


//        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".MuiBackdrop-root printHide.css-1dgnwnj-backdrop")));

        WebElement logout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(LOGOUT)));
        return logout;
    }

    public WebElement searchbar() {

        WebElement searchbar = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(SEARCHBAR)));
        return searchbar;
    }


    public boolean getSearchBar(String expectedText) {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeSmall css-1djbw6s-tableBody'][contains(.,'" + expectedText + "')]"))).isDisplayed();
        } catch (final Exception e) {
            return false;
        }
    }

    public WebElement searchResult(){


        WebElement searchresult= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(SEARCHRESULT)));
        return searchresult;
    }
}

