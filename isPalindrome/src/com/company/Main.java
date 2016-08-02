package com.company;

public class Main {

    //"Hello" -> false
    public static boolean isPalindrome(String str) {

        int stringSize = str.length();

        for(int i = 0; i < stringSize/2; i++) {
            if(!(str.substring(i, i+1).equals(str.substring(stringSize-1, stringSize)))) {
                return false;
            }
        }
        //if reaches here then it is palindrome
        return true;
    }

    public static void main(String[] args) {
        System.out.print(isPalindrome("") + "\n");
        System.out.print(isPalindrome("ab") + "\n");
        System.out.print(isPalindrome("aa") + "\n");
        System.out.print(isPalindrome("dad") + "\n");
        System.out.print(isPalindrome("hello") + "\n");
    }
}
