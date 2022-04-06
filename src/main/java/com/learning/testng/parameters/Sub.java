package com.learning.testng.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sub {
    @Test
    @Parameters({"a","b"})
    public void sub(int c, int d)
    {
        int sub = c-d;
        System.out.println("Subtraction is "+ sub);
    }
}
