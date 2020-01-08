package com.huaxu.core.leetcode.topic300;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/05 16:07</p>
 * <p>author：huaxu</p>
 */
public class Topic300 {

    class Solution {
        public int lengthOfLIS(int[] nums) {
            int i, j, max = 0, n = nums.length;
            int[] dp = new int[n];

            for (i = 0; i < n; i++) {
                dp[i] = 1;
            }
            for (i = 0; i < n; i++) {
                for (j = 0; j < i; j++) {
                    if (nums[j] < nums[i] && dp[i] < dp[j] + 1) {
                        dp[i] = dp[j] + 1;
                    }
                }
                max = Math.max(max, dp[i]);
            }
            return max;
        }
    }
}