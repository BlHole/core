package com.huaxu.core.nowcoder;

import com.huaxu.core.leetcode.basic.ListNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/29 09:50</p>
 * <p>author：huaxu</p>
 *
 * 链表中环的入口节点
 *
 * 题目描述
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 *
 * links: https://www.nowcoder.com/questionTerminal/253d2c59ec3e4bc68da16833f79a38e4
 */
public class Topic52 {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode slow = pHead, fast = pHead, focus = null;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                focus = slow;
                break;
            }
        }

        if (focus != null) {
            while (pHead != focus) {
                pHead = pHead.next;
                focus = focus.next;
            }
            return pHead;
        }
        return null;
    }
}