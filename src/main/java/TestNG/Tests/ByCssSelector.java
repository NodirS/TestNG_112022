package TestNG.Tests;

import TestNG.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class ByCssSelector {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("firefox");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#disappearing_button")).click();

        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".btn-primary")).click();
    }

}

//        id="button_check"
//        # for id        #button_check
//        . for class
//        ^ starts with   button[id^="button_"]
//        $ ends with     button[id$="check"]
//        * contains
//        ~ next sibling
//        > move to child

