package com.huaxu.core.leetcode.offer;

import com.huaxu.core.leetcode.basic.ListNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/22 11:08</p>
 * <p>author：huaxu</p>
 */
public class Topic18 {

    class Solution {
        public ListNode deleteNode(ListNode head, int val) {
            ListNode res = new ListNode(0);
            res.next = head;
            ListNode zz = res;

            while (res != null && res.next != null) {
                if (res.next.val == val) {
                    res.next = res.next.next;
                }
                res = res.next;
            }
            return zz.next;
        }
    }
}