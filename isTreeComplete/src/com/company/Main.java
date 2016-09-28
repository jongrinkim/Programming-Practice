package com.company;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.jar.Pack200;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node root = new Node(3);
        root.left = new Node(2);
        root.right = new Node(5);

        root.left.left = new Node(9);
//        root.left.right.left = new Node(5);
//        root.left.right.left = new Node(10);

        System.out.print(isTreeComplete(root) + "\n");


        //true
        //     3
        //   2   5
        //  6 9


        //false
        //     3
        //   2   5
        //  6 9   1

        //false
        //     3
        //   2   5
        //    9
        //   5 10

        //true
        //     3
        //   2   5
        //  9

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
    static int count = 0;
    static Queue<Node> q = new LinkedList<Node>();
    static Queue<Integer> i = new LinkedList<Integer>();


    //     3
    //   2   5
    //  6 9   1

    //q -> [node(5)
    //i -> [3
    //count 0 -> 1 -> 2
    //tmp_q = node(3) -> node(2)
    //tmp_i = 1 -> 2

    //check if a tree is complete
    public static boolean isTreeComplete (Node root) {
        if(root== null) {
            return false;
        }
        if(count == 0) {
            q.add(root);
            i.add(1);
        }
        while(!q.isEmpty()) {
            count++; // count = 1
            Node tmp_q = q.remove();
            int tmp_i = i.remove();// i = 1 , 2 , 3
            if(count!=tmp_i) {
                return false;
            }
            if(tmp_q.left != null) {
                q.add(tmp_q.left);
                i.add(tmp_i*2);
            }
            if(tmp_q.right!=null) {
                q.add(tmp_q.right);
                i.add(tmp_i*2+1);
            }
        }
        return true;
    }



}
