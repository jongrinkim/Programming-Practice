package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //1, 3, 4   // 2, 4, 6, 8
        //1 2 3 4 4 6 8
        int[] A = new int[3];
        int[] B = new int[7];
        A[0] = 1;
        A[1] = 3;
        A[2] = 4;

        B[0] = 2;
        B[1] = 4;
        B[2] = 6;
        B[3] = 8;

//        System.out.println(Arrays.toString(B));

        System.out.println(Arrays.toString(combineTwoSortedArrays(A,B))); // should give you 1 2 3 4 6

    }

    public static int[] combineTwoSortedArrays(int[] A, int[] B) {

        int[] result = new int[B.length];
        int pointer1 = 0;
        int pointer2 = 0;
        int pointer3 = 0;

        while(pointer1 < A.length) {
            if(A[pointer1] > B[pointer2]) {
                result[pointer3] = B[pointer2];
                pointer2++;
                pointer3++;
            } else if (A[pointer1] < B[pointer2]) {
                result[pointer3] = A[pointer1];
                pointer1++; //1
                pointer3++; //1
            } else if(A[pointer1] == B[pointer2]) {
                result[pointer3] = A[pointer1];
                result[pointer3+1] = B[pointer2];
                pointer1++;
                pointer2++;
                pointer3 += 2;
            }
        }

        while(pointer3 < B.length) {
            result[pointer3] = B[pointer2];
            pointer3++;
            pointer2++;
        }

        return result;

    }

}
