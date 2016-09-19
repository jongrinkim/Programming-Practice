package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	    Node head = new Node(3);
        head.next = new Node(5);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next.next = null;

        removeDup(head);
//        while(head!=null) {
//            System.out.print(head.data + "\n");
//            head = head.next;
//        }
        while(head!=null) {
            System.out.print(head.data + "\n");
            head = head.next;
        }



    }

    //Write code to remove duplicates from an unsorted linked list
    public static void removeDup(Node head) {
        Node original = head;
        HashSet<Integer> hs = new HashSet<>();

        //base case: empty linked list
        if(original == null) {
            return;
        }

        while(original.next != null) {
            if(hs.contains(original.next.data)) {
                original.next = original.next.next;
            } else {
                hs.add(original.next.data);
            }
            original = original.next;
        }


//        return head;
    }


    //Follow UP
    //How would you solve this problem if a temporary buffer is not allowed?
}
