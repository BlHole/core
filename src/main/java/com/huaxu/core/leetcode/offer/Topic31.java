package com.huaxu.core.leetcode.offer;

import java.util.Stack;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/22 17:04</p>
 * <p>author：huaxu</p>
 */
public class Topic31 {

    class Solution {
        public boolean validateStackSequences(int[] pushed, int[] popped) {

            Stack<Integer> stack = new Stack<>();
            int i = 0, k = 0;
            while (i < popped.length) {
                if (!stack.isEmpty() && popped[i] == stack.peek()) {
                    stack.pop();
                    i ++;
                } else {
                    if (k < pushed.length) {
                        stack.push(pushed[k ++]);
                    } else return false;
                }
            }
            return stack.isEmpty();
        }
    }
}