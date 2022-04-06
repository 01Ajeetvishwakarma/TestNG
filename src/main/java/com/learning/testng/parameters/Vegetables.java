package com.learning.testng.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Vegetables {

    @Test
    @Parameters("Cauliflower")
    public void mango(String c)
    {
        System.out.println(c);
    }

    @Test
    @Parameters("Ladyfinger")
    public void apple(String l)
    {
        System.out.println(l);
    }

}
