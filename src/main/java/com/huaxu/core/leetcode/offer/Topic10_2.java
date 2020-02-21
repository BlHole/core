package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/21 15:54</p>
 * <p>author：huaxu</p>
 */
public class Topic10_2 {

    class Solution {
        public int numWays(int n) {
            if (n == 0) return 1;
            if (n < 4) return n;

            int a = 2, b = 3;
            for (int i = 4; i <= n; i ++) {
                int temp = a + b;
                a = b % 1000000007;
                b = temp % 1000000007;
            }
            return b;
        }
    }
}