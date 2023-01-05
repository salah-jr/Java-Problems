package com.salah;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class NodePointer {
    public int val;
    public NodePointer left;
    public NodePointer right;
    public NodePointer next;

    public NodePointer() {}

    public NodePointer(int _val) {
        val = _val;
    }

    public NodePointer(int _val, NodePointer _left, NodePointer _right, NodePointer _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
