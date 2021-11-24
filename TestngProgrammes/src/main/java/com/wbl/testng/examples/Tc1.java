package com.wbl.testng.examples;

import org.testng.annotations.*;

public class Tc1 {
    @BeforeTest
    void beforeTest(){
        System.out.println("Before Test");
    }

    @AfterTest
    void afterTest(){
        System.out.println("After Test");
    }

    @BeforeClass
    void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("After Class");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("Before Method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("After Method");
    }

    @Test
    void test1(){
        System.out.println("This is test1...");
    }


    @Test
    void test2(){
        System.out.println("This is test2...");
    }
}
