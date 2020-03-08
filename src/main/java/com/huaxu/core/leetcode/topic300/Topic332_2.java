package com.huaxu.core.leetcode.topic300;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/08 17:09</p>
 * <p>author：huaxu</p>
 */
public class Topic332_2 {


    public static void main(String[] args) {
        int i = new Topic332_2().new Solution().coinChange(new int[]{2, 5}, 14);
        System.out.println(i);
    }

    class Solution {

        public int coinChange(int[] coins, int amount) {
            if (amount < 1) return 0;
            return coinChange(coins, amount, new int[amount]);
        }

        private int coinChange(int[] coins, int rem, int[] count) {
            if (rem < 0) return -1;
            if (rem == 0) return 0;

            if (count[rem - 1] != 0) {// result
                return count[rem - 1];
            }

            int min = Integer.MAX_VALUE;
            for (int coin : coins) {
                int res = coinChange(coins, rem - coin, count);
                if (res >= 0 && res < min)
                    min = 1 + res;
            }
            count[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
            return count[rem - 1];
        }
    }
}