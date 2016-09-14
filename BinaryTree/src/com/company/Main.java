package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Node root = new Node(7);                          //  7
        Node n1 = root.left = new Node(3);             //  3     10
        Node n2 = root.right = new Node(10);           // 1 5       15
                                                   //      4 6     11
        Node n11 = n1.left = new Node(1);
        Node n12 = n1.right = new Node(5);

        Node n121 = n12.left = new Node(4);
        Node n122 = n12.right = new Node(6);

        Node n22 = n2.right = new Node(15);
        Node n221 = n22.left = new Node(11);

        System.out.print(nthSmallest(root, 4) + "\n");

    }


    static int count = 0;
    static int result = 0;
    public static int nthSmallest(Node root, int n) {

        if(root == null) {
            return 0;
        }
        if(root.left!=null) {
            nthSmallest(root.left, n);
        }

        count += 1; //1  2  3
        if(count == n) {//3 != 4  where n = 4
            result = root.value;
        }

        if(root.right!=null) {
            nthSmallest(root.right, n);
        }

        return result;
    }

    //Practice for the future: binary tree with integer values
    //insert a node into correct place
    //https://www.cs.cmu.edu/~adamchik/15-121/lectures/Trees/trees.html

    //searching a node

    //once you search a node -> delete the node

    //non-recursive tree traversal -> iterator method (using stack)

    //return nth smallest value in binary tree

    //return nth biggest value in binary tree
}
