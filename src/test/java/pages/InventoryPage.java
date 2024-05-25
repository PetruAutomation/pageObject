package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InventoryPage extends BasePage{
    WebDriver driver;

    By addToCartBagLocator = By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']");
    By cartLocator = By.className("shopping_cart_link");

    public InventoryPage(WebDriver webDriver){
        super(webDriver);
        driver = webDriver;
    }

    public void waitPageIsLoaded(){
        waitElementIsClickable(addToCartBagLocator);
    }

    public void addBagToCart(){
        driver.findElement(addToCartBagLocator).click();
    }

    public void navigateToCart(){
        driver.findElement(cartLocator).click();
    }
}