package com.salah;

import java.util.ArrayList;

class MyLinkedList {
    private ArrayList<ListNode> arr;

    public MyLinkedList() {
        arr = new ArrayList();
    }

    public int get(int index) {
        if(index >= arr.size()) return -1;
        ListNode n = arr.get(index);
        return n.val;
    }

    public void addAtHead(int val) {
        ListNode n = new ListNode(val);
        if(!arr.isEmpty())
        {
            n.next = arr.get(0);
        }

        arr.add(0, n);
    }

    public void addAtTail(int val) {
        ListNode n = new ListNode(val);

        if(!arr.isEmpty())
        {
            ListNode last = arr.get(arr.size() - 1);
            last.next = n;
        }

        arr.add(arr.size(), n);
    }

    public void addAtIndex(int index, int val) {
        ListNode n = new ListNode(val);
        if(index == 0)
        {
            addAtHead(val);
        }
        else if(index == arr.size())
        {
            addAtTail(val);
        }
        else if(index > arr.size())
        {
            return;
        }
        else
        {
            ListNode preIndex = arr.get(index - 1);
            ListNode atIndex = arr.get(index);
            n.next = atIndex;
            preIndex.next = n;
            arr.add(index, n);
        }
    }

    public void deleteAtIndex(int index) {
        if(index == 0) arr.remove(0);
        if(index < arr.size() && index > 0)
        {
            ListNode preIndex = arr.get(index - 1);
            ListNode atIndex = arr.get(index);
            preIndex.next = atIndex.next;
            arr.remove(index);
        }
    }
}
