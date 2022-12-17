package com.salah;

public class DeleteDuplicatesFromLinkedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }


        ListNode prev = head;
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null)
        {
            if(fast.val > slow.val)
            {
                prev = slow;
                slow = slow.next;
                fast = fast.next;
            } else
            {
                while(fast != null && fast.val == slow.val)
                {
                    fast = fast.next;
                }
                if(prev.val != slow.val) prev.next = fast;
                else{  // In this case the val of head is duplicates with fast and need to move the head forward
                    prev = fast;
                    head = prev;
                }
                slow = fast;
                if(fast != null) fast = fast.next;
            }
        }

        return head;
    }
}
