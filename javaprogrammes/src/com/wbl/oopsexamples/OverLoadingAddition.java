package com.wbl.oopsexamples;

public class OverLoadingAddition {



        //  This sum takes two int parameters
        public int add(int x, int y)
        {
            return (x + y);
        }

        //  This sum takes three int parameters
        public int add(int x, int y, int z)
        {
            return (x + y + z);
        }

        //  This sum takes two double parameters
        public double add(double x, double y)
        {
            return (x + y);
        }


        public static void main(String args[])
        {
            OverLoadingAddition s = new OverLoadingAddition();
            System.out.println(s.add(10, 20));
            System.out.println(s.add(10, 20, 30));
            System.out.println(s.add(10.5, 20.5));
        }
    }

