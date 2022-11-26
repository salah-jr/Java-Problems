package com.salah;

public class LinkedListRemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val) head=head.next;

        if(head == null){
            return head;
        }

        ListNode currentNode = head;

        while(currentNode.next != null){

            if(currentNode.next.val == val){
                currentNode.next = currentNode.next.next;
                continue;
            }

            currentNode = currentNode.next;

        }

        return head;
    }
}
