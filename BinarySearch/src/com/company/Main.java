package com.company;

public class Main {


    //return true if target is found in nums1 (assume nums1 is sorted)
    //[1,2,4,5,7]  , 3
    public static boolean binarySearch(int[] nums1, int target) {
        int low = 0;
        int high = nums1.length-1;

        while(low <= high) {

            int mid = low + (high - low) /2 ;

            if(nums1[mid] == target) {
                return true;

            } else if(nums1[mid] < target) {
                low = mid + 1;

            } else if(nums1[mid] > target) {
                high = mid - 1;
            }

        }
        //if you get to this point, that means you couldn't find it
        return false;

    }

    public static void main(String[] args) {
	    System.out.print(binarySearch(new int[]{1,2,4,5,7}, 3) + "\n");
        System.out.print(binarySearch(new int[]{1,2,3,4,5,7}, 3) + "\n");
        System.out.print(binarySearch(new int[]{1}, 3) + "\n");
        System.out.print(binarySearch(new int[]{3}, 3) + "\n");
        System.out.print(binarySearch(new int[]{}, 3) + "\n");
    }
}
