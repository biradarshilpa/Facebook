package com.wbl.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet hs = new LinkedHashSet();
        System.out.println("maintains insertion order,1 null value,no duplicates");
        hs.add("one");
        hs.add("two");
        hs.add("three");
        hs.add("three");
        hs.add("four");
        hs.add(null);
        hs.add("five");
        hs.add(null);
        hs.add("six");

        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
