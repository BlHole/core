package com.huaxu.core.leetcode.topic100;

import com.huaxu.core.leetcode.basic.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic100.Topic160</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/29 22:33</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic160 {

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            Set<ListNode> set = new HashSet<>();
            while (headA != null) {
                set.add(headA);
                headA = headA.next;
            }
            while (headB != null) {
                if (set.contains(headB)) {
                    return headB;
                }
                headB = headB.next;
            }
            return null;
        }
    }
}