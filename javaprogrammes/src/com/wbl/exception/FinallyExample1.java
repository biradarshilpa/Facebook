package com.wbl.exception;

public class FinallyExample1 {
    //when exception occurs and is not caught by catch block
    // finally block will always execute

    public static void main(String[] args) {

        try{
            System.out.println("Inside try block");
            int i = 25/0;
        }
         catch(ArrayIndexOutOfBoundsException e){
             System.out.println("Exception Handled");
         }
        finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("execution continues");

    }
}
