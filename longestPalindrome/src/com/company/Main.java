package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String test = "ehelloworlddlrowiejongrinnirgnojow";
        System.out.println(longestPalindrome(test));
    }

    public static String longestPalindrome(String s) {
        boolean soFarPalindrome = false;
        String palindromeString = "";
        String resultSoFar = "";

        for(int i = 0; i < s.length(); i++) {
            int copy_i = i;
            for(int j = s.length()-1; j >= i; j--) {
                if(s.charAt(j) == s.charAt(copy_i)) {
                    copy_i++;
                    soFarPalindrome = true;
                    palindromeString += s.charAt(j);
                } else {
                    copy_i = i;
                    soFarPalindrome = false;
                    palindromeString = "";
                }
            }
            if(soFarPalindrome && palindromeString.length() > resultSoFar.length()) {
                resultSoFar = palindromeString;
            }

        }

        return resultSoFar;
    }
}
