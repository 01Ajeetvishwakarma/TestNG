package com.learning.testng.data_provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_With_Multiple_Parameters {

    @DataProvider(name = "multiple-data")
    public Object[][] data()
    {
        Object[][] data  = new Object[3][3];

        data[0][0] = "AJEET";
        data[0][1] = "y";
        data[0][2] = "z";

        data[1][0] = "VISHWAKARMA";
        data[1][1] = "a";
        data[1][2] = "b";

        data[2][0] = "XXX";
        data[2][1] = "c";
        data[2][2] = "d";

        return  data;
    }

    @Test(dataProvider = "multiple-data")
    public void readDataFromDataProvider(String fname, String lname, String email)
    {
        System.out.println("First name is: "+fname);
        System.out.println("First name is: "+lname);
        System.out.println("First name is: "+email);
        System.out.println("@@@###$$$%%%!!!***&&&");
    }

}
