package com.wbl.oopsexamples;

public class TisChaining {
    // constructor chaining or constructor reusing by this keyword
    int id;
    String name,course;
    float fees;

    TisChaining(int id,String name,String course){
        this.id =id;
        this.name = name;
        this.course = course;
    }
    TisChaining(int id,String name,String course,float fees){
        this(id,name,course);
        this.fees=fees;
    }

    void display(){
        System.out.println("id is "+id +" name is "+name +" course " +course +" fees " +fees);
    }

    public static void main(String[] args) {
        TisChaining t1 = new TisChaining(1,"shilpa" ,"qa");
        TisChaining t2 = new TisChaining(2, "supriya","UI",1000);
        t1.display();
        t2.display();
    }
}
