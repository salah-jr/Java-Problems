package com.salah;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLonkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }

        if(headA == headB) return headA;

        Set<ListNode> set = new HashSet<>();

        set.add(headA);
        set.add(headB);

        while(headA != null && headB != null)
        {
            if(set.contains(headA.next)) return headA.next;
            else set.add(headA.next);

            if(set.contains(headB.next)) return headB.next;
            else set.add(headB.next);

            headA = headA.next;
            headB = headB.next;
        }

        if(headA == null && headB != null){
            while(headB != null){
                if(set.contains(headB.next)) return headB.next;
                else set.add(headB.next);
                headB = headB.next;
            }
        }

        if(headB == null && headA != null){
            while(headA != null){
                if(set.contains(headA.next)) return headA.next;
                else set.add(headA.next);
                headA = headA.next;
            }
        }

        if(headA == headB) return headA;

        return null;
    }
}
