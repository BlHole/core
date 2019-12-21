package com.huaxu.core.leetcode.topic100;

import com.huaxu.core.leetcode.basic.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/09/30 14:40</p>
 * <p>author：huaxu</p>
 */
public class Topic142 {

    static class Solution {
        public ListNode detectCycle(ListNode head) {
            Set<ListNode> set = new HashSet<>();
            while (head != null) {
                if (set.contains(head)) {
                    return head;
                }
                set.add(head);
                head = head.next;
            }
            return null;
        }
    }
}