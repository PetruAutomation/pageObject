package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver webDriver){
        driver = webDriver;
    }

    public void waitElementIsLoaded(By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void waitElementIsClickable(By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void isElementAppear(By locator, String message){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        try{
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch (TimeoutException e){
            Assert.fail(message);
        }
    }
}