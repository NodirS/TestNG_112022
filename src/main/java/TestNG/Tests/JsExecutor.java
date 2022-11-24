package TestNG.Tests;

import TestNG.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JsExecutor {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @Test
    public void clickWithJS() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/");
        WebElement dropdownLink = driver.findElement(By.linkText("Dropdown"));

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", dropdownLink);

        Thread.sleep(2000);

    }

    @Test
    public void typeWithJS() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        WebElement inputBox = driver.findElement(By.cssSelector("#input-example>input"));

        JavascriptExecutor executor2 = (JavascriptExecutor) driver;
        String textForImput = "Some random text";

        executor2.executeScript("arguments[0].setAttribute('value', '" + textForImput + "')", inputBox);

        Thread.sleep(2000);

    }

    @Test
    public void ScrolToElement() throws InterruptedException {

        driver.get("https://www.amazon.com/");

        WebElement languages = driver.findElement(By.id("icp-touch-link-language"));
        Thread.sleep(2002);

        JavascriptExecutor executor4 = (JavascriptExecutor) driver;

        executor4.executeScript("arguments[0].scrollIntoView(true);", languages);
        Thread.sleep(2002);
    }

}

