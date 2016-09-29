package com.company;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Set<String> test = permutation("abc");
        for (String s: test) {
            System.out.print(s + "\n");
        }
    }

    //"abc" -> ["abc", "acb", "bac" "bca" "cab" "cba"]
    public static Set<String> permutation(String str) {
        return permutation("", str);
    }

    static LinkedHashSet<String> hs = new LinkedHashSet<>();

    public static Set<String> permutation(String prefix, String str) {

        int length = str.length();
        if(length == 0) {
            hs.add(prefix);
        }

        for(int i = 0; i< str.length(); i++) {
            permutation(prefix + str.charAt(i), str.substring(0,i) + str.substring(i+1, length));
        }

        return hs;
    }
}
