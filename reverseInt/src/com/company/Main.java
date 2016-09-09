package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print(reverseInt(123));
        System.out.print(reverseInt(-123));

    }
    public static int reverseInt(int x) {
        char[] ch;
        if(x>=0) {
            ch = (x+"").toCharArray();
        } else {
            ch = ((0-x)+"").toCharArray();
        }
        for(int i= 0; i< ch.length /2; i++) {
            char temp = ch[i];
            ch[i] = ch[ch.length-i-1];
            ch[ch.length-i-1] = temp;
        }

        int result = Integer.parseInt(new String(ch));

        if(x >=0) {
            return result;
        } else {
            return 0 - result;
        }
    }
}
