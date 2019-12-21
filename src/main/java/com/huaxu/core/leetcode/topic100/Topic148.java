package com.huaxu.core.leetcode.topic100;

import com.huaxu.core.leetcode.basic.ListNode;

import java.util.*;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Topic148</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/18 20:40</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic148 {

    public static void main(String[] args) {
        ListNode l5 = new ListNode(5);
        ListNode l1 = new ListNode(1);
        ListNode l4 = new ListNode(4);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l5.next = l1;
        l1.next = l4;
        l4.next = l2;
        l2.next = l3;

        ListNode node = new Solution().sortList(l5);
        System.out.println(node);
    }

    static class Solution {
        public ListNode sortList(ListNode head) {
            List<Integer> numList = new ArrayList<>();
            while (head != null) {
                numList.add(head.val);
                head = head.next;
            }
            Collections.sort(numList);

            head = new ListNode(0);
            ListNode res = head;
            for (Integer num : numList) {
                head.next = new ListNode(num);
                head = head.next;
            }
            return res.next;
        }
    }
}