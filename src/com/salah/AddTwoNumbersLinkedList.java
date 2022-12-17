package com.salah;

public class AddTwoNumbersLinkedList{
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode cur = new ListNode();
            ListNode result = cur;
            int carry = 0;

            while(l1 != null && l2 != null){
                int n1 = l1.val;
                int n2 = l2.val;
                int sum = (n1 + n2 + carry) % 10;
                cur.val = sum;
                carry = (n1 + n2 + carry) >= 10 ? 1 : 0;
                if(l1.next != null && l2.next != null)
                {
                    cur.next = new ListNode();
                    cur = cur.next;
                }

                l1 = l1.next;
                l2 = l2.next;
            }

            if(l1 == null && l2 == null && carry ==  1){
                cur.next = new ListNode();
                cur.next.val = carry;
            }

            if(l2 == null && l1 != null)
            {
                fill(cur, l1, carry);
            }

            if(l1 == null && l2 != null)
            {
                fill(cur, l2, carry);
            }

            return result;
        }


        static void fill(ListNode cur, ListNode l, int carry)
        {
            cur.next = new ListNode();
            cur = cur.next;
            while(l != null)
            {
                int sum = (l.val + carry) % 10;
                cur.val = sum;
                carry = (l.val + carry) >= 10 ? 1 : 0;
                if(l.next != null)
                {
                    cur.next = new ListNode();
                    cur = cur.next;
                }
                l = l.next;
            }

            if(carry ==  1){
                cur.next = new ListNode();
                cur.next.val = carry;
            }
        }
}
