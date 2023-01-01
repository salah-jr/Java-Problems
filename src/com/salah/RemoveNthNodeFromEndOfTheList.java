package com.salah;

public class RemoveNthNodeFromEndOfTheList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int countNodes = 1;
        ListNode cur = head;
        ListNode prev = cur;
        while(cur != null)
        {
            cur = cur.next;
            countNodes++;
        }

        if(n == countNodes - 1)
        {
            return head.next;
        }

        int nodeNum = countNodes - n;
        cur = head;
        prev = cur;
        int i = 1;
        while(cur.next != null && i < nodeNum)
        {
            if(i + 1 == nodeNum){
                cur.next = cur.next.next;
                break;
            }

            cur = cur.next;
            i++;
        }

        return head;
    }
}
