package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	    int[] test1 = twoSum(new int[]{2,7,11,15}, 9);
        int[] test2 = twoSum(new int[]{2,7,11,15}, 18);
        for(int each: test2) {
            System.out.print(each + "\n");
        }

    }


//    Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//    You may assume that each input would have exactly one solution.

//    Given nums = [2, 7, 11, 15], target = 9,  [7, 2, -2, -6]
//
//    Because nums[0] + nums[1] = 2 + 7 = 9,
//            return [0, 1].
    public static int[] twoSum(int[] num, int target) {

        HashSet<Integer> subtracted_hs = new HashSet<>();
        HashSet<Integer> result_hs = new HashSet<>();

        for(int i = 0; i < num.length; i++) {
            subtracted_hs.add(target - num[i]);
        }

        for(int i = 0; i< num.length; i++) {
            if(subtracted_hs.contains(num[i])) {
                result_hs.add(i);
            }
        }

        int[] result_a = new int[result_hs.size()];
        int j = 0;

        for(int index : result_hs) {
            result_a[j] = index;
            j++;
        }

        return result_a;
    }
}
