package com.huaxu.core.leetcode.topic200;

import com.huaxu.core.leetcode.basic.ListNode;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: Topic208_2</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/19 21:03</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic206_2 {

    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;
            while (curr != null) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            return prev;
        }
    }
}