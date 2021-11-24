package com.wbl.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class SetHashSet {
    public static void main(String[] args) {
        HashSet<String > set = new HashSet<String>();
        System.out.println("Maintains no order, at most one null,no duplicates");
        set.add("one");
        set.add("two");
        set.add(null);
        set.add("three");
        set.add("four");
        set.add("one");
        set.add(null);



        Iterator <String > it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(set.contains("three"));
        System.out.println("----------------");
        for (int i=0;i< set.size();i++){
            System.out.println(i);
        }

        System.out.println("----------------");
        set.remove("four");
        for (String s : set){
            System.out.println(s);
        }
        System.out.println("-----------");
        set.removeAll(set);
        System.out.println(set.size());

    }
}
