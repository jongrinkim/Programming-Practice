package com.company;

public class Main {

    public static void main(String[] args) {

        // same digits for both: when 1 is not carried over to the next
        Node head1 = new Node(7);
        head1.next = new Node(1);
        head1.next.next = new Node(6);

        Node head2 = new Node(5);
        head2.next = new Node(9);
        head2.next.next = new Node(2);
//        Node result1 = SumList(head1, head2);

        // same digits for both: when 1 is carried over to the next
        // 9 7 8 + 6 8 5 = 5 6 4 1
        Node head3 = new Node(9);
        head3.next = new Node(7);
        head3.next.next = new Node(8);

        Node head4 = new Node(6);
        head4.next = new Node(8);
        head4.next.next = new Node(5);
//        Node result2 = SumList(head3, head4);

        // different digits: when 1 is not carried over to the next
        // 1 2 3 + 4 1 9 5 6 = 5 3 2 6 6
        Node head5 = new Node(1);
        head5.next = new Node(2);
        head5.next.next = new Node(3);
        head5.next.next.next = null;

        Node head6 = new Node(4);
        head6.next = new Node(1);
        head6.next.next = new Node(9);
        head6.next.next.next = new Node(5);
        head6.next.next.next.next = new Node(6);
        head6.next.next.next.next.next = null;
        Node result3 = SumList(head5, head6);


//        while(result1!= null) {
//            System.out.print(result1.data + " ");
//            result1 = result1.next;
//        }
//        System.out.print( "\n");
//
//        while(result2!= null) {
//            System.out.print(result2.data + " ");
//            result2 = result2.next;
//        }
        while(result3!= null) {
            System.out.print(result3.data + " ");
            result3 = result3.next;
        }

    }
    //you have two numbers represented by a linked list, where each node contains a single digit.
    //The digits are stored in reverse order, such that the 1's digit is at the head of the list.
    // Write a function that adds the two numbers and returns the sum as a linked list.
    //Input (7 -> 1 -> 6) + (5 -> 9 -> 2) 617 + 295
    //out put = 2 1 9   = 912
    // 9 7 8 + 6 8 5
    public static Node SumList(Node head1, Node head2) {
        Node result = new Node(0);
        Node first = result;
        int sum = 0;

        while(head1!=null || head2 != null) {

            if(head1 == null && head2 != null) {
                sum = head2.data;
            } else if (head1 != null && head2 == null) {
                sum = head1.data;
            } else if (head1 != null && head2 != null){
                sum = (head1.data + head2.data);
            }

            int digit = sum % 10;

            result.data += digit;

            if(head1.next==null && head2.next==null && sum < 10) {

            } else {
                result.next = new Node(0);
                result = result.next;

                if(sum >= 10) {
                    result.data += 1;
                }

            }

            if(head1.next!=null && head2.next==null) {
                head1 = head1.next;
                head2 = null;
            } else if (head1.next==null && head2.next!=null) {
                head1 = null;
                head2 = head2.next;
            } else if (head1.next!=null && head2.next!=null){
                head1 = head1.next;
                head2 = head2.next;
            }


        }
        return first;
    }
}
