package com.wbl.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ListLinkedList {
    public static void main(String[] args) {
        LinkedList <String> l = new LinkedList<String>();
        l.add("Shilpa");
        l.add("Aditi");
        l.add("Veer");
        l.add("Shilpa");
        System.out.println(l);
        System.out.println("-------------");
        for (int i =0; i< l.size();i++){
            System.out.println(l.get(i));
        }
        System.out.println("--------------");
        Collections.sort(l);
        for (int i =0; i< l.size();i++){
            System.out.println(l.get(i));
        }
        l.remove(2);
        System.out.println("----------------");
        System.out.println(l);
        System.out.println("-----------------");
        //using iterator
        Iterator i = l.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        l.addFirst("Sowmya");
        l.addLast("Arohi");
        System.out.println("------------------");
        //using iterator
        Iterator i1 = l.descendingIterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
        System.out.println(l.size());



    }
}
