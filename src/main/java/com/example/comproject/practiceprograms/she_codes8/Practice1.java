package com.example.comproject.practiceprograms.she_codes8;
//https://www.instagram.com/p/Da0SxfmNyix/
public class Practice1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java") ;
        sb.insert(2,"Developer");
        System.out.println(sb);
    }
}


/*
    insert(int offset, String str)
    J a v a
    0 1 2 3

        You are inserting "Developer" at index 3.

        Index 3 is just before the last 'a'.

        So the result becomes:

        J a v Developer a*/
