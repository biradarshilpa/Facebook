package com.wbl.oopsexamples;

public class SingleInheritAnimal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
    class Dog extends SingleInheritAnimal{
        void bark(){
            System.out.println("Dog is barking");
        }
    }
    class InheritTest{
        public static void main(String[] args) {
            Dog d = new Dog();
             d.bark();
             d.eat();

        }

}
