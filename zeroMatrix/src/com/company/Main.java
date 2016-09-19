package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //when you initialize a boolean array, do they start as False? it initializes as false;
        int[][] a = new int[2][5];
        a[0][0] = 1;
        a[0][1] = 1;
        a[0][2] = 3;
        a[0][3] = 4;
        a[0][4] = 5;

        a[1][0] = 6;
        a[1][1] = 4;
        a[1][2] = 2;
        a[1][3] = 1;
        a[1][4] = 0;

        zeroMatrix(a);

        for(int i = 0; i< a.length; i++) {
            for(int j = 0; j< a[0].length; j++) {
                System.out.print(a[i][j] + " "); //should print 1 1 3 4 0  \n   0 0 0 0 0
            }
            System.out.print("\n");

        }

    }

    //1.8 Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0,
    // its entire row and column are set to 0

    // 1 0 3 4 5
    // 6 7 0 1 2
    //2
    //5

    //isRowZero[0] = true;
    //isColZero[1] = true;

    //isRowZero[1] = true;
    //isColZero[2] = true;
    public static int[][] zeroMatrix(int[][] a) {

        boolean[] isRowZero = new boolean[a.length];
        boolean[] isColZero = new boolean[a[0].length];

        for(int i = 0; i< a.length; i++) {
            for(int j = 0; j < a[0].length; j++) {
                if(a[i][j] == 0) {
                    isRowZero[i] = true;
                    isColZero[j] = true;
                }
            }
        }

        for(int i = 0; i < isRowZero.length; i++) {
            if(isRowZero[i]) {
                for(int j = 0; j < a[0].length; j++) {
                    a[i][j] = 0;
                }
            }
        }

        for(int j = 0; j < isColZero.length; j++) {
            if(isColZero[j]) {
                for(int i = 0; i < a.length; i++) {
                    a[i][j] = 0;
                }
            }
        }

        return a;

    }

}
