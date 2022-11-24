package TestNG.Tests;

import TestNG.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;


public class MultipleWIndows {

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
    public void SwitchWindows() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/windows");
        Thread.sleep(1000);

        System.out.println("Landing page title = " + driver.getTitle());

        driver.findElement(By.linkText("Click Here")).click();
        Thread.sleep(1000);

        System.out.println("New page title = " + driver.getTitle());

        String currentWindowTitle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();

        for (String windowHandle : windowHandles) {

            if (!windowHandle.equals(currentWindowTitle)) {

                driver.switchTo().window(windowHandle);
            }


        }

        System.out.println("Page title after switch= " + driver.getTitle());

    }

}
