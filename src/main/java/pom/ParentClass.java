package pom;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ThreadLocalBaseDriver;

import java.util.List;

public class ParentClass {

    protected WebDriverWait wait;
    protected WebDriver driver;

    public ParentClass() {
        driver = ThreadLocalBaseDriver.getDriver();
        wait = new WebDriverWait(driver, 10);
    }



    public void waitAndClick(WebElement element) {
        WebElement webElement = wait.until(ExpectedConditions.visibilityOf(element));
        webElement.click();
    }



    public void waitAndSendKeys(WebElement element, String text) {
        WebElement webElement = wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.clear();
        webElement.sendKeys(text);
    }



}
