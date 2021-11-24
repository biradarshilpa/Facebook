package com.wbl.exception;

public class ExceptionHandleExample {
    public static void main(String[] args) {
        System.out.println(" Exception Example");
        try{
            int data = 100/0; // Risky code

        }
        catch(Exception e){
            System.out.println(e);// Handling code

        }
        try{
            String s = null;
            System.out.println(s.length());// performing an operation on null variable
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            String s1 = "abc";
            int i = Integer.parseInt(s1);// String variable converting into digit
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            int a[] = new int[5];
            a[10] = 50; // Array exceeds to its size
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Normal execution of rest of the code");
    }
}
