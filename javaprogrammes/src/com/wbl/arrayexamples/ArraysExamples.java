package com.wbl.arrayexamples;

public class ArraysExamples {
    static void minimum(int arr[]){

        int min = arr[0];
        for (int i=1;i<arr.length;i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }



    public static void main(String[] args) {

        int a[] = { 33,22,5,3,2};
        minimum(a);// passing the array to the method

    }
}
