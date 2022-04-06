package com.learning.testng.data_provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_in_Other_Class {

    @Test(dataProvider = "data-provider-class", dataProviderClass = Data_Provider_Class.class)
    public void testMethod(String data)
    {
        System.out.println("Data Provided By Data Provider is: "+data);
    }
}
