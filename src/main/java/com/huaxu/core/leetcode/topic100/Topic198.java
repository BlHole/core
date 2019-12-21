package com.huaxu.core.leetcode.topic100;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/11 10:06</p>
 * <p>author：huaxu</p>
 */
public class Topic198 {

    public static void main(String[] args) {
        new Solution().rob(new int[]{2,11,9,3,1});
    }

    static class Solution {
        public int rob(int[] nums) {
            int[] dp = new int[nums.length + 2];
            for (int i = 0; i < nums.length; i++) {
                dp[i + 2] = Math.max(dp[i] + nums[i], dp[i + 1]);
            }
            return dp[nums.length + 1];
        }
    }
}