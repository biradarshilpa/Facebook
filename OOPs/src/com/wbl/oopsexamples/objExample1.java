package com.wbl.oopsexamples;

public class objExample1 {
    /*
    main outside the class
    Initialization through reference
    */

    int roll_no= 10;
    String name = "sam";
    int id ;
    String last_name;
    public static void main(String[] args) {

        objExample1 o = new objExample1();
        System.out.println( "Roll no is "+ o.roll_no);
        System.out.println("name is " +o.name);
        o.id = 2;
        o.last_name = "john";
        System.out.println("Roll no is "+o.roll_no +" name is "+o.name +" id is "+o.id +" last_name is " +o.last_name);



    }
}
