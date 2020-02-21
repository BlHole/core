package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/21 15:35</p>
 * <p>author：huaxu</p>
 */
public class Topic10_1 {

    class Solution {
        public int fib(int n) {
            if (n == 0) return 0;
            if (n == 1) return 1;

            int a = 0, b = 1;
            for (int i = 2; i <= n ; i ++) {
                int temp = a + b;
                a = b % 1000000007;
                b = temp % 1000000007;
            }
            return b;
        }
    }
}
