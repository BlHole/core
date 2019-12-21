package com.huaxu.core.leetcode.topic100;

import com.huaxu.core.leetcode.basic.ListNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/09/30 11:11</p>
 * <p>author：huaxu</p>
 */
public class Topic148_2 {

    public static void main(String[] args) {
        ListNode l5 = new ListNode(5);
        ListNode l1 = new ListNode(1);
        ListNode l4 = new ListNode(4);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l5.next = l1;
        l1.next = l4;
        l4.next = l2;
        l2.next = l3;

        ListNode node = new Topic148_2.Solution().sortList(l5);
        System.out.println(node);
    }



    static class Solution {
        public ListNode sortList(ListNode head) {
            if (head == null || head.next == null)
                return head;
            ListNode fast = head.next, slow = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode tmp = slow.next;
            slow.next = null;
            ListNode left = sortList(head);
            ListNode right = sortList(tmp);
            ListNode h = new ListNode(0);
            ListNode res = h;
            while (left != null && right != null) {
                if (left.val < right.val) {
                    h.next = left;
                    left = left.next;
                } else {
                    h.next = right;
                    right = right.next;
                }
                h = h.next;
            }
            h.next = left != null ? left : right;
            return res.next;
        }
    }
}