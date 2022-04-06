package com.learning.testng.timeout;

import org.testng.annotations.Test;

public class Time_Out {

    @Test(priority = 3, enabled = false)
    public void webStudentLogin()
    {
        System.out.println("Student Login By Web");
    }

    @Test(timeOut = 200)
    public void mobileStudentLogin() throws InterruptedException {
        Thread.sleep(400);
        System.out.println("Student Login By Mobile");
    }

    @Test(priority = 2)
    public void apiStudentLogin()
    {
        System.out.println("Student Login By API");
    }
}
