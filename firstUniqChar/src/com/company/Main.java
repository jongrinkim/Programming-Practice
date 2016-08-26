package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(firstUniqChar("leetcode")); //should return 0
        System.out.println(firstUniqChar("loveleetcode")); //should return 2

    }


    //Given a string, find the first non-repeating character in it and return it's index.
    // If it doesn't exist, return -1.

//    s = "leetcode"
//            return 0.
//
//    s = "loveleetcode",
//            return 2.

    public static int firstUniqChar(String s) {

        HashMap<String, Integer> hm = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            if(hm.containsKey(s.substring(i, i+1))) {
                hm.put(s.substring(i,i+1), hm.get(s.substring(i,i+1))+1);
            }
            else {
                hm.put(s.substring(i,i+1), 1);
            }
        }

        for(int i = 0; i< s.length(); i++) {
            if(hm.get(s.substring(i,i+1)) == 1) {
                return i;
            }
        }
        //this means all the string is repeating
        return -1;
    }
}
