package com.company;

import java.util.ArrayList;

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

        System.out.print("nthsmallest: " + nthSmallest(root, 4) + "\n"); //should return 5
        System.out.print("nthBiggest: " + nthBiggest(root, 3) + "\n"); //should return 10

        insertNode(root, new Node(2));
        //inorder traversal of the tree to confirm that the node is inserted
        inOrderTraversal(root);

        System.out.print(searchNode(root, new Node(6)) +"\n"); //True
        System.out.print(searchNode(root, new Node(14)) + "\n"); //false

    }


    static int count1 = 0;
    static int result1 = 0;
    public static int nthSmallest(Node root, int n) {

        if(root == null) {
            return 0;
        }
        if(root.left!=null) {
            nthSmallest(root.left, n);
        }

        count1 += 1; //1  2  3
        if(count1 == n) {//3 != 4  where n = 4
            result1 = root.value;
        }

        if(root.right!=null) {
            nthSmallest(root.right, n);
        }

        return result1;
    }

    static int count2 = 0;
    static int result2 = 0;
    public static int nthBiggest(Node root, int n) {

        if(root == null) {
            return 0;
        }
        if(root.right!=null) {
            nthBiggest(root.right, n);
        }
        count2 += 1;
        if(count2 == n) {
            result2 = root.value;
        }

        if(root.left!=null) {
            nthBiggest(root.left, n);
        }

        return result2;
    }


    //Practice for the future: binary tree with integer values
    //insert a node into correct place in the tree
    //https://www.cs.cmu.edu/~adamchik/15-121/lectures/Trees/trees.html
    //8, 7
    public static void insertNode(Node root, Node n) {
        if(root == null) {
            return;
        }
        if(root.value > n.value && root.left!=null) {
            insertNode(root.left, n);
        }
        if(root.value > n.value && root.left==null) {
            root.left = n;
        }


        if(root.value < n.value && root.right!=null) {
            insertNode(root.right, n);
        }
        if(root.value < n.value && root.right==null) {
            root.right = n;
        }
    }

    public static void inOrderTraversal(Node root) {
        if(root == null) {
            return;
        }
        if(root.left!=null) {
            inOrderTraversal(root.left);
        }
        System.out.print(root.value + "\n");
        if(root.right!=null) {
            inOrderTraversal(root.right);
        }
    }

    //delete a node
    //think of different cases:
    //1. the n is not in the tree
    //2. the n is the leaf node
    //3. the n has one child
    //4. the n has two children
    //Todo: Delete not done yet
    public static void deleteNode(Node root, Node n) {
        if(root == null) {
            return;
        }
        if(root == n) {
            if(root.left==null && root.right == null) {
                root = null;
            }
            if(root.left!=null && root.right==null) {
                root = root.left;
                root.left = null;
            }
            if(root.left==null && root.right!=null) {
                root = root.right;
                root.right = null;
            }
            if(root.left!=null && root.right!=null) {
                root = maxValue(root.left);

            }
        }
    }
    public static Node maxValue(Node root) {
        if(root == null) {
            return null;
        }
        else {
            maxValue(root.right);
        }

        return root;
    }

    static boolean doesNodeExist = false;
    public static boolean searchNode(Node root, Node n) {
        if(root == null) {
            doesNodeExist = false;
        } else
        if(root.value == n.value) {
            doesNodeExist = true;
        } else
        if(root.value < n.value) {
            searchNode(root.right, n);
        } else
        if(root.value > n.value) {
            searchNode(root.left, n);
        }
        return doesNodeExist;
    }

           //  8
        //  3     10
        // 1 5       15
    //      4 6     11

    //non-recursive tree traversal -> iterator method (using stack)
}
