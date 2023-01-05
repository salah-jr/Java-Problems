package com.salah;
class Node {
    int val;
    int min;
    NodePointer next;
    Node() {}
    Node(int val, int min, NodePointer next) { this.val = val; this.min = min; this.next = next;}
}

public class DesignStackAndMinStack {
    private NodePointer head;

    public void push(int val) {
        if(head == null) head = new NodePointer(val, val, null);
        else head = new NodePointer(val, Math.min(val, head.min), head);
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }
}
