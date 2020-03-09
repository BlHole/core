package com.huaxu.core.leetcode.topic300;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/08 17:58</p>
 * <p>author：huaxu</p>
 */
public class Topic322_4 {

    public static void main(String[] args) {
        int i = new Topic322_4().new Solution().coinChange(new int[]{1, 2, 5}, 11);
        System.out.println(i);
    }

    class Solution {

        public int coinChange(int[] coins, int amount) {
            if (amount < 0) return -1;
            return solution(coins, amount, new int[amount + 1]);
        }

        private int solution(int[] coins, int amount, int[] cache) {
            if (amount < 0) return -1;
            if (amount == 0) return 0;
            if (cache[amount] != 0) {
                return cache[amount];
            }
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < coins.length; i++) {
                int res = solution(coins, amount - coins[i], cache);
                if (res != -1) {
                    min = Math.min(min, res + 1);
                }
            }
            cache[amount] = min == Integer.MAX_VALUE ? -1 : min;
            return cache[amount];
        }
    }
}