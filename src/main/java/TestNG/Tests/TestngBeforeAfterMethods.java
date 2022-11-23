package TestNG.Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Ignore;

public class TestngBeforeAfterMethods {

    @Test
    public void test1(){
        System.out.println("Imported TestNG successfully");
    }

    @Ignore
    @Test
    public void test2 (){
        System.out.println("This one gets ignored");
    }

    @BeforeMethod
    public void before(){
        System.out.println("Before start of test");
    }

    @AfterMethod
    public void after(){
        System.out.println("After start of test");
    }

}
