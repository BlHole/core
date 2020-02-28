package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/28 18:25</p>
 * <p>author：huaxu</p>
 */
public class Topic56_2 {

    class Solution {
        public int singleNumber(int[] nums) {
            int ones = 0, twos = 0;
            for (int n : nums){
                ones = (ones ^ n) & ~twos;
                twos = (twos ^ n) & ~ones;
            }
            return ones;
        }
    }
}