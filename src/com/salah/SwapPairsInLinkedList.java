package com.salah;

public class SwapPairsInLinkedList {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode slow = head;
        ListNode fast = slow.next;
        ListNode prev = null;

        head = head.next;

        while (fast != null) {
            slow.next = fast.next;
            fast.next = slow;
            if (prev != null) prev.next = fast;
            if (slow.next == null) break;
            prev = slow;
            slow = slow.next;
            fast = slow.next;
        }

        return head;
    }
}
