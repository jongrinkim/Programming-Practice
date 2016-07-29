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
        int[] test7 = new int[]{3,2,6,7,1,4};

//        System.out.print(stockProfit(test1));
//        System.out.print(stockProfit(test2));
//        System.out.print(stockProfit(test3));
//        System.out.print(stockProfit(test4));
//        System.out.print(stockProfit(test5));
//        System.out.print(stockProfit(test6));
        System.out.print(stockProfit(test7));

    }


    public static int stockProfit(int[] stockPrice) {
        int n = stockPrice.length;

        if(n == 0) {
            return 0;
        }

        int min = stockPrice[0];
        int max = stockPrice[0];
        int profit = max - min;

        for(int i = 1 ; i < n; i++) {
            //update min and max pointer if you run into a smaller element
            if(min > stockPrice[i]) {
                min = stockPrice[i];
                max = min;
            }
            //update profit and max pointer if you run into a bigger element
            else if(max < stockPrice[i] ) {
                //update profit if price - min is higher than profit we've seen so far
                if(stockPrice[i] - min > profit) {
                    profit = stockPrice[i] - min;
                }
                max = stockPrice[i];
            }
        }
        return profit;
    }
}
