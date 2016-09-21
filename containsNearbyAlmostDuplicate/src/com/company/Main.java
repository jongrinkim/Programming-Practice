package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] a = new int[]{1, 5, 9, 16, 19};
        System.out.print(containsNearbyAlmostDuplicate(a,4,2) + ""); //return false
        System.out.print(containsNearbyAlmostDuplicate(a,4,4) + ""); //return true
    }


  // given an array of integers, find out whether there are two distinct indices i and j in the array
    // such that the difference between nums[i] and nums[j] is at most t and the difference between i and j
    // is at most k

    //[ 1 2 3 5 7 9 7 8 9 10]  t= 3 , k = 2
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

        for(int i = 0; i< nums.length; i++) {

            int low = i;
            int high = k-i;

            while(high>low) {

                if(nums[high]-nums[low]<=t) {
                    return true;
                } else {
                    int mid = (high + low) /2;
                    high = mid;
                }
            }


        }
        return false;
    }
}
