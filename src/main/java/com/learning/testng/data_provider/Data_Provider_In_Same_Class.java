package com.learning.testng.data_provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_In_Same_Class {

    @DataProvider(name = "data-provider-in-same-class")
    public Object[][] data_Provider_Method()
    {
        return new Object[][]
                {
                        {"data-one"},
                        {"data-two"}
                };
    }

    @Test(dataProvider = "data-provider-in-same-class")
    public void test_Method(String data)
    {
        System.out.println("Data Provided By Data Provider is: "+data);
    }

}
