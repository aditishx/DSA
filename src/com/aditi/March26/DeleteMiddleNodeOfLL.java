package com.aditi.March26;

import com.aditi.March25.LoopInLinkedList;

public class DeleteMiddleNodeOfLL {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {

        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = deleteMiddle(head);

        printList(head);
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static ListNode deleteMiddle(ListNode head) {

//        if (head == null || head.next == null)
//            return null;
//
//        ListNode temp = head;
//        int count = 0;
//
//
//        while (temp != null) {
//            count++;
//            temp = temp.next;
//        }
//        int mid = count / 2;
//
//        temp = head;
//
//        for (int i = 0; i < mid - 1; i++) {
//            temp = temp.next;
//        }
//
//        temp.next = temp.next.next;
//        return head;

        ListNode slow = head;
        ListNode fast = head;
        if(head == null || head.next == null)
            return null;

        fast = fast.next.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
