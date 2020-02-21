package com.huaxu.core.leetcode.offer;

import java.util.Stack;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/21 10:54</p>
 * <p>author：huaxu</p>
 */
public class Topic30 {

    // 7 8 2 3 9
    //

    class MinStack {

        private Stack<Integer> stackA = null;
        private int min = Integer.MAX_VALUE;

        public MinStack() {
            stackA = new Stack<>();
        }

        public void push(int x) {
            if (x < min) {
                min = x;
            }
            stackA.push(x);
        }

        public void pop() {
            if (stackA.peek() == min) {
                stackA.pop();
                Stack<Integer> temp = new Stack<>();
                min = Integer.MAX_VALUE;
                while (!stackA.isEmpty()) {
                    if (stackA.peek() < min) {
                        min = stackA.peek();
                    }
                    temp.push(stackA.pop());
                }
                while (!temp.isEmpty()) {
                    stackA.push(temp.pop());
                }
            } else stackA.pop();
        }

        public int top() {
            return stackA.peek();
        }

        public int min() {
            return min;
        }
    }
}