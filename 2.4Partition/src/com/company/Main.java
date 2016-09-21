package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Node head = new Node(3);
        head.next = new Node(5);
        head.next.next = new Node(8);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next = new Node(1);
        head.next.next.next.next.next.next.next = null;

        partition(head, 5); // should return 3 2 1 5 8 5 10

//        while(head!=null) {
//            System.out.print(p.data);
//            head = head.next;
//        }
    }

    //Write code to partition a linked list around a value x, such that all nodes less than x come
    // before all nodes greater than or equal to x.
    //If x is contained within the list, the values of x only need to be after the elements less than x.
    // The partition element x can appear anywhere in the "right partition";
    //it does not need to appear between the left and right partitions

    //3 5 8 5 10 2 1 ; partition  =5
    //3 1 2 10 5 5 8

    public static Node partition(Node head, int partition) {
        Node leftStart = null;
        Node leftEnd = null;
        Node rightStart = null;
        Node rightEnd = null;

        while(head!=null) {

            if(head.data < partition) {
                if(leftStart == null) {
                    leftStart = head;
                    leftEnd = leftStart;
                } else {
                    leftEnd.next = head;
                    leftEnd = leftEnd.next;
                }

            } else { //head.data >= partition
                if(rightStart == null) {
                    rightStart = head;
                    rightEnd = rightStart;
                } else {
                    rightEnd.next = head;
                    rightEnd = rightEnd.next;
                }
            }
            head = head.next;
        }

        leftEnd.next = rightStart;
        rightEnd.next = null;

        Node result = leftStart;

        while(leftStart!=null) {
            System.out.print(leftStart.data + " ");
            leftStart = leftStart.next;
        }

        return result;


    }
}
