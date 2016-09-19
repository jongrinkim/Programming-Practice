package com.company;

public class Main {

    public static void main(String[] args) {

        int[][] a = new int[5][6];
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        a[0][3] = 4;
        a[0][4] = 5;

        a[1][0] = 6;
        a[1][1] = 7;
        a[1][2] = 8;
        a[1][3] = 9;
        a[1][4] = 1;


        System.out.print(a.length);
        System.out.print(a[0]);

    }


    //12345
    //67891
    //23456
    //78912
    //34567

    //a[0][0] -> a[0][length]
    //a[0][1] -> a[1][length]
    //a[0][2] -> a[2][length]

    //a.length = # of col
    //a[0].length = # of rows

    //Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
    // write a method to rotate the image by 90 degrees. can you do this in place?
    public static void rotateMatrix(int[][] a) {

        int[] temp = a[0];
        int col = 0;
        int row = 0;

        //moving left edge to the top edge
        for(int i = a.length; i >= 0; i--) {
            {
                a[0][col] = a[i][0];
                col++;
            }
        }
        //moving bottom edge to the left edge
        for(int j = a.length; j >= 0; j--) {
            {
                a[j][0] = a[a.length][j];
            }
        }

        //moving right edge to the bottom edge
        for(int k = a.length; k >= 0; k--) {
            {
                a[a.length][k] = a[row][a.length];
                row++;
            }
        }
        //moving top edge to the right edge
        for(int p = 0; p < a.length; p++) {
            {
                a[p][a.length] = temp[p];
            }
        }


        rotateMatrix(a[1:a.length-1][]);


}
