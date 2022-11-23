package TestNG.Tests;

import org.testng.annotations.Test;
import org.testng.Assert;

public class TestngAssertion {

    @Test
    public void test1 (){
        Assert.assertEquals("word", "word", "Not same!");
    }

    @Test
    public void test2(){
        String email = "email@email.com";
        Assert.assertTrue(email.contains("@"), "It does not");
    }
}
