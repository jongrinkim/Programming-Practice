package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char[] c = new char[13];
        c[0] = 'M';
        c[1] = 'r';
        c[2] = ' ';
        c[3] = 'J';
        c[4] = 'o';
        c[5] = 'h';
        c[6] = 'n';
        c[7] = ' ';
        c[8] = 'S';
        c[9] = 'm';
        c[10] = 'i';
        c[11] = 't';
        c[12] = 'h';

        char[] result = urlfy(c, 13);
        System.out.print(result.length + "\n");
        for(char ch : result) {
            System.out.print(ch);
        }
        //Todo: implement using StringBuilder

    }

    //"MR " -> "Mr%20"
    //if implementing in Java, please use a character array so that you can perform this operation in place
    //Input :  "Mr John Smith    ", 13
    //Output:  "Mr%20John%20Smith"
    public static char[] urlfy(char[] ch, int oldLength) {
        int count = 0;
        for(int i = 0; i<oldLength; i++) {
            if(ch[i]==' ') {
                count+=1;
            }
        }

        int newLength = oldLength + (count*3);
        char[] c_a = new char[newLength];
//        ch[newLength] = '\0';
        for(int i = oldLength-1; i>=0; i--) {
            if(ch[i] == ' ') {
                c_a[newLength-1] = '0';
                c_a[newLength-2] = '2';
                c_a[newLength-3] = '%';
                newLength = newLength - 3;
            } else {
                c_a[newLength-1] = ch[i];
                newLength = newLength - 1;
            }

        }

        return c_a;
    }
}
