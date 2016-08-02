package com.company;

public class Main {

    //hello -> olleh
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int caLength = charArray.length;

        for(int i = 0; i< caLength/2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[caLength-i-1];
            charArray[caLength-i-1] = temp;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        System.out.print(reverseString("\n"));
        System.out.print(reverseString("h\n"));
        System.out.print(reverseString("hello\n"));
        System.out.print(reverseString("ppppppppp\n"));
        System.out.print(reverseString("hello world bye\n"));


    }
}
