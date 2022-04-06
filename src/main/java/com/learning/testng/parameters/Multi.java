package com.learning.testng.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multi {
    @Test
    @Parameters({"a","b"})
    public void multi(int c, int d)
    {
        int multi = c*d;
        System.out.println("Addition is "+ multi);
    }
}
