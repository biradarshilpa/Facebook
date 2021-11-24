package com.wbl.testng.examples;

import org.testng.annotations.Test;

public class PriorityExample {
    @Test(priority = 1)
    void testOne(){
        System.out.println("This is Test1");
    }
    @Test(priority = 2)
    void testTwo(){
        System.out.println("This is Test2");
    }
    @Test(priority = 3)
    void testThree(){
        System.out.println("This is Test3");
    }
    @Test(priority = 4 ,enabled = false)//this enable makes the tests not to participate in the execution
    void testFour(){
        System.out.println("This is Test4");
    }


}

