package TestNG.Tests;

import TestNG.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("fireFox");
        driver.get("https://www.google.com");

    }

}
