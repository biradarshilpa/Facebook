package com.wbl.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArraylistToArray {

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        Object[] objects = al.toArray();
        for (Object obj : objects){
            System.out.println(obj);
        }
    }
}
