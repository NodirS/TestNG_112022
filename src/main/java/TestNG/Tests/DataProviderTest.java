package TestNG.Tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @DataProvider
    public Object [][] testData(){

        String[][] data = {
                {"Movie 1", "10"},
                {"Movie 2", "8"},
                {"Movie 3", "5"},
                {"Movie 4", "4"},
                {"Movie 5", "7"},
        };
        return data;
    }

    @Test(dataProvider = "testData")
    public void testOne(String movie, String rating){
        System.out.println("Movie name: " + movie + "'s rating is " + rating);
    }

}
