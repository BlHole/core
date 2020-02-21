package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/21 20:18</p>
 * <p>author：huaxu</p>
 */
public class Topic14 {

    class Solution {
        public int cuttingRope(int n) {
            int h = n < 7 ? 7 : n + 1;
            int[] dp = new int[h];
            dp[2] = 1;
            dp[3] = 2;
            dp[4] = 4;
            dp[5] = 6;
            dp[6] = 9;
            for (int i = 7; i <= n; i ++) {
                dp[i] = Math.max(dp[i - 2] * 2, dp[i - 3] * 3);
            }
            return dp[n];
        }
    }
}