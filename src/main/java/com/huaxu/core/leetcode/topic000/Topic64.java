package com.huaxu.core.leetcode.topic000;

import com.huaxu.core.leetcode.basic.ListNode;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Topic64</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/08/14 22:03</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic64 {

    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if (head == null || k == 0) return head;

            ListNode headBack = head;
            int sum =1;
            while (headBack != null) {
                headBack = headBack.next;
                sum++;
            }
            k = sum - k%sum;
            while (k-- >= 0) {
                head = head.next;
            }
            return null;
        }
    }
}