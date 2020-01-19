package com.huaxu.core.nowcoder;

import com.huaxu.core.leetcode.basic.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/19 16:54</p>
 * <p>author：huaxu</p>
 *
 * 两个链表的第一个公共节点
 *
 * 输入两个链表，找出它们的第一个公共结点。
 *
 * links: https://www.nowcoder.com/questionTerminal/6ab1d9a29e88450685099d45c9e31e46
 */
public class Topic34 {

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) return null;

        Set<ListNode> set = new HashSet<>();
        while (pHead1 != null) {
            set.add(pHead1);
            pHead1 = pHead1.next;
        }
        while (pHead2 != null) {
            if (set.contains(pHead2)) {
                return pHead2;
            }
            pHead2 = pHead2.next;
        }
        return null;
    }
}