package com.huaxu.core.leetcode.topic1000;

import com.huaxu.core.leetcode.basic.ListNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/03 21:00</p>
 * <p>author：huaxu</p>
 */
public class Topic1290 {

    class Solution {
        public int getDecimalValue(ListNode head) {
            int sum = 0;
            StringBuilder sb = new StringBuilder("0");
            while (head != null) {
                sum += head.val;
                if (sum != 0) {
                    sb.append(head.val);
                }
                head = head.next;
            }
            return Integer.valueOf(sb.toString(), 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(Integer.valueOf("101", 2));
    }
}