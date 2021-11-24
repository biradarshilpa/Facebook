package com.wbl.testng.examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondExample {
    @Test(priority = 1)
    void setUp(){
        System.out.println("setup");
    }

    @Test(priority = 3)
    void searchCustomer(){
        System.out.println("search");
    }

    @Test(priority = 2)
    void addCustomer(){
        System.out.println("Add");
        Assert.assertEquals(1,1);
    }

    @Test(priority = 4)
    void tearDown(){
        System.out.println("close");
    }
}
