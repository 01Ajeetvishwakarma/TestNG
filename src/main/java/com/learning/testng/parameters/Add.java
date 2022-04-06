package com.learning.testng.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Add {

    @Test @Parameters({"a","b"})
    public void add(int c, int d)
    {
        int add = c+d;
        System.out.println("Addition is "+ add);
    }
}
