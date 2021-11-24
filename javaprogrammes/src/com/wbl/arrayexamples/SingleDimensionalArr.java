package com.wbl.arrayexamples;

public class SingleDimensionalArr {
    public static void main(String[] args) {
        int a[] = new int[5];//declaration and instantiation
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
        System.out.println(a[0]);
        // By using for loop
        System.out.println("Length of array " +a.length);
        for (int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }

        int b[]={1,2,3,4,5};
        for(int j=0;j<b.length;j++){
            System.out.println(b[j]);
        }

        // By using for each loop

        int c[] ={6,7,8,9,10};
        for (int i:c){
            System.out.println(i);
        }

    }
}
