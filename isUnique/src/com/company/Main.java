package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print(isUnique2("hello") +"\n"); //false
        System.out.print(isUnique2("hi")+"\n"); // true
        System.out.print(isUnique2("")+"\n"); // true
        System.out.print(isUnique2("=he laied ")+"\n"); // false
        System.out.print(isUnique2("=he iw")+"\n"); // true
    }

    //implement an algorithm to determine if a string has all unique characters.
    //hello -> false
    // hi -> true
    public static boolean isUnique1(String str) {
        HashSet<Character> hs = new HashSet<>();

        if(str.length()>128) {
            return false;
        }
        for(int i =0; i < str.length(); i++) {
            if(hs.contains(str.charAt(i))) {
                return false;
            } else {
                hs.add(str.charAt(i));
            }
        }
        return true;
    }

    // What if you can't use additional data structures?
    public static boolean isUnique2(String str) {
        if(str.length()>128) {
            return false;
        }

        boolean[] bool_set = new boolean[128];
        for(int i = 0; i< str.length(); i++) {
            int ch = str.charAt(i);
            if(bool_set[ch]) {
                return false;
            } else {
                bool_set[ch] = true;
            }
        }
        return true;

    }
}
