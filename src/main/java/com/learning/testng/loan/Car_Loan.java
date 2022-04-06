package com.learning.testng.loan;

import org.testng.annotations.Test;

public class Car_Loan {

    @Test(groups = {"SmokeTest"})
    public void webLoginCarLoan()
    {
        System.out.println("Web Login Car Loan");
    }
    @Test
    public void mobileLoginCarLoan()
    {
        System.out.println("Mobile Login Car Loan");
    }
    @Test
    public void apiLoginCarLoan()
    {
        System.out.println("API Login Car Loan");
    }

}
