package com.learning.testng.listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.learning.testng.listeners.Listener.class)
public class Class1 {
    @Test
    public void sum()
    {
        int a =3;
        int b =5;
        int sum = a+b;
        System.out.println(sum);
    }
    @Test
    public void test_to_fail()
    {
       System.err.println("Test Case Has Been Failed");
        Assert.assertTrue(false);
    }
}
