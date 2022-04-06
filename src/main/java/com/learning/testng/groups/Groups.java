package com.learning.testng.groups;

import org.testng.annotations.Test;

public class Groups {
    @Test(groups = {"GroupA"})
    public void testCase1()
    {
        System.out.println("This Test Belongs to GroupA");
    }
    @Test(groups = {"GroupA","GroupB"})
    public void testCase2()
    {
        System.out.println("This Test Case Belongs to Both GroupA and GroupB");
    }
    @Test(groups = {"GroupB"})
    public void testCase3()
    {
        System.out.println("This Test Case Belongs to GroupB");
    }
}
