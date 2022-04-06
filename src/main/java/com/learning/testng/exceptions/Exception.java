package com.learning.testng.exceptions;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ExpectedExceptionsAnnotation;

public class Exception {

    @Test(expectedExceptions = {ArithmeticException.class})
    public void Exception()
    {
        int i = 1/0;
        System.out.println("Value of i is: "+ i);
    }
}
