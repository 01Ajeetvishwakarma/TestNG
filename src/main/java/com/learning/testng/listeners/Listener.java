package com.learning.testng.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener
{

    @Override
    public void onTestStart(ITestResult result)
    {

    }

    @Override
    public void onTestSuccess(ITestResult result)
    {
        System.out.println("Success of test case and its details are :"+ result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result)
    {
        System.out.println("Failure of test case and its details are :"+ result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result)
    {
        System.out.println("Skipped of test case and its details are :"+ result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result)
    {
        System.out.println("TestFailedButWithinSuccessPercentage of test case and its details are :"+ result.getName());
    }

    @Override
    public void onStart(ITestContext result)
    {
        System.out.println("Start of test case and its details are :"+ result.getName());
    }

    @Override
    public void onFinish(ITestContext result)
    {
        System.out.println("Finish of test case and its details are :"+ result.getName());
    }
}
