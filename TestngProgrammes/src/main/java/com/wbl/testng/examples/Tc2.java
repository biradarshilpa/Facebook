package com.wbl.testng.examples;

import org.testng.annotations.*;

public class Tc2 {
    @BeforeSuite
    void beforeSuite(){
        System.out.println("Before Suite");
    }

    @AfterSuite
    void afterSuite(){
        System.out.println("After Suite");
    }
    @BeforeClass
    void beforeClass1(){
        System.out.println("Before Class");
    }

    @AfterClass
    void afterClass1(){
        System.out.println("After Class");
    }

    @BeforeMethod
    void beforeMethod1(){
        System.out.println("Before Method");
    }

    @AfterMethod
    void afterMethod1(){
        System.out.println("After Method");
    }

    @Test
    void test3() {
        System.out.println("This is test3...");
    }


    @Test
    void test4() {
        System.out.println("This is test4...");
    }
}