package com.huaxu.core.leetcode.type.listNode;

import com.huaxu.core.leetcode.basic.ListNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/04 09:45</p>
 * <p>author：huaxu</p>
 */
public class ListNodePractice {

    public static void main(String[] args) {
        ListNode node = new ListNode(-1);
        ListNode head = node;
        int[] a = new int[]{2,1,3,5,6,4,7};
        for (int i : a) {
            node.next = new ListNode(i);
            node = node.next;
        }
        ListNode partition = reverseList(head.next);
        while (partition != null) {
            System.out.print(partition.val + " ");
            partition = partition.next;
        }
    }

    private static ListNode reverseList(ListNode node) {
        ListNode res = new ListNode(0);
        while (node != null) {
            ListNode temp = node.next;
            node.next = res.next;
            res.next = node;
            node = temp;
        }
        return res.next;
    }
}