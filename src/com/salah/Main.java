package com.salah;


public class Main {

    public static void main(String[] args) {

        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(2);
        System.out.println(obj.get(0));
//        obj.addAtTail(val);
        obj.addAtIndex(0,1);
        System.out.println(obj.get(1));

//        obj.deleteAtIndex(index);
    }

}