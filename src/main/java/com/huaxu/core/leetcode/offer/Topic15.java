package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/22 10:36</p>
 * <p>author：huaxu</p>
 */
public class Topic15 {

    public static void main(String[] args) {
        new Topic15().new Solution().hammingWeight(-12232);
    }

    class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int sum = 0;
            while (n != 0) {
                sum += (n & 1) == 1 ? 1 : 0;
                n = n >>> 1;
            }
            return sum;
        }
    }
}