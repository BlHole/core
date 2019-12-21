package com.huaxu.core.leetcode.topic000;

import com.huaxu.core.leetcode.basic.ListNode;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic000.Topic1</p>
 * <p>文件描述: </p>
 * <p>内容摘要:简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明:其它内容的说明</p>
 * <p>创建日期: 2019/05/22 09:38</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic2 {

    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int sumL1 = 0;
            int sumL2 = 0;
            int i = 0;
            while (l1.next != null) {
                sumL1 += l1.next.val * pow(10,i++);
                l1 = l1.next;
            }
            System.out.println(sumL1);

            return null;
        }

        public int pow(int a, int b) {
            if (b==0) return 1;

            int target = a;
            while (--b > 0) {
                a *=target;
            }
            return a;
        }
    }
}