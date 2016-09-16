package com.company;

import java.util.Enumeration;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print(isPalindromePermutation("Tact Coa") + "\n"); //true
        System.out.print(isPalindromePermutation("daD")+ "\n"); //true
        System.out.print(isPalindromePermutation("hello")+ "\n"); //false

    }

    //Given a string, write a function to check if it's a permutation of a palindrome.
    // The palindrome doesn't need to be limited to just dictionary words
    //Input: Tact Coa
    //Output: True (permutations: "taco cat", "atco cta", etc.)


    public static boolean isPalindromePermutation(String str) {
        String n_str = str.toLowerCase();
        n_str = n_str.replaceAll("\\s+","");

        Hashtable<Character, Integer> ht = new Hashtable<>();

        for(int i = 0; i<n_str.length(); i++) {
            char c = n_str.charAt(i);
            if(ht.containsKey(c)) {
                ht.put(c, ht.get(c)+1);
            } else {
                ht.put(c, 1);
            }
        }




        int twoCount = 0;
        int oneCount = 0;
        for(char c : ht.keySet()) {
            if(ht.get(c)==2) {
                twoCount++;
            }
            else if(ht.get(c)==1 ) {
                oneCount++;
                if(oneCount > 1) {
                    return false;
                }
            }
            else if(ht.get(c)!=2 && ht.get(c)!=1) {
                return false;
            }
        }
        return true;


//How to iterate through the values of HashTables?
//        Enumeration e = ht.elements();
//
//        while (e.hasMoreElements()){
//            System.out.println(e.nextElement() + "\n");
//        }
    }
}
