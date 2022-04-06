package com.learning.testng.priority;

import org.testng.annotations.Test;

public class Priority {

    @Test(priority = 3)
    public void test1()
    {
        System.out.println("First Test");
    }

    @Test(priority = 1)
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
