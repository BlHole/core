package com.huaxu.core.leetcode.topic400;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/15 14:11</p>
 * <p>author：huaxu</p>
 */
public class Topic461 {

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(3));

        System.out.println(Integer.toBinaryString(1 ^ 3));
        System.out.println(new Solution().hammingDistance(1, 3));
        System.out.println(new Solution().hammingDistance(1, 4));
    }

    static class Solution {
        public int hammingDistance(int x, int y) {
            int count = 0, sum = x ^ y;
            while (sum != 0) {
                sum &= (sum - 1);
                count++;
            }
            return count;
        }
    }
}