package com.company;

import com.sun.source.tree.BinaryTree;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node root = new Node("F");                          //  F
        Node n1 = root.left = new Node("B");             //  B     G
        Node n2 = root.right = new Node("G");           // A   D      I
                                                    //        C E    H
        Node n11 = n1.left = new Node("A");
        Node n12 = n1.right = new Node("D");

        Node n121 = n12.left = new Node("C");
        Node n122 = n12.right = new Node("E");

        Node n22 = n2.right = new Node("I");
        Node n221 = n22.left = new Node("H");

        System.out.print(shouldBeErased(n1)); //B true
        System.out.print(shouldBeErased(n2)); //G false
        System.out.print(shouldBeErased(n22) + "\n"); //I true

        preOrderPrintNode(root); //F -> B -> A -> D -> C -> E -> G -> I -> H
        System.out.print("\n");
        inOrderPrintNode(root); //A -> B -> C -> D -> E -> F -> G -> H -> I
        System.out.print("\n");
        postOrderPrintNode(root); //A -> C -> E -> D -> B -> H -> I -> G -> F
        System.out.print("\n");

        breadth(root); // F B G A D I C E H
    }

    public static boolean shouldBeErased(Node n) {
        if(n.value.equals("B") || n.value.equals("I")) {
            return true;
        }
        return false;
    }

    //Practice 1: Define a method print each node (DFS: pre-order)
    public static void preOrderPrintNode(Node n) {
        if(n != null) {
            System.out.print(n.value);
            preOrderPrintNode(n.left);
            preOrderPrintNode(n.right);
        }
    }
    //Practice 2: Define a method to print each node (DFS: in-order) -> go all the way in the left back up to the parent if null
    public static void inOrderPrintNode(Node n) {
        if(n != null) {
            inOrderPrintNode(n.left);
            System.out.print(n.value);
            inOrderPrintNode(n.right);
        }
    }
    //Practice 3: Define a method to print each node (DFS: post-order)
    public static void postOrderPrintNode(Node n) {
        if(n != null) {
            postOrderPrintNode(n.left);
            postOrderPrintNode(n.right);
            System.out.print(n.value);
        }
    }
    //Practice 3: Define a method to print each node (BFS: level-order) Using FIFO queue

    public static void breadth(Node root) {
        Queue<Node> queue = new LinkedList<>() ;
        if (root == null)
            return;
        queue.clear();
        queue.add(root);
        while(!queue.isEmpty()){
            Node node = queue.remove();
            System.out.print(node.value + " ");
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }

    }


    //Practice 3: Delete a node


    //depth of the tree

    //height of the tree


    //Practice 2: Define a method to print only the forest that shouldn't be erased
    //should return A D F H

    //Practice for the future: binary tree with integer values
        //insert a node into correct place
        //https://www.cs.cmu.edu/~adamchik/15-121/lectures/Trees/trees.html

        //searching a node

        //once you search a node -> delete

        //non-recursive tree traversal -> iterator method (using stack)
}
