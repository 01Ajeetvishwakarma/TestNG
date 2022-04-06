package com.learning.testng.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fruits {

    @Test
    @Parameters("mango")
        public void mango(String m)
        {
         System.out.println(m);
        }

    @Test
    @Parameters("apple")
         public void apple(String a)
         {
            System.out.println(a);
         }
}
