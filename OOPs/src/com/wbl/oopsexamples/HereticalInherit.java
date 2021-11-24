package com.wbl.oopsexamples;

public class HereticalInherit {

    public static void main(String[] args) {
       ChildA a = new ChildA();
        a.Animal();
        a.cat();

       ChildB b = new ChildB();
       b.Animal();
       b.dog();


    }
}


  class  ParentAnimal{
    void Animal(){
        System.out.println("Parent");
    }
}

class ChildA extends ParentAnimal {
    void cat(){
        System.out.println(" First child");
    }
}
 class ChildB extends ParentAnimal{
    void dog(){
        System.out.println(" second child");
    }
 }




