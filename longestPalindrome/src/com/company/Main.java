package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String test = "ehelloworlddlrowiejongrinnirgnojow";
        String test2 = "aa";
        String test3 = "ccccc";
        String test4 = "aaabaaaa";
        String test5 = "abba";
        String test6 = "abb";

//        isPalindrome(test2, );
        System.out.println(longestPalindrome(test)); //jongrinnirgnoj
        System.out.println(longestPalindrome(test2));// aa
        System.out.println(longestPalindrome(test3)); // ccccc
        System.out.println(longestPalindrome(test5)); //should give you aaabaaa
        System.out.println(longestPalindrome(test6));
    }


    public static String longestPalindrome(String s) {
        int maxLengthSoFar = 0;
        String resultSoFar = "";


        for(int i = 0; i< s.length(); i++) {
            String test = checkPalindrome(s,i,i);
            String test2 = checkPalindrome(s,i,i+1);

            if(test.length()>test2.length()) {
                if(test.length()>=maxLengthSoFar) {
                    maxLengthSoFar = test.length();
                    resultSoFar = test;
                }

            } else {
                if(test2.length()>=maxLengthSoFar) {
                    maxLengthSoFar = test2.length();
                    resultSoFar = test2;
                }
            }
        }

        return resultSoFar;
    }

    public static String checkPalindrome(String s, int from, int to) {
        while(from >=0 && to < s.length() && s.charAt(from) == s.charAt(to) ) {
            from--;
            to++;
        }

        return s.substring(from+1,to);
    }

}
