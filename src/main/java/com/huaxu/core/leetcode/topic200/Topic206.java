package com.huaxu.core.leetcode.topic200;

import com.huaxu.core.leetcode.basic.ListNode;

import java.util.Stack;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic200.Topic206</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/19 18:16</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic206 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(5);
        stack.add(4);
        stack.add(3);
        stack.add(2);
        stack.add(1);
        ListNode node = new Solution().initListNode(stack);


        ListNode node1 = new Solution().reverseList(node);
        while (node1 != null) {
            System.out.println(node1.val);
            node1 = node1.next;
        }
    }

    static class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null) return null;

            Stack<Integer> stack = new Stack<>();
            while (head != null) {
                stack.add(head.val);
                head = head.next;
            }
            return initListNode(stack);
        }

        public ListNode initListNode(Stack<Integer> stack) {
            if (stack.empty()) return null;
            ListNode result = new ListNode(stack.pop());
            result.next = initListNode(stack);
            return result;
        }
    }
}