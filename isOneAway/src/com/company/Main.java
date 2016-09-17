package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.print(isOneAway("pale", "ple")+"\n"); //true
        System.out.print(isOneAway("pales", "pale")+"\n"); //true
        System.out.print(isOneAway("pale", "bale")+"\n"); // true
        System.out.print(isOneAway("pale", "bake")+"\n"); //false
        System.out.print(isOneAway("pale", "pbale")+"\n"); //true
        System.out.print(isOneAway("pale", "helloda")+"\n"); //false
        System.out.print(isOneAway("", "a")+"\n"); //true
        System.out.print(isOneAway("0", "")+"\n"); //true
        System.out.print(isOneAway("0", "12")+"\n"); //false


    }

    ///pale, ple -> true
    ///pales, pale -> true
    ///pale, bale -> true
    ///pale, bake -> false
    //pale, pbale -> true

    public static boolean isOneAway(String str1, String str2) {
        int count = 0;

        int index1 = 0;
        int index2 = 0;

        int mismatch = 0;
        String shortStr = "";
        String longStr = "";
        if(str1.length()<str2.length()) {
            shortStr = str1;
            longStr = str2;
        }
        if(str1.length()>str2.length()) {
            longStr= str1;
            shortStr = str2;
        }


        //1. length is the same
        if(str1.length() == str2.length()) {
            for(int i = 0; i < str1.length(); i++) {
                if(str1.charAt(i) != str2.charAt(i)) {
                    count++;
                    if(count > 1) {
                        return false;
                    }
                }
            }
        } else

        //2. length is different in size of 1
        if(longStr.length() - shortStr.length() != 1) {  //shortstr = pale //longstr = baked
            return false;
        } else {
            while(index1 < shortStr.length() && index2 < longStr.length()) {
                if(shortStr.charAt(index1) == longStr.charAt(index2)) {
                    index1++;
                    index2++;
                } else {
                    mismatch++;
                    index2++;
                    if(mismatch>1) {
                        return false;
                    }
                }
            }

        }
    return true;
    }
}
