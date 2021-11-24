package com.wbl.exception;

public class FinallyExample {
    // When an exception occurs and is handled by the catch block..
    // Later the finally block is executed after the try-catch block
    public static void main(String[] args) {
         try{
             System.out.println("Inside the try Block");
             int i = 25/0;
         }
        /* catch(Exception e){
             System.out.println("Exception Handled");
             System.out.println(e);
         }*/

         finally{
            System.out.println("finally block is always executed");
        }

        System.out.println("Execution continuous");


    }
}
