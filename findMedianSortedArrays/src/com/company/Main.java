package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //create a new array size m + n
        //insert all of them
        //sort it -> log (m+n)
        //if length is odd, divid by 2 and return the value at that index
        //if length is even, divide by 2 and find avg of that index value and index-1 value
        int m = nums1.length;
        int n = nums2.length;

        ArrayList<Integer> combined = new ArrayList<>();
        for(int i = 0; i < m ; i++) {
            combined.add(nums1[i]);
        }
        for(int j = 0; j < n ; j++) {
            combined.add(nums2[j]);
        }

        ArrayList.sort(combined);


    }
}
