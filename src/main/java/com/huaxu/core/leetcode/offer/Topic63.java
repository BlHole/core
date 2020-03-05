package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/05 17:40</p>
 * <p>author：huaxu</p>
 */
public class Topic63 {

    class Solution {

        // [7,1,5,3,6,4]

        public int maxProfit(int[] prices) {
            if (prices.length < 2) return 0;

            int index = prices[0], max = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < index) {
                    index = prices[i];
                } else {
                    max = Math.max(prices[i] - index, max);
                }
            }
            return max;
        }
    }
}