package com.huaxu.core.leetcode.offer;

import com.huaxu.core.leetcode.basic.ListNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/21 15:13</p>
 * <p>author：huaxu</p>
 */
public class Topic06 {

    class Solution {
        public int[] reversePrint(ListNode head) {
            ListNode node = new ListNode(0);
            int N = 0;
            while (head != null) {
                ListNode temp = head.next;
                head.next = node.next;
                node.next = head;
                head = temp;
                N ++;
            }
            int[] res = new int[N];
            N = 0;
            while (node.next != null) {
                res[N ++] = node.next.val;
                node = node.next;
            }
            return res;
        }
    }
}