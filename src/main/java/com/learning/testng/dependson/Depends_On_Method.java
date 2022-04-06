package com.learning.testng.dependson;

import org.testng.annotations.Test;

public class Depends_On_Method {

    @Test
    public void webStudentLogin()
    {
        System.out.println("Student Login By Web");
    }

    @Test
    public void mobileStudentLogin()
    {
        System.out.println("Student Login By Mobile");
    }

    @Test(dependsOnMethods = {"webStudentLogin"})
    public void apiStudentLogin()
    {
        System.out.println("Student Login By API");
    }
}
