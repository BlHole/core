package com.huaxu.core.leetcode.topic100;

import com.huaxu.core.leetcode.basic.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic100.Topic141</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/29 00:33</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic141 {

    public class Solution {
        public boolean hasCycle(ListNode head) {
            Set<ListNode> set = new HashSet<>();
            while (head != null) {
                if (set.contains(head)) {
                    return true;
                }
                set.add(head);
                head = head.next;
            }
            return false;
        }
    }
}