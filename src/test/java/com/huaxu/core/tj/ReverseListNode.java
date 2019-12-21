package com.huaxu.core.tj;

import com.huaxu.core.leetcode.basic.ListNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/11/13 12:41</p>
 * <p>author：huaxu</p>
 */
public class ReverseListNode {

    public static void main(String[] args) {
        ListNode node = new ListNode(-1);
        ListNode head = node;
        int[] a = new int[]{1,2,3,4,5,6,7};
        for (int i : a) {
            node.next = new ListNode(i);
            node = node.next;
        }
        ListNode partition = new ReverseListNode().reverseList(head.next);
        while (partition != null) {
            System.out.print(partition.val + " ");
            partition = partition.next;
        }
    }

    public ListNode reverse(ListNode node) {
        if (node == null || node.next == null) return node;
        ListNode head = node, next = node.next;
        head.next = null;
        while (next.next != null) {
            ListNode nextNext = next.next;
            next.next = head;
            head = next;
            next = nextNext;
        }
        next.next = head;
        return next;
    }

    public ListNode reverseList(ListNode head) {
        ListNode root = new ListNode(0);
        while (head != null) {
            ListNode headNext = head.next;
            head.next = root.next;
            root.next = head;
            head = headNext;
        }
        return root.next;
    }
}