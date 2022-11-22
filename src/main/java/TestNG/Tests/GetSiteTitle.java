package TestNG.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSiteTitle {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        String siteTitle = driver.getTitle();
        System.out.println("Site title is " + siteTitle);

        String currentURL = driver.getCurrentUrl();
        System.out.println("URL is " + currentURL);

        driver.quit();

    }

}
