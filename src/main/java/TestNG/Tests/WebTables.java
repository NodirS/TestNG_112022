package TestNG.Tests;

import TestNG.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class WebTables {

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
    public void printTable() {

        driver.get("http://practice.cybertekschool.com/tables");

        WebElement table = driver.findElement(By.xpath("//table[@id='table1']"));
        System.out.println("table.getText() = " + table.getText());

    }

    @Test
    public void getAllHeaders() {
        driver.get("http://practice.cybertekschool.com/tables");

        List<WebElement> allRowsWithHeaders = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        System.out.println("allRowsWithHeaders.size() = " + allRowsWithHeaders.size());

        for (WebElement allRowsWithHeader : allRowsWithHeaders) {

            System.out.println("allRowsWithHeader.getText() = " + allRowsWithHeader.getText());

        }
    }

    @Test
    public void printAllCellsByIndex() {

        int rowNumber = getNumberofRows();
        int columnNumber = getNumberofColumns();

        System.out.println("rowNumber = " + rowNumber);
        System.out.println("columnNumber = " + columnNumber);

        for (int i = 1; i < rowNumber; i++) {

            for (int j = 2; j < columnNumber; j++) {
                String Xpath = "//table[@id='table1']/tbody/tr[" + i + "]/td[" + j + "]";
                System.out.println(Xpath);
            }
        }
    }

    private int getNumberofColumns() {

        List<WebElement> allCellsInOneRow = driver.findElements(By.xpath("//table[@id='table1']//th"));
        return allCellsInOneRow.size();

    }

    private int getNumberofRows() {

        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        return headers.size();

    }

}
