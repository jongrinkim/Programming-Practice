package com.company;

public class Main {

    public static void main(String[] args) {


        //Todo: do we need to specify null at the end?
        //1 -> 2 -> 3 -> 4 -> 5 -> 6->null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = null;

        System.out.print(kthtolast(head, 1)); // should print 4

    }

    //Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list
    public static int kthtolast(Node head, int k) {
        Node original = head;
        int length = 1;

        if(head == null) {
            return 0;
        }

        while(original.next != null) {
            length++;
            original = original.next;
        }

        //case1: k is larger than the length of the linked list
        if(length < k) {
            return -1;
        }

        int jthFromHead = length - k;

        //1 -> 2 -> 3 -> 4 -> 5 -> 6
        //case 2: k is smaller than the length of the linked list
        while(head.next != null) {
            jthFromHead--;
            if(jthFromHead <= 0) {
                return head.data;
            }
            head = head.next;
        }

        //shouldn't reach this point
        return -2;

    }
}
