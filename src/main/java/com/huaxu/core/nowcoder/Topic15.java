package com.huaxu.core.nowcoder;

import com.huaxu.core.leetcode.basic.ListNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/16 18:26</p>
 * <p>author：huaxu</p>
 *
 * 反转链表
 *
 * 输入一个链表，反转链表后，输出新链表的表头。
 *
 * links: https://www.nowcoder.com/questionTerminal/75e878df47f24fdc9dc3e400ec6058ca
 */
public class Topic15 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        ListNode res = new ListNode(0), temp = res;
        for (int num : nums) {
            temp.next = new ListNode(num);
            temp = temp.next;
        }
        ListNode node = ReverseList(res.next);
        System.out.println(node);
    }

    static public ListNode ReverseList(ListNode head) {
        ListNode res = new ListNode(0);
        while (head != null) {
            ListNode temp = head.next;
            head.next = res.next;
            res.next = head;
            head = temp;
        }
        return res.next;
    }
}