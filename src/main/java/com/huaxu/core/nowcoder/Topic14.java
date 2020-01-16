package com.huaxu.core.nowcoder;

import com.huaxu.core.leetcode.basic.ListNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/16 18:12</p>
 * <p>author：huaxu</p>
 *
 *
 * 链表中倒数第K个节点
 *
 * 输入一个链表，输出该链表中倒数第k个结点。
 *
 * links: https://www.nowcoder.com/questionTerminal/529d3ae5a407492994ad2a246518148a
 */
public class Topic14 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        ListNode res = new ListNode(0), temp = res;
        for (int num : nums) {
            temp.next = new ListNode(num);
            temp = temp.next;
        }
        FindKthToTail(res.next, 5);
    }

    static public ListNode FindKthToTail(ListNode head, int k) {
        ListNode slow = head, fast = head;
        while (k-- > 0 && fast != null) {
            fast = fast.next;
        }
        if (k >= 0 && fast == null) {
            return null;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}