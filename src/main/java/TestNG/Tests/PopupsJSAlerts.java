package TestNG.Tests;

import TestNG.Utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class PopupsJSAlerts {

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
    public void PopupCLick() throws InterruptedException {

        driver.get("http://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[.='Confirm']")).click();
        Thread.sleep(1000);

        WebElement popupButton = driver.findElement(By.xpath("//button[.='No']"));
        popupButton.click();
        Thread.sleep(1000);

    }

    @Test
    public void JsClick() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        driver.findElement(By.xpath("//button[1]")).click();

        Alert newAlert = driver.switchTo().alert();
        newAlert.accept();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[2]")).click();
        newAlert.dismiss();

    }
}
