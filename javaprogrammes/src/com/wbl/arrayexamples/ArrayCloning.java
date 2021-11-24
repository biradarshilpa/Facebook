package com.wbl.arrayexamples;

public class ArrayCloning {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        System.out.println("Original Array");
        for (int i: arr){
            System.out.println(i);
        }

        System.out.println("cloning array");
        int carr[] = arr.clone();
        for (int i : carr){
            System.out.println(i);
        }
    }
}
