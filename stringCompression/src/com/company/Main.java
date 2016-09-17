package com.company;

public class Main {

    public static void main(String[] args) {

//        System.out.print(stringCompression("aabcccccaaa") + "\n");      //a2b1c5a3
//        System.out.print(stringCompression("a") + "\n");     //a
//        System.out.print(stringCompression("aabc") + "\n");     //aabc
//        System.out.print("".length() + "\n");     //""
//        System.out.print(stringCompression("") + "\n");     //""

        System.out.print(compressBad("aabcccccaaa") + "\n");      //a2b1c5a3
        System.out.print(compressBad("a") + "\n");     //a
        System.out.print(compressBad("aabc") + "\n");     //aabc
//        System.out.print("".length() + "\n");     //""
        System.out.print(compressBad("") + "\n");     //""
        System.out.print(String.valueOf(2).length());
    }
    //Implement a method to perfrom basic string compression using the count of repeated characters.
    // For example, the string aabcccccaaa would become a2b1c5a3.
    // If the "compressed" string would not become smaller than the original string,
    // your method should return the original string
    //You can assume the string has only uppercase and lowercase letters (a-z)

    //"aabcccccaaa" -> "a2b1c5a3"

    public static String stringCompression(String str) {
        if(str == "") {
            return str;
        }
        String result = "";
        int count = 0;
        char first_c = str.charAt(0);

        for(int i = 0; i < str.length();i++) {
            if(str.charAt(i) != first_c) {
                result = result + first_c + count;
                count = 1;
                first_c = str.charAt(i);
            } else {
                count++;
                if(i == str.length()-1) {
                    result = result + first_c + count;
                }
            }
        }
        if(result.length() < str.length()) {
            return result;
        } else {
            return str;
        }
    }
    //appending to the string is O(n^2) since O(1 + 2 + 3 + 4 + ... + n) = O (n(n+1)/2) = O(n^2)
    //Can we do better?
    //implement using StringBuilder
    //Stringbuilder simply creates resizable array of all the strings, copying them back to string only when necessary
    public static String compressBad(String str) {
        //"aabcccccaaa" -> "a2b1c5a3"
        //Stringbuilder doubles in its size everytime you
        StringBuilder sb = new StringBuilder();
        int consecutiveCount = 0;

        for(int i = 0; i < str.length(); i++) {
            consecutiveCount++;

            if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
                sb.append(str.charAt(i)) ;
                sb.append(consecutiveCount);
                consecutiveCount = 0;
            }
        }
        if(sb.length()<str.length()) {
            return sb.toString();
        } else {
            return str;
        }
    }
}
