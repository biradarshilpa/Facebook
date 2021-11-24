package com.wbl.collections;

import java.util.LinkedHashMap;


public class MapLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap <Integer,String> map = new LinkedHashMap<Integer,String>();
        map.put(1,"aaa");
        map.put(2,"bbb");
        map.put(3,"ccc");
        map.put(4,"444");
        System.out.println(map);
        System.out.println("Key " + map.keySet());
        System.out.println("value " + map.values());
        System.out.println(" key and value pair " +map.entrySet());
    }
}
