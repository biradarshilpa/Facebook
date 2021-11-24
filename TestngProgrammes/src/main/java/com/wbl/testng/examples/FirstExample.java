package com.wbl.testng.examples;


import org.testng.annotations.Test;

public class FirstExample {
    @Test(priority = 1)
    void setup() {
        System.out.println("This is the setup test");
    }

    @Test(priority = 2)
    void login() {
        System.out.println("This is th login test");
    }

    @Test(priority = 3)
    void tearDown() {
        System.out.println("closing browser");
    }

}
