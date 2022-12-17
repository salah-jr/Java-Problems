package com.salah;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {

        if(head == null){
            return null;
        }

        Set<ListNode> set = new HashSet<>();
        ListNode cur = head;
        set.add(cur);

        while(cur != null)
        {
            if(!set.add(cur.next)) return cur.next;
            cur = cur.next;
        }


        return null;
    }
}
