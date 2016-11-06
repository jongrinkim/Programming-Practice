package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(replaceNeighbor(1243));

    }


    //Question: how to find the digit number in integer?
    //Question: how to replace a single digit with a neighboring digit?



    //Replace a single digit with its neighboring digit
    //Return the largest number after replacement
    //1243 -> return 1233
    //213 -> return 211
    public static int replaceNeighbor(int n) {
        String s = n + "";
        int result = 0;
        char[] original = s.toCharArray();
        char[] copied = s.toCharArray();

        //check the digit number
        if(s.length() < 2) {
            return n;
        }

        //checkt first
        if(s.charAt(0) > s.charAt(1)) {

            copied[0] = copied[1];
            int replaced = cArraytoInt(copied);

            if(replaced > result) {
                result = replaced;
            }
            copied = original;
        }

        //check last
        if(s.charAt(s.length()-1) > s.charAt(s.length()-2)) {
            copied[s.length()-1] = copied[s.length()-2];
            int replaced = cArraytoInt(copied);

            if(replaced > result) {
                result = replaced;
            }
            copied = original;
        }

        //check middle
        for(int i = 1; i < original.length-1; i++) {



            //bigger than left
            if(s.charAt(i) > s.charAt(i-1) && s.charAt(i) <= s.charAt(i+1)) {

                copied[i] = copied[i-1];
                int replaced =  cArraytoInt(copied);

                if(replaced > result) {
                    result = replaced;
                }
                copied = original;

            }
            //bigger than right
            // 7  6  5
            if(s.charAt(i) > s.charAt(i+1) && s.charAt(i) <= s.charAt(i-1)) {
                copied[i] = copied[i+1];
                int replaced =  cArraytoInt(copied);

                if(replaced > result) {
                    result = replaced;
                }
                copied = original;
            }


            // 1243 -> 1233
            //bigger than both
            if(s.charAt(i) > s.charAt(i-1) && s.charAt(i) > s.charAt(i+1)) {
                copied[i] = copied[i+1];
                int replaced =  cArraytoInt(copied);

                if(replaced > result) {
                    result = replaced;
                }
                copied = original;
            }

        }

        return result;
    }

    //1234
    public static int cArraytoInt(char[] c) {
        int result = 0;

        for(int i = 0; i < c.length; i++) {
            int val = c[i] -'0';
            result += val * Math.pow(10,c.length-1-i);
        }

        return result;
    }
}
