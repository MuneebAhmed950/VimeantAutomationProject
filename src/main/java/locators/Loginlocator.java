package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Loginlocator {

    private WebDriver driver;

    private String EMAIL = "#email";

    private String PASSWORD = "#password";

    private String  LOGIN = "button[type='submit']";

    private WebDriverWait wait;

public Loginlocator(WebDriver driver){

    this.driver = driver;
    this.wait = new WebDriverWait(driver,Duration.ofSeconds(60));

}


public WebElement getEmail(){

WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(EMAIL)));
    return email;
    //driver.findElement(By.cssSelector(EMAIL));
}

public WebElement getPassword(){

    WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(PASSWORD)));
    return password;
}


public WebElement getLoginButton(){

    WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(LOGIN)));
    return login;
}

    public void closeBrowser() {
        driver.quit();
    }
}
