package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node n = new Node(1);
        n.next = new Node(2);
        n.next.next = new Node(3);
        n.next.next.next = new Node(4);
        n.next.next.next.next = new Node(3);
        n.next.next.next.next.next = new Node(6);
        n.next.next.next.next.next.next = new Node(7);
        n.next.next.next.next.next.next.next = null;

        deleteNode(n, new Node(3));

        while(n != null) {
            System.out.print(n.data);
            n = n.next;
        }

    }


    //Todo: How to delete the first node of LinkedList

    //Todo: How to delete the last node of LinkedList

    //delete any node (but the first and last node, not necessarily the exact middle) of a singly linked list
    //
    public static Node deleteNode(Node head, Node d) {
        Node original = head;

        while(head.next!=null) {
            if(head.next.data == d.data) {
                Node temp = head.next.next;
                head.next.next = null;
                head.next = temp;


            }
            head = head.next;
        }

        return original;
    }
}
