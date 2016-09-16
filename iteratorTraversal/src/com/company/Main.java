package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node root = new Node(8);                          //  8
        Node n1 = root.left = new Node(3);             //  3     10
        Node n2 = root.right = new Node(10);           // 1 5       15
        //      4 6     11
        Node n11 = n1.left = new Node(1);
        Node n12 = n1.right = new Node(5);

        Node n121 = n12.left = new Node(4);
        Node n122 = n12.right = new Node(6);

        Node n22 = n2.right = new Node(15);
        Node n221 = n22.left = new Node(11);

        
    }



           //  8
        //  3     10
        // 1 5       15
    //      4 6     11
}
