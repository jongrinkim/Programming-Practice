package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        System.out.print(atoI("123") + "\n");
        System.out.print(atoI("-123") + "\n");
        System.out.print(atoI("0") + "\n");

    }

    public static int atoI(String str) {
        int result = 0;

        for(int i = str.length(); i > 0; i--) {
            int digit = charToInt(str.charAt(i-1));
            result += digit * Math.pow(10,str.length()-i);
        }

        if(str.charAt(0) == '-') {
            result = 0 - result;
        }

        return result;
    }



    public static int charToInt(char c) {
        if(c == '1') {
            return 1;
        }
        if(c == '2') {
            return 2;
        }
        if(c == '3') {
            return 3;
        }
        if(c == '4') {
            return 4;
        }
        if(c == '5') {
            return 5;
        }
        if(c == '6') {
            return 6;
        }
        if(c == '7') {
            return 7;
        }
        if(c == '8') {
            return 8;
        }
        if(c == '9') {
            return 9;
        }
        if(c == '0') {
            return 0;
        }

        return 0;

    }

}

