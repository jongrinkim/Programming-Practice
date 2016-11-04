package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(lengthOfLongestSubstring("abcabcbb")); //should return 3
        System.out.println(lengthOfLongestSubstring("bbbbb")); //should return 1
        System.out.println(lengthOfLongestSubstring("pwwkew")); //should return 3
    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int counter = 0;
        int maxSoFar = 0;
        for(int i = 0; i< s.length(); i++) {
            if(!hs.contains(s.charAt(i))) {
                hs.add(s.charAt(i));
                counter++;
            } else {
                if(counter > maxSoFar) {
                    maxSoFar = counter;
                }
                hs.clear();
                counter = 1;
                hs.add(s.charAt(i));
            }

        }
        return maxSoFar;
    }
}
