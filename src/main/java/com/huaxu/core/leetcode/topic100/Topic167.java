package com.huaxu.core.leetcode.topic100;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/24 18:14</p>
 * <p>author：huaxu</p>
 */
public class Topic167 {

    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int length = numbers.length;
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (numbers[i] + numbers[j] == target) {
                        return new int[]{i + 1, j + 1};
                    }
                }
            }
            return null;
        }
    }
}