package com.huaxu.core.leetcode.topic300;

import java.util.Arrays;
import java.util.HashMap;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/08 16:26</p>
 * <p>author：huaxu</p>
 */
public class Topic322 {

    public static void main(String[] args) {
        int i = new Topic322().new Solution().coinChange(new int[]{58,92,387,421,194,208,231}, 7798);
        System.out.println(i);
    }

    class Solution {

        public int coinChange(int[] coins, int amount) {
            if (coins.length == 0) return -1;
            Arrays.sort(coins);
            return solution(coins, coins.length - 1, amount, new HashMap());
        }

        private int solution(int[] coins, int k, int amount, HashMap<String, Integer> cache) {
            if (amount == 0) return 0;
            if (k < 0) return -1;
            int maxVal = amount / coins[k];
            int ant = Integer.MAX_VALUE;
            for (int i = maxVal; i >= 0; i --) {
                Integer integer = cache.get((k - 1) + " " + (amount - i * coins[k]));
                if (integer == null) {
                    integer = solution(coins, k - 1, amount - i * coins[k], cache);
                    cache.put((k - 1) + " " + (amount - i * coins[k]), integer);
                }
                if (integer != -1) {
                    ant = Math.min(ant, integer + i);
                }
            }
            return ant == Integer.MAX_VALUE ? -1 : ant;
        }
    }
}