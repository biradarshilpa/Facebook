package com.wbl.testng.examples;

import org.testng.annotations.Test;

public class GroupingExample {
    @Test(groups = "sanity")
    void test1(){
        System.out.println("This is Test1..");
    }
    @Test(groups = "sanity")
    void test2(){
        System.out.println("This is Test2..");
    }
    @Test(groups="smoke")
    void test3(){
        System.out.println("This is Test3..");
    }
    @Test(groups = "smoke")
    void test4(){
        System.out.println("This is Test4..");
    }
    @Test(groups = {"sanity","smoke"})
    void test5(){
        System.out.println("This is Test5..");
    }
}
