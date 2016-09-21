package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int x) { val = x;}
    }

    public class solution {
        ArrayList<String> a = new ArrayList<>();
        public List<String> binaryTreePaths(TreeNode root, int n) {

            if(root == null) {
                return null;
            }
            a.add(root.val + "->");

            if(root.left !=null && root.right==null) {
                binaryTreePaths(root.left, n);
            } else
            if(root.left==null && root.right!=null) {
                binaryTreePaths(root.right);
            } else
            if(root.left!=null && root.right!=null) {


                binaryTreePaths(root.left);
                a.add(s);
                binaryTreePaths(root.right, s);

            }





        }
    }
}
