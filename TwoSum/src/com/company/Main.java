package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	    int[] test1 = twoSum(new int[]{2,7,11,15}, 9);
        int[] test2 = twoSum(new int[]{2,7,11,15}, 18);
        int[] test3 = twoSum(new int[]{3,2,4}, 6);
        for(int each: test3) {
            System.out.print(each + "\n");
        }

    }


//    Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//    You may assume that each input would have exactly one solution.

//    Given nums = [2, 7, 11, 15], target = 9,  [7, 2, -2, -6]

//    Given nums = [3,2,4], target = 6   should return [1,2]
//
//    Because nums[0] + nums[1] = 2 + 7 = 9,
//            return [0, 1].
    public static int[] twoSum(int[] nums, int target) {

        HashSet<Integer> subtracted_hs = new HashSet<>();
        HashSet<Integer> result_hs = new HashSet<>();
        int halfValueCounter = 0;

        for(int i = 0; i < nums.length; i++) {
            subtracted_hs.add(target - nums[i]);

            if(nums[i] == target/2) {
                halfValueCounter++;
            }
        }

        for(int i = 0; i< nums.length; i++) {

            //case1: 2 of target/2 exist then add both of indexes
            if(halfValueCounter == 2) {
                if(nums[i] == target/2) {
                    result_hs.add(i);
                }
            }
            //case2: 0 or 1 target/2 exist then you only deal with others
            else if(subtracted_hs.contains(nums[i]) && nums[i] != target/2) {
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
