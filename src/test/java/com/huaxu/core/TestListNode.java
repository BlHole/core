package com.huaxu.core;

import com.huaxu.core.leetcode.basic.ListNode;

public class TestListNode {

    public static void main(String[] args) {
        ListNode node = new ListNode(-1);
        ListNode head = node;
        int[] a = new int[]{2,1,3,5,6,4,7};
        for (int i : a) {
            node.next = new ListNode(i);
            node = node.next;
        }
        ListNode partition = new TestListNode().reverse(head.next);
        while (partition != null) {
            System.out.print(partition.val + " ");
            partition = partition.next;
        }
    }

    private ListNode reverse(ListNode node) {
        ListNode root = new ListNode(0);
        while (node != null) {
            ListNode nodeNext = node.next;
            node.next = root.next;
            root.next = node;
            node = nodeNext;
        }
        return root.next;
    }
}
