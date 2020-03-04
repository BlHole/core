package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/04 15:36</p>
 * <p>author：huaxu</p>
 */
public class Topic60 {

    class Solution {
        public double[] twoSum(int n) {
            int[][] dp = new int[n + 1][6 * n + 1];
            double[] ans = new double[5 * n + 1];

            double all = Math.pow(6, n);
            for (int i = 1; i <= 6; i++)
                dp[1][i] = 1;

            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= 6 * n; j++) {
                    for (int k = 1; k <= 6; k++) {
                        dp[i][j] += j >= k ? dp[i - 1][j - k] : 0;
                        if (i == n)
                            ans[j - i] = dp[i][j] / all;
                    }
                }
            }
            return ans;
        }
    }
}
/**
 * 1 = 1, 2, 3, 4, 5, 6
 * 2 = 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12
 */