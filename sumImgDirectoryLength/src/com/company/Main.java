package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String s =
                "dir1\n" +
                "  dir12\n" +
                "  dir13\n" +
                "    abc.txt\n" +
                "    pic.jpeg\n" +
                "  apple.png\n" +
                "dir2\n" +
                "  chair.img\n" + "dir3";

//        String test = "   hello";
//        System.out.println(spaceCount(test));

        System.out.print(sumImgDirectoryLength(s));
        //    /dir1/dir13  -> length = 11
        //    /dir1        -> length = 5
        //    /dir2        -> length = 5
        //          Therfore should return 11+5+5 = 21


    }


    //Given a directory system that is represented as text input such as this

//    dir1
//      dir12
//      dir13
//          abc.txt
//          pic.jpeg
//      apple.png
//    dir2
//      chair.img
//    dir3
    //return the combined length of all the path to image files (png, jpeg, img)


    //["dir1", "  dir12", "  dir13", "       abc.txt", "      pic.jpeg"...[
    

    public static int sumImgDirectoryLength (String str) {

        String[] s = str.split("\n");

        //null check
        if(s.length == 0) {
            return 0;
        }
        //# of space in front // length of the string so far
        Stack<int[]> stack = new Stack<>();
        int longestPathLength = 0;



        //push the first dir
        int[] a = new int[2];
        a[0] = spaceCount(s[0]);
        a[1] = s[0].length() + 1; // +1 is for the '/'
        stack.push(a);


        for(int i = 1; i< s.length; i++) {

            while (spaceCount(s[i]) < stack.peek()[0]) {
                stack.pop();
            }

            //If in the same directory
            if(spaceCount(s[i]) == stack.peek()[0]) {
                stack.pop();

                if(stack.empty()) {
                    int[] c = new int[2];
                    c[0] = spaceCount(s[0]);
                    c[1] = s[0].length() + 1; // +1 is for the '/'
                    stack.push(c);
                } else {
                    if(isImgFile(s[i])) {
                        if(stack.peek()[1] > longestPathLength) {
                            longestPathLength = stack.peek()[1];
                        }
                    }

                    int[] b = new int[2];
                    b[0] = spaceCount(s[i]);
                    int lengthWithoutBlank = s[i].trim().length();
                    b[1] = lengthWithoutBlank + stack.peek()[1] + 1; // + 1 is for the '/'

                    stack.push(b);
                }


            }

            //if it's subdirectory
            if(spaceCount(s[i]) > stack.peek()[0]) {
                if(isImgFile(s[i])) {
                    if(stack.peek()[1] > longestPathLength) {
                        longestPathLength = stack.peek()[1];
                    }
                }
                int[] b = new int[2];
                b[0] = spaceCount(s[i]);
                int lengthWithoutBlank = s[i].trim().length();
                b[1] = lengthWithoutBlank +  stack.peek()[1] + 1; // + 1 is for the '/'

                stack.push(b);
            }
        }

        return longestPathLength;
    }

    public static int spaceCount(String s) {
        int result = 0;

        if(!s.startsWith(" ")) {
            return 0;
        }

        if(s.startsWith(" ")) {
            result = 1 + spaceCount(s.substring(1));
        }
        return result;
    }

    public static  boolean isImgFile(String s) {
        return s.endsWith(".jpeg") || s.endsWith(".png") || s.endsWith(".gif");
    }


//    public static int sumImgDirectoryLength (String str) {
//        String[] s = str.split("\n");
//        int result = 0;
//
//        for(int i = 0; i<s.length; i++) {
//            if(isImgFile(s[i])) {
//                result += levelDeep(s[i]);
//            }
//        }
//
//        return result;
//    }
//
//    public static int levelDeep(String str) {
//        int result = 1;
//        int spacesCount = 0;
//
//        for(int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == ' ') {
//                spacesCount++;
//            } else {
//                break;
//            }
//        }
//
//        return result + spacesCount /2;
//    }
//
//    public static boolean isImgFile(String str) {
//
//        //Todo: Lower case the str for robustness
//        //Todo: use regular expression to remove spaces in the front
//        String r = str.trim();
//
//        return r.endsWith(".jpeg") || r.endsWith(".png") || r.endsWith(".img");
//    }

}
