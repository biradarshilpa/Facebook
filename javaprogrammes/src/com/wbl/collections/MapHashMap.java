package com.wbl.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapHashMap {
    public static void main(String[] args) {
        System.out.println("");
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"apple");
        hm.put(2,"banana");
        hm.put(3,"watermelon");
        hm.put(4,"kiwi");
       // hm.put(1,"pineapple");
        hm.put(5,"banana");
        System.out.println(hm);

        //By using for each loop

        for (Map.Entry m: hm.entrySet()){
            System.out.println(m.getKey() + " " +m.getValue());
        }

        hm.remove(4);
        System.out.println(hm.size());
        System.out.println(hm);

    }
}