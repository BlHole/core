package com.huaxu.core.leetcode.topic000;

import com.huaxu.core.leetcode.basic.ListNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/07 11:09</p>
 * <p>author：huaxu</p>
 */
public class Topic25 {

    public static void main(String[] args) {

        ListNode node = new ListNode(-1);
        ListNode head = node;
        int[] a = new int[]{2};
        for (int i : a) {
            node.next = new ListNode(i);
            node = node.next;
        }

        ListNode partition = new Topic25().reverseKGroup(head.next, 4);
        while (partition != null) {
            System.out.print(partition.val + " ");
            partition = partition.next;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) return head;
        ListNode res = new ListNode(0);
        ListNode slow = head, fast = head, index = res;
        int i = 1;
        while (fast != null) {
            ListNode temp = fast.next;
            if (i ++ % k == 0) {
                fast.next = null;
                ListNode zou = slow;
                while (slow != null) {
                    ListNode itme = slow.next;
                    slow.next = index.next;
                    index.next = slow;
                    slow = itme;
                }
                index = zou;
                slow = temp;
            }
            fast = temp;
        }
        index.next = slow;
        return res.next;
    }
}