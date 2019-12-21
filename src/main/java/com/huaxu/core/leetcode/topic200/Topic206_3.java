package com.huaxu.core.leetcode.topic200;
import com.huaxu.core.leetcode.basic.ListNode;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic200.Topic206_3</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/20 11:16</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic206_3 {

    class Solution{
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode p = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return p;
        }
    }
}