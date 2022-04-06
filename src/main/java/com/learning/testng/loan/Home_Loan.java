package com.learning.testng.loan;

import org.testng.annotations.Test;

public class Home_Loan {

    @Test
    public void webLoginHomeLoan()
    {
        System.out.println("Web Login Home Loan");
    }
    @Test(groups = {"SmokeTest"})
    public void mobileLoginHomeLoan()
    {
        System.out.println("Mobile Login Home Loan");
    }
    @Test
    public void apiLoginHomeLoan()
    {
        System.out.println("API Login Home Loan");
    }

}
