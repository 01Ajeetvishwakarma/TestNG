package com.learning.testng.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Cases {

    @Test
    public void test_to_pass()
    {
        Assert.assertTrue(true);
    }
    @Test
    public void test_to_fail()
    {
        Assert.assertTrue(false);
    }
}
