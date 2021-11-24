package com.wbl.abstraction;

abstract class Bank
     {
         //abstract method without body
         abstract int intRate();


     }
         // concrete methods
     class HSBC extends Bank
     {
         int intRate()
         {
             return(7);
         }
     }

     class Citi extends Bank
    {
        int intRate()
        {
             return(8);
        }
    }



   public class MainBank
   {
       public static void main(String[] args) {
           HSBC h = new HSBC();
           Citi c = new Citi();
           System.out.println( "Interest rate of HSBC " +h.intRate());
           System.out.println("Interest arte of Citi Bank " +c.intRate());
       }


   }