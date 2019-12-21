package com.huaxu.core.leetcode.topic200;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/29 18:03</p>
 * <p>author：huaxu</p>
 */
public class Topic202 {

    class Solution {
        public boolean isHappy(int n) {
            int fast = n;
            int slow = n;
            do {
                slow = squareSum(slow);
                fast = squareSum(fast);
                fast = squareSum(fast);
            } while (slow != fast);
            return fast == 1 ? true : false;
        }

        private int squareSum(int m) {
            int squaresum = 0;
            while (m != 0) {
                squaresum += (m%10) * (m%10);
                m /= 10;
            }
            return squaresum;
        }
    }
}