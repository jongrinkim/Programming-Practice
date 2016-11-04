package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(8);
        l1.next.next.next = null;

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next =  new ListNode(4);
        l2.next.next.next = null;

        ListNode test = addTwoNumbers(l1, l2);

        while(test!=null) {
            System.out.println(test.val);
            test = test.next;
        }

    }

    public static class ListNode {
            int val;
             ListNode next;
             ListNode(int x) { val = x; }
         }

        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            ListNode result = new ListNode(0);
            ListNode head = result;
            int carry = 0;

            while(l1 !=null || l2 !=null || carry == 1) {
                int sum;
                if(l1 == null && l2 != null) {
                    sum = l2.val + carry;
                } else if(l1 != null && l2 == null) {
                    sum = l1.val + carry;
                } else if (l1 == null && l2 == null){
                    sum = carry;
                } else  {
                    sum = l1.val + l2.val + carry;
                }

                int singleDigit = sum % 10;
                carry = sum / 10;
                if(l1!=null) {
                    l1 = l1.next;
                }
                if(l2!=null) {
                    l2 = l2.next;
                }
                
                result = result.next = new ListNode(singleDigit);

            }
            return head.next;
        }

}
