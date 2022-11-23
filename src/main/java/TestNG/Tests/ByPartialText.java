package TestNG.Tests;

import TestNG.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ByPartialText {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        WebElement thirdLink = driver.findElement(By.partialLinkText("Example 3"));
        thirdLink.click();

//        driver.findElement(By.partialLinkText("Example 3")).click();

        Thread.sleep(2000);
        driver.quit();


    }

}
