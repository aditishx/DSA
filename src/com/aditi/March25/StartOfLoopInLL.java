package com.aditi.March25;

import com.aditi.March26.LengthOfLoopInALinkedList;

public class StartOfLoopInLL {
    static class ListNode {
        int val;
        StartOfLoopInLL.ListNode next;

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
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);

        // Creating loop: 5 -> 3
        head.next.next.next.next.next.next.next.next = head.next.next;

        int result = startOfLoop(head);

        System.out.println("Start Of Loop : " + result);
    }

    public static int startOfLoop(ListNode head) {

        if (head == null || head.next == null)
            return 0;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                int cnt = 1;
                slow = slow.next;

                while (slow != fast) {
                    slow = slow.next;
                    cnt++;
                }
                return cnt;
            }
        }
        return 0;

    }
}