package com.huaxu.core.nowcoder;

import java.util.Stack;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/16 15:17</p>
 * <p>author：huaxu</p>
 *
 * 用两个栈实现队列
 *
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 *
 * links: https://www.nowcoder.com/questionTerminal/54275ddae22f475981afa2244dd448c6
 */
public class Topic05 {

    class Solution {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        public void push(int node) {
            stack1.push(node);
        }

        public int pop() {
            while (!stack1.isEmpty()) {
                stack2.add(stack1.pop());
            }
            int res = stack2.pop();
            while (!stack2.isEmpty()) {
                stack1.add(stack2.pop());
            }
            return res;
        }
    }
}