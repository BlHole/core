package com.huaxu.core.nowcoder;

import com.huaxu.core.leetcode.basic.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/16 14:33</p>
 * <p>author：huaxu</p>
 *
 * 从头到尾打印链表
 *
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 *
 * links： https://www.nowcoder.com/questionTerminal/d0267f7f55b3412ba93bd35cfa8e8035
 */
public class Topic03 {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        LinkedList<Integer> list = new LinkedList<>();
        while (listNode != null) {
            list.addFirst(listNode.val);
            listNode = listNode.next;
        }
        return new ArrayList<>(list);
    }
}