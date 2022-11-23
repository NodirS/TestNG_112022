package TestNG.Tests;

import TestNG.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;


public class ElementDropDown {

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
    public void getDropDownList(){
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement dropdownElement = driver.findElement(By.id("state"));

        Select stateDropdownSelect = new Select(dropdownElement);

        List<WebElement> options = stateDropdownSelect.getOptions();
        System.out.println("Dropdown menu has " + options.size() + " options to choose from.");

        for (WebElement option : options) {
            System.out.println(option.getText());

        }

    }

}
