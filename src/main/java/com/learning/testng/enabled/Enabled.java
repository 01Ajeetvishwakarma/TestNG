package com.learning.testng.enabled;

import org.testng.annotations.Test;

public class Enabled {

    @Test(priority = 3)
    public void test1()
    {
        System.out.println("First Test");
    }

    @Test(priority = 1, enabled = false)
    public void test2()
    {
        System.out.println("Second Test");
    }

    @Test(priority = 2)
    public void hello()
    {
        System.out.println("Third Test");
    }
}
