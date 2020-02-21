package com.huaxu.core.leetcode.offer;

import java.util.Stack;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/21 15:27</p>
 * <p>author：huaxu</p>
 */
public class Topic09 {

    class CQueue {

        Stack<Integer> stackA = new Stack<>();
        Stack<Integer> stackB = new Stack<>();

        public CQueue() {
        }

        public void appendTail(int value) {
            stackA.push(value);
        }

        public int deleteHead() {
            if (stackA.isEmpty()) return -1;
            while(!stackA.isEmpty()) {
                stackB.push(stackA.pop());
            }
            int res = stackB.pop();
            while(!stackB.isEmpty()) {
                stackA.push(stackB.pop());
            }
            return res;
        }
    }
}