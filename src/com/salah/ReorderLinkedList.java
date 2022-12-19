package com.salah;

import java.util.Stack;

public class ReorderLinkedList {
    public void reorderList(ListNode head) {

        if(head == null || head.next == null)
        {
            return;
        }

        ListNode cur = head;
        int length = 0;
        Stack<ListNode> stack = new Stack<>();

        while(cur != null)
        {
            stack.push(cur);
            cur = cur.next;
            length++;
        }

        cur = head;
        for(int i = 0; i < length / 2; i++)
        {
            ListNode n = stack.pop();
            n.next = cur.next;
            cur.next = n;
            cur = n.next;
        }

        cur.next = null;
    }
}
