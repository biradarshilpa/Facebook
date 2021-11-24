package com.wbl.exception;

public class ThrowExample {

    public static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("person is not eligible to vote");
        } else {
            System.out.println("person is eligible to vote");
        }
    }

    public static void main(String[] args) {
        validate(19);
        System.out.println("rest of the code execution");
    }
}
