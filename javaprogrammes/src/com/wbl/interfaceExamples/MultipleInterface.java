package com.wbl.interfaceExamples;

interface FirstInterface
{
    public void firstMethod();
}

interface SecondInterface
{
    public void secondMethod();
}

class TestInterface implements FirstInterface,SecondInterface
{
public void firstMethod(){
    System.out.println("First interface");
}
public void secondMethod(){
    System.out.println("second interface");
}

}

public class MultipleInterface {
    public static void main(String[] args) {
        TestInterface t = new TestInterface();
        t.firstMethod();
        t.secondMethod();
    }

}
