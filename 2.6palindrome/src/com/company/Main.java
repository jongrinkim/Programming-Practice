package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node head1 = new Node(0);
        head1.next = new Node(1);
        head1.next.next = new Node(2);
        head1.next.next.next = new Node(3);

        Node head2 = new Node(0);
        head2.next = new Node(8);
        head2.next.next = new Node(1);
        head2.next.next.next = new Node(8);
        head2.next.next.next.next = new Node(0);

        Node head3 = new Node(1);

        Node head4 = new Node(11);
        head4.next = new Node(10);

        Node head5 = null;

        //true case;
        System.out.print(isPalindrome(head2) + "\n"); //true
        //false case
        System.out.print(isPalindrome(head1) + "\n"); //false
        //One node: true case
        System.out.print(isPalindrome(head3) + "\n"); //true
        //Two nodes: false case
        System.out.print(isPalindrome(head4) + "\n"); //false
        //is null a palindrome? no-> return false
        System.out.print(isPalindrome(head5) + "\n"); //false


//        Node reverseHead = reverseLinkedList(head);
//
//        while(reverseHead!=null) {
//            System.out.print(reverseHead.val + "\n");
//            reverseHead = reverseHead.next;
//        }

    }

    //Todo: how to make a singly linked list to doubly?
    //Todo: How to reverse Linked List recursively not iteratively?

    static int totalCount = 1;

    public static boolean isPalindrome(Node head) {
//        Node first = head;

        if(head == null) {
            return false;
        }

        Node reverseHead = reverseLinkedList(head);
        int counter = 1;
        while(head!=null && counter < totalCount/2) {
            counter++;
            if(head.val != reverseHead.val) {
                return false;
            }
            head = head.next;
            reverseHead = reverseHead.next;
        }
        return true;
    }

    public static Node reverseLinkedList(Node head) {
        Node next = head.next;

        head.next = null;

        while(next!=null) {
            totalCount++;
            Node temp = next.next;
            next.next = head;

            head = next;
            next = temp;
        }

        return head;
    }
}
