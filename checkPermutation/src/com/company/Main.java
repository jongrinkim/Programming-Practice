package com.company;

import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
	    System.out.print(checkPermutation("Hello", "lloeH")+"\n"); //true
        System.out.print(checkPermutation("Hello", "lloe")+"\n");  //false
        System.out.print(checkPermutation("", "")+"\n");  //true
        System.out.print(checkPermutation("h", "h")+"\n");  //true
        System.out.print(checkPermutation("123", "111")+"\n");  //false
    }

    public static boolean checkPermutation(String str1, String str2) {
        if(str1.length()!=str2.length()) {
            return false;
        }

        Hashtable<Character, Integer> ht = new Hashtable<>();

        for(int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if(ht.containsKey(c)) {
                ht.put(c,ht.get(c)+1);
            } else {
                ht.put(c,1);
            }
        }

        //access str2 to decrement all the char from hash table; if hash table doesn't contain the str2 char, return false
        for(int j = 0; j < str2.length(); j++) {
            char c = str2.charAt(j);
            if(ht.containsKey(c)) {
                ht.put(c,ht.get(c)-1);
            } else {
                return false;
            }
        }
        //access each hash table to make sure all the values are 0
        for(char c : ht.keySet()) {
            if(ht.get(c) != 0) {
                return false;
            }
        }
        return true;

    }
}
