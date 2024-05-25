package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AuthPage extends BasePage{

    WebDriver driver;
    String url = "https://www.saucedemo.com/";

    // Locators
    By usernameLocator = By.id("user-name");
    By passwordLocator = By.id("password");
    By loginLocator = By.id("login-button");

    public AuthPage(WebDriver webDriver){
        super(webDriver);
        driver = webDriver;
    }

    public void open(){
        driver.get(url);
    }

    public void waitPageIsLoaded(){
        waitElementIsLoaded(usernameLocator);
    }

    public void enterUsername(String username){
        WebElement usernameFld = driver.findElement(usernameLocator);
        usernameFld.clear();
        usernameFld.sendKeys(username);
    }

    public void enterPassword(String password){
        WebElement passwordFld = driver.findElement(passwordLocator);
        passwordFld.clear();
        passwordFld.sendKeys(password);
    }

    public void clickToLogin(){
        driver.findElement(loginLocator).click();
    }


}