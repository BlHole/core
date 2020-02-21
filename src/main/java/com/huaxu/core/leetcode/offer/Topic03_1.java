package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/21 11:55</p>
 * <p>author：huaxu</p>
 */
public class Topic03_1 {

    public int findRepeatNumber(int[] nums) {
        int hash = 0;
        for (int num : nums) {
            if (((hash >> num) & 1) == 1) {
                return num;
            }
            hash ^= (1 << num);
        }
        throw new IllegalArgumentException("数组中没有重复的数字");
    }
}