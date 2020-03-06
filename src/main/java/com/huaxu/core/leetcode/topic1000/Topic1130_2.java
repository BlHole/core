package com.huaxu.core.leetcode.topic1000;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/05 23:03</p>
 * <p>author：huaxu</p>
 */
public class Topic1130_2 {

    class Solution {
        public int[] distributeCandies(int candies, int num_people) {

            int[] res = new int[num_people];
            int i = 0;
            while (candies != 0) {
                res[i % num_people] += Math.min(candies, i + 1);
                candies -= Math.min(candies, i + 1);
                i ++;
            }
            return res;
        }
    }
}