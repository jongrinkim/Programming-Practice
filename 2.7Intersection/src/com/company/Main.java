package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Node head = new Node(3);
        Node head2 = head.next = new Node(2);
        Node head3 = head2.next = new Node(1);
        Node head4 = head3.next = new Node(5);
        Node head5 = head4.next = new Node(8);

        Node list2 = new Node(3);
        list2.next = new Node(2);
        list2.next.next = head;
//        list2.next.next = new Node(10);
//        list2.next.next.next = new Node(15);
//        list2.next.next.next.next = head3;


        Node n = intersect(head, list2);

        System.out.print(n.val + "\n");

    }
    //Given two (singly) linked lists, determine if the two lists intersect.
    // Return the intersecting node. Note that the intersection is defined based on the reference, not value.
    //That is, if the kth node of the first linked list is the exact same node (by reference) as
    // jth node of the second linked list, then they are intersecting
    public static Node intersect(Node head1, Node head2) {
        if(head1==null || head2== null) {
            //no interseciton
            return null;
        }

        Node original1 = head1;
        Node original2 = head2;
        int count1 = 1;
        int count2 = 1;

        while(original1.next!= null) {
            count1++;
            original1 = original1.next;
        }

        while(original2.next!= null) {
            count2++;
            original2 = original2.next;
        }

        if(original1!=original2) {
            //different ending node means not intersecting
            return null;
        }


        //If two linked list have the same length;
        if(count1 == count2) {
            while(head1!=head2) {
                head1 = head1.next;
                head2 = head2.next;
            }

            return head1;
        }

        //If two linked list have the different length;
        if(count1 != count2) {
            Node shorter = count1 < count2 ? head1 : head2;
            Node longer = count1 < count2 ? head2 : head1;


            Node skippedNode = skipNode(longer, count2-count1);

            while(skippedNode != shorter) {
                skippedNode = skippedNode.next;
                shorter = shorter.next;
            }

            return skippedNode;
        }


        //Shouldn't reach this point
        return null;

    }

    public static Node skipNode(Node head, int n) {
        while(n > 0 && head.next!=null) {
            head = head.next;
            n--;
        }

        return head;
    }
}
