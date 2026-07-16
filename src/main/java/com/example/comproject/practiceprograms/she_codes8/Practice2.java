package com.example.comproject.practiceprograms.she_codes8;

import java.util.Arrays;
import java.util.TreeMap;

//https://www.instagram.com/p/DasgjMYNQM7/
public class Practice2 {

    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3,"Three");
        treeMap.put(1,"One");
        treeMap.put(4,"Four");
        treeMap.put(2,"Two");
        treeMap.put(2,"TWO");

        System.out.println("treeMap = " + treeMap);

    }
}



   /* TreeMap is a class in the Java Collections Framework that stores key-value pairs like HashMap, but keeps the keys sorted.

        With HashMap:

        103 -> John
        101 -> Alice
        105 -> Bob
        102 -> David


        With TreeMap:

        101 -> Alice
        102 -> David
        103 -> John
        105 -> Bob
        */