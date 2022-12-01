package TestNG.Tests;

import TestNG.Utilities.ConfigurationReader;
import TestNG.Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {

    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait wait;

    @BeforeMethod
    public void setup() {
        driver = Driver.get();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(ConfigurationReader.get("url"));
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        Driver.closeDriver();
    }
}
