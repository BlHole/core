package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/24 14:41</p>
 * <p>author：huaxu</p>
 */
public class Topic46 {

    class Solution {
        public int translateNum(int num) {
            if (num < 10) return 1;
            if (num >= 10 && num < 26) return 2;

            char[] nums = String.valueOf(num).toCharArray();
            int[] dp = new int[nums.length];
            dp[0] = 1;
            dp[1] = check(nums, 0, 1) ? 2 : 1;
            for (int i = 2; i < nums.length; i ++) {
                if (check(nums, i - 1, i)) {
                    dp[i] = dp[i - 1] + dp[i - 2];
                } else {
                    dp[i] = dp[i - 1];
                }
            }
            return dp[nums.length - 1];
        }
    }
    private boolean check(char[] arr, int left, int right) {
        return arr[left] == '1' || (arr[left] == '2' && arr[right] < '6');
    }
}