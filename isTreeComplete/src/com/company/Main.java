package com.company;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node root = new Node(3);
        root.left = new Node(2);
        root.right = new Node(5);

//        root.right.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(9);

        //true
        //     3
        //   2   5
        //  6 9   1

        //     1
        //   2   3
        //  4 5   7

        // 1 <- [2 3]
        // 2 <- [3 4 5]
        // 3 <- [4 5 7]
        // 4 <- [5 7]
        // 5 <- [7]
        // 7 but 7 is not a consecutive number

        // 3 has two children
        // 2 -> case 3 -> return false immediately
        // 5

        //case 1 : has two child nodes
        //case 2: has only left child
        //case 3: has only right child
    }

    //check if a tree is complete

    int count = 1;
    Queue<Node> q = new LinkedList<Node>();
    q.

    public static boolean isTreeComplete (Node root) {
        if(root == null) {
            return false;
        }

        if(root.left != null && root.right != null) {

        }
    }
}
