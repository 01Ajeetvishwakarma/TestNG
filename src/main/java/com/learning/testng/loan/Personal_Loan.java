package com.learning.testng.loan;

import org.testng.annotations.Test;

public class Personal_Loan {

    @Test
    public void webLoginPersonaLoan()
    {
        System.out.println("Web Login Personal Loan");
    }
    @Test
    public void mobileLoginPersonaLoan()
    {
        System.out.println("Mobile Login Personal Loan");
    }
    @Test(groups = {"SmokeTest"})
    public void apiLoginPersonaLoan()
    {
        System.out.println("API Login Personal Loan");
    }
}
