package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Node head = new Node(3);
        Node head2 = head.next = new Node(2);
        Node head3 = head.next.next = new Node(1);
        Node head4 = head.next.next.next = new Node(5);
        Node head5 = head.next.next.next.next = new Node(7);
        Node head6 = head.next.next.next.next.next = head;

        Node n = firstInLoop(head);

        System.out.print(n.val + "\n");

    }


    public static Node firstInLoop(Node head) {
        HashSet<Node> hs = new HashSet<>();

        while(head != null) {
            if(hs.contains(head)) {
                return head;
            } else {
                hs.add(head);
            }
            head = head.next;
        }

        //if reached here, means not circular
        return head;
    }

}
