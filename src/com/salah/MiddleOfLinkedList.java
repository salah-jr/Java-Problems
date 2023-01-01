package com.salah;

public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        int countNodes = 1;
        int middle = -1;
        ListNode cur = head;
        while(cur != null)
        {
            cur = cur.next;
            countNodes++;
        }


        if(countNodes % 2 != 0) middle = countNodes / 2 + 1;
        else middle = countNodes / 2;

        int i = 1;
        while(i < middle)
        {
            head = head.next;
            i++;
        }

        return head;
    }
}
