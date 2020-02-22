package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/22 18:09</p>
 * <p>author：huaxu</p>
 */
public class Topic42 {

    class Solution {
        public int maxSubArray(int[] nums) {
            if (nums.length == 1) return nums[0];
            int[] dp = new int[nums.length];
            dp[0] = nums[0];
            int max = dp[0];
            for (int i = 1; i < nums.length; i ++) {
                dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
                if (dp[i] > max) max = dp[i];
            }
            return max;
        }
    }
}