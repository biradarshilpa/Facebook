package com.wbl.oopsexamples;

public class objExample2 {
    //Object and Class Example: Initialization through method
  int roll_no;
  String name;
  void insertRecord(int r,String n){
      roll_no = r;
      name = n;

  }
  void display(){
      System.out.println(roll_no);
      System.out.println(name);
  }
    public static void main(String[] args) {

      objExample2 o1 = new objExample2(),o2= new objExample2();
     // objExample2 o2 = new objExample2();

      o1.insertRecord(1,"aaa");
      o2.insertRecord(2,"bbb");
      o1.display();
      o2.display();


    }
}
