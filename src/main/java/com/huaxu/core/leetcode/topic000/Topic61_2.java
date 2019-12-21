package com.huaxu.core.leetcode.topic000;

import com.huaxu.core.leetcode.basic.ListNode;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Topic61</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/09/29 13:58</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic61_2 {

    static class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            // base cases
            if (head == null) return null;
            if (head.next == null) return head;

            // close the linked list into the ring
            ListNode old_tail = head;
            int n;
            for(n = 1; old_tail.next != null; n++)
                old_tail = old_tail.next;
            old_tail.next = head;

            // find new tail : (n - k % n - 1)th node
            // and new head : (n - k % n)th node
            ListNode new_tail = head;
            for (int i = 0; i < n - k % n - 1; i++)
                new_tail = new_tail.next;
            ListNode new_head = new_tail.next;

            // break the ring
            new_tail.next = null;

            return new_head;
        }
    }
}