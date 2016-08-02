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
        int nums1Length = nums1.length;
        int nums2Length = nums2.length;

        int[] longerArray;
        int[] shorterArray;

        HashSet<Integer> result_hs = new HashSet<>();
        HashSet<Integer> hs = new HashSet<Integer>();


        if(nums1Length > nums2Length) {
            longerArray = nums1;
            shorterArray = nums2;
        } else {
            longerArray = nums2;
            shorterArray = nums1;
        }

        if(nums1Length == 0 || nums2Length == 0) {
            return new int[0];
        }

        for(int i = 0; i < shorterArray.length; i++) {
            hs.add(shorterArray[i]);
        }

        for(int i = 0; i< longerArray.length; i++) {
            if(hs.contains(longerArray[i])){
                result_hs.add(longerArray[i]);
            }
        }

        int[] result = new int[result_hs.size()];

        int i = 0;
        for(int intersect : result_hs) {
            result[i] = intersect;
            i++;
        }

        return result;



    }

    public static void main(String[] args) {
        int[] test1 = intersection(new int[] {6}, new int[]{1,2,2,3,4,5});
        for (int i = 0; i < test1.length; i++ ) {
            System.out.print(test1[i]);
        }
    }
}
