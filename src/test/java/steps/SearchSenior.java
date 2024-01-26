package steps;

import core.WebDriverHook;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import locators.Homepagelocator;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchSenior {

    private Homepagelocator homepagelocator;

    private WebDriverHook webDriverHook;

    private WebDriverWait wait;

    public SearchSenior() {

        webDriverHook = WebDriverHook.getInstance();
        homepagelocator = new Homepagelocator(webDriverHook.getDriver());
        this.wait = new WebDriverWait(webDriverHook.getDriver(), Duration.ofSeconds(60));

    }

    @And("user search senior in searchbar")
    public void searchSenior() {

        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".MuiBackdrop-root.css-1dgnwnj-backdrop")));
            wait.until(ExpectedConditions.visibilityOf(homepagelocator.searchResult()));
            System.out.println("try mein aya search senior ke");
            Thread.sleep(1);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        homepagelocator.searchbar().sendKeys("Agro");
        homepagelocator.searchbar().sendKeys(Keys.ENTER);

        webDriverHook.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @And("user must wait")
    public void userMustWait() {

//        try {
//            System.out.println("I am in try");
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

//        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".MuiBackdrop-root printHide.css-1dgnwnj-backdrop")));

        webDriverHook.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

   @Then("it should show search result")
    public void itShowsSearchResult(){

        homepagelocator.searchbar();

        // Assert the correct result
        String expectedText = "Agro";

       Assert.assertTrue(homepagelocator.getSearchBar(expectedText));
    }


}
