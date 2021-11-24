package com.wbl.exception;

public class MultipleCatch {

    public static void main(String[] args) {
        System.out.println("Multiple catch with one try block");
        try{
            int data = 100/0;
        }
        catch(Exception e){
            System.out.println("caught by Exception class ");
        }
        //catch(ArithmeticException e){// it will show error as the exception is already caught
       // }
    }
}
