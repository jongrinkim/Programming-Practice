package com.company;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.jar.Pack200;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.print(containAnagram("abc", "baefcabio") + "\n"); //true
        System.out.print(containAnagram("abc", "baefcaio") + "\n"); //false
        System.out.print(containAnagram("abc", "bbefccab") + "\n"); //true
    }


    // abc     ,   baefcabio
    public static boolean containAnagram(String shortStr, String longStr) {
        if(shortStr.length() > longStr.length()) {
            return false;
        }

        HashMap<Character, Integer> hm = new HashMap<>();
        int s_length = shortStr.length();

        for(int i = 0 ; i < shortStr.length(); i++) {
            if(hm.containsKey(shortStr.charAt(i))) {
                hm.put(shortStr.charAt(i), hm.get(shortStr.charAt(i))+1);
            } else {
                hm.put(shortStr.charAt(i), 1);
            }
        }
        HashMap<Character, Integer> hm_c = new HashMap<Character, Integer>(hm);

        for(int i = 0; i < longStr.length(); i++) {
            if(hm_c.containsKey(longStr.charAt(i)) && hm_c.get(longStr.charAt(i)) > 0 ) {
                hm_c.put(longStr.charAt(i), hm_c.get(longStr.charAt(i))-1);
                s_length--;
            } else if(hm_c.containsKey(longStr.charAt(i)) && hm_c.get(longStr.charAt(i)) <= 0 ) {
                s_length = shortStr.length() - 1;
                hm_c = new HashMap<>(hm);
                hm_c.put(longStr.charAt(i), hm_c.get(longStr.charAt(i))-1);
            } else if(!hm_c.containsKey(longStr.charAt(i))) {
                s_length = shortStr.length();
                hm_c = new HashMap<>(hm);
            }
            if(s_length == 0) {
                return true;
            }
        }

        return false;

    }
}
