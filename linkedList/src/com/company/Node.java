package com.company;

/**
 * Created by jongrinkim on 2016-09-19.
 */
public class Node {
    Node next = null;
    int data;

    public Node(int d) {
        data = d;
    }

    void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    Node deleteNode(Node head, int d) {
        //keep the head so you don't lose the information of the head
        Node n = head;

        //base case, if the first node is the one that needs to be deleted
        if(n.data == d) {
            return head.next; //moved head
        }

        while (n.next != null) {
            if(n.next.data == d) {
                n.next = n.next.next;
                return head; //head didn't change
            }
            //iterate through the rest of it in case you delete multiple nodes
            n = n.next;
        }
        return head;
    }

    //Todo : Runner technique
    // a1->a2->.. ->an -> b1 -> b2 -> b3 -> ... -> bn
    // turn that into
    // a1 -> b1 -> a2 -> b2 ... -> an -> bn
}
