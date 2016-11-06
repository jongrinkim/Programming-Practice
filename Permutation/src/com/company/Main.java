package com.company;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Set<String> test = permutation("abc");
//        for (String s: test) {
//            System.out.print(s + "\n");
//        }

        String[] test = new String[3];
        test[0] = "bac";
        test[1] = "aaa";
        test[2] = "caba";


//        for(String s : test) {
//            System.out.println(getRank(s));
//            count = 0;
//            result = 0;
//            firstTime = true;
//        }

        Set<String> setString = permutation("bac");

        for (String s : setString) {
            System.out.println(s);
        }


    }

    //"abc" -> ["abc", "acb", "bac" "bca" "cab" "cba"]
    public static Set<String> permutation(String str) {
        return permutation("", str);
    }

    static LinkedHashSet<String> hs = new LinkedHashSet<>();

    public static Set<String> permutation(String prefix, String str) {
        int n = str.length();
        if(n == 0) {
            hs.add(prefix);
        } else {
            for(int i = 0; i<n; i++) {
                permutation(prefix+str.charAt(i), str.substring(0,i)+str.substring(i+1,n));
            }
        }
        return hs;
    }

    static int getRank(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        int count = 0;
        int rank = permutation("", sorted, word);

        return rank;
    }

    static int count = 0;
    static int result =0;
    static boolean firstTime = true;

    static int permutation(String prefix, String str, String original) {
//        int result = 0;

        int n = str.length();
        if(n==0) {
            if(prefix.equals(original) && firstTime) {
                result = count;
                firstTime = false;
            }
            count++;
        } else {
            for (int i =0; i<n; i++) {
                permutation(prefix + str.charAt(i),str.substring(0,i) + str.substring(i+1,n), original);
            }
        }
        return result;
    }
}





///*
// * Complete the function below.
// */
//
//    static int[] get_ranks(String[] words) {
//        int[] result = new int[words.length];
//
//        for(int i = 0; i < words.length; i++) {
//
//
//            result[i] = getRank(words[i]);
//        }
//        //result[0] = getRank(words[0]);
//
//        return result;
//
//    }
//
//    static int getRank(String word) {
//        char[] chars = word.toCharArray();
//        Arrays.sort(chars);
//        String sorted = new String(chars);
//        int count = 0;
//        int rank = permutation("", sorted, word);
//
//        return rank;
//    }
//
//    static int count = 0;
//    static int result =0;
//
//    static int permutation(String prefix, String str, String original) {
//        int n = str.length();
//
//
//        if(n==0) {
//
//            if(prefix.equals(original)) {
//                result = count;
//            }
//            count++;
//        } else {
//            for (int i =0; i<n; i++) {
//                permutation(prefix + str.charAt(i),str.substring(0,i) + str.substring(i+1,n), original);
//            }
//        }
//
//        return result;
//    }
//

