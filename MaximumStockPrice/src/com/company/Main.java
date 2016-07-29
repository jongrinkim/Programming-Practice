package com.company;

import java.lang.reflect.Array;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] test1 = new int[]{3,2,6,7};
        int[] test2 = new int[]{2,3,4,5};
        int[] test3 = new int[]{5,4,3,2};
        int[] test4 = new int[]{5,4,3,2};
        int[] test5 = new int[]{5};
        int[] test6 = new int[]{};




        System.out.print(stockProfit(test1));
    }

    // 3 2 6 7
    public static int stockProfit(int[] stockPrice) {
        int n = stockPrice.length;

        if(n == 0) {
            return 0;
        }

        int min = stockPrice[0];
        int max = stockPrice[0];
        int profit = max - min;

        for(int i = 1 ; i < n; i++) {
            if(min > stockPrice[i]) {
                min = stockPrice[i]; //min = 2
                max = min;          //max = 2
            }

            else if(min < stockPrice[i] && max < stockPrice[i]) {
                profit = stockPrice[i] - min;  //profit = 4
                max = stockPrice[i];    //max = 6
            }
        }
        return profit;
    }
}
