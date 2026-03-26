package com.aditi.March25;

import java.util.HashSet;
import java.util.List;

public class LoopInLinkedList {
        static class ListNode {
            int val;
            LoopInLinkedList.ListNode next;

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

            // Creating loop: 5 -> 3
            head.next.next.next.next.next = head.next.next;

            boolean result = hasCycle(head);

            System.out.println("Loop detected: " + result);
        }

//        public static boolean hasCycle(ListNode head) {
//            HashSet<ListNode> set = new HashSet<>();
//            ListNode temp = head;
//            while (temp != null) {
//                if (set.contains(temp)) {
//                    return true;
//                }
//                set.add(temp);
//                temp = temp.next;
//            }
//            return false;
//        }

        public static boolean hasCycle(ListNode head) {

            if (head == null || head.next == null)
                return false;

            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }
}
