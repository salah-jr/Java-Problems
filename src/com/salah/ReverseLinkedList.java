package com.salah;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode p1 = head;
        ListNode p2 = p1.next;
        ListNode p3 = p2.next;

        // Making first node last node
        head.next = null;

        while(p3 != null){
            p2.next = p1;
            p1 = p2;
            p2 = p3;
            p3 = p3.next;
        }

        // Making the first node in the reversed list points to the second node.
        p2.next = p1;

        return p2;
    }
}
