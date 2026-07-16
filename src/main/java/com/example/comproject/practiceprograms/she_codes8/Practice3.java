package com.example.comproject.practiceprograms.she_codes8;
//https://www.instagram.com/p/DasfiTNNUHR/

import java.util.HashSet;

public class Practice3 {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("is");
        hashSet.add("fun");
        hashSet.add("Java");
        hashSet.add(null);
        hashSet.add("is");

        System.out.println("hashSet = " + hashSet);
    }
}


/*
On the output:
        1) Null will stay at the begining
        2) Duplicates will be removed
        3) The order of elements is not guaranteed, as HashSet does not maintain insertion order.
        4) The output will be something like: hashSet = [null, Java, is, fun] or in any other order, but without duplicates and with null included.
*/
