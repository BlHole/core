package com.huaxu.core.leetcode.topic300;

import java.util.Arrays;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/08 17:33</p>
 * <p>author：huaxu</p>
 */
public class Topic322_3 {

    public static void main(String[] args) {
        int i = new Topic322_3().new Solution().coinChange(new int[]{1, 2, 5}, 13);
        System.out.println(i);
    }

    class Solution {
        public int coinChange(int[] coins, int amount) {
            if (amount < 0) return -1;

            int[] dp = new int[amount + 1];
            Arrays.fill(dp, amount + 1);
            dp[0] = 0;
            for (int i = 1; i <= amount; i++) {
                for (int j = 0; j < coins.length; j++) {
                    if (i >= coins[j]) {
                        dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                    }
                }
            }
            return dp[amount] > amount ? -1 : dp[amount];
        }
    }
}