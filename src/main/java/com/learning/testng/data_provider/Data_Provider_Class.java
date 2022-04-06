package com.learning.testng.data_provider;

import org.testng.annotations.DataProvider;

public class Data_Provider_Class {

    @DataProvider(name = "data-provider-class")
    public Object[][] dataProviderMethod()
    {
        return new Object[][]
                {
                        {"data-one"},
                        {"data-two"}
                };
    }



}
