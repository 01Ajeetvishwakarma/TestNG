package com.learning.testng.groupsingroups;

import org.testng.annotations.Test;

public class Groups_In_Groups {

    @Test(groups = {"Smoke"}, description = "This is Test case for smoke test")
    public void test1()
    {
        System.out.println("Test1");
    }

    @Test(groups = {"Regression"})
    public void test2()
    {
        System.out.println("Test2");
    }

    @Test
    public void test3()
    {
        System.out.println("Test3");
    }
}
