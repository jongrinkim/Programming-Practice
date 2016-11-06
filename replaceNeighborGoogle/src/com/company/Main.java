package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int X = 623315;

        System.out.println(solution(X));
    }

    public static int solution(int X) {
        String s = X + "";
        int maxSoFar = 0;

        for (int i = 0; i < s.length()-1; i++) {
            String previous = s.substring(0, i);
            String middle = s.substring(i, i + 2);
            //even
//            int avg = 0;
//            if((Integer.parseInt(middle)%10 +Integer.parseInt(middle)/10) % 2 == 0) {
//                avg = (int) Math.ceil((Integer.parseInt(middle)%10 +Integer.parseInt(middle)/10) / 2);
//            } else {
//                avg = (int) Math.ceil((Integer.parseInt(middle)%10 +Integer.parseInt(middle)/10) / 2) + 1;
//            }
            double avg = Math.ceil((Double.parseDouble(middle)%10 +Integer.parseInt(middle)/10) / 2);
            int realavg = (int) avg;

            String after = s.substring(i + 2, s.length());

            int modified = Integer.parseInt(previous + realavg + after);

            if (modified > maxSoFar) {
                maxSoFar = modified;
            }
        }
        return maxSoFar;
    }





//        // write your code in Java SE 8
//        String s = X + "";
//        char[] c = s.toCharArray();
//        double[] copy = new double[c.length];
//
//        if(c.length <=1) {
//            return X;
//        }
//
//        //12 -> 2
//        for(int i = 0; i<c.length; i++) {
//            copy[i] = Math.ceil(copy[i]+copy[i+1] / 2);
//
//        }
//    }
}
