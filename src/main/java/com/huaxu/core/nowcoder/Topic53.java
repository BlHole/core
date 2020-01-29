package com.huaxu.core.nowcoder;

import com.huaxu.core.leetcode.basic.ListNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/29 10:19</p>
 * <p>author：huaxu</p>
 *
 * 删除链表中重复的节点
 *
 * 题目描述
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 *
 * links: https://www.nowcoder.com/questionTerminal/fc533c45b73a41b0b44ccba763f866ef
 */
public class Topic53 {

    public ListNode deleteDuplication(ListNode pHead) {
        ListNode res = new ListNode(0);
        res.next = pHead;

        ListNode prev = res, curr = null, index = res;
        while (prev.next != null) {
            index = prev;
            prev = prev.next;
            curr = prev.next;

            while (curr != null) {
                if (prev.val == curr.val) {
                    curr = curr.next;
                } else {
                    break;
                }
            }
            if (prev.next != curr) {
                index.next = curr;
                prev = index;
            }
        }
        return res.next;
    }
}