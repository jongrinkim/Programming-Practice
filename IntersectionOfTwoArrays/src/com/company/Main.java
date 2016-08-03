package com.company;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

//    Given two arrays, write a function to compute their intersection.
//
//            Example:
//    Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> intersect = new HashSet<>();
        HashSet<Integer> set_num1 = new HashSet<>();

        for(int i = 0; i < nums1.length; i++) {
            set_num1.add(nums1[i]);
        }

        for(int i = 0; i< nums2.length; i++) {
            if(set_num1.contains(nums2[i])){
                intersect.add(nums2[i]);
            }
        }

        int[] result = new int[intersect.size()];

        int i = 0;
        for(int each : intersect) {
            result[i] = each;
            i++;
        }

        return result;



    }

    public static void main(String[] args) {
        int[] test1 = intersection(new int[] {1,2}, new int[]{1,2,2,3,4,5});
        for (int i = 0; i < test1.length; i++ ) {
            System.out.print(test1[i]);
        }
    }
}
