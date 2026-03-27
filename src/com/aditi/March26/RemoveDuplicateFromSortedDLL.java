package com.aditi.March26;

public class RemoveDuplicateFromSortedDLL {
    static class ListNode {
        int val;
        ListNode prev, next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {

        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.prev = head;

        head.next.next = new ListNode(2);
        head.next.next.prev = head.next;

        head.next.next.next = new ListNode(3);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.prev = head.next.next.next;

        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.prev = head.next.next.next.next;

        head = removeDuplicate(head);

        printList(head);
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ⇄ ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static ListNode removeDuplicate(ListNode head) {

        if(head == null || head.next == null)
            return head;

        ListNode curr = head;
        while(curr != null && curr.next != null) {
            if(curr.val == curr.next.val) {
                ListNode temp = curr.next;
                curr.next = temp.next;

                if(temp.next != null) {
                    temp.next.prev = curr;
                }
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
