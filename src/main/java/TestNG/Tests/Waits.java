package TestNG.Tests;

import TestNG.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;

public class Waits {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }

    @Test
    public void explicitWait() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        Thread.sleep(2000);
        driver.findElement(By.id("start")).click();
        Thread.sleep(2000);

        WebElement usernameInput = driver.findElement(By.id("username"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));
        wait.until(ExpectedConditions.visibilityOf(usernameInput));

        usernameInput.sendKeys("Bolta");
        Thread.sleep(2000);

    }

}
