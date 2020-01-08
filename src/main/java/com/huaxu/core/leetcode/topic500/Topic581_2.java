package com.huaxu.core.leetcode.topic500;

import java.util.Arrays;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/06 09:52</p>
 * <p>author：huaxu</p>
 */
public class Topic581_2 {

    //  [2, 6, 4, 8, 10, 9, 15]
    class Solution {
        public int findUnsortedSubarray(int[] nums) {
            int[] ints = Arrays.copyOf(nums, nums.length);
            Arrays.sort(ints);

            int i = 0, j = nums.length - 1;
            while (i < j && nums[i] == ints[i]) i ++;
            while (j >= i && nums[j] == ints[j]) j --;
            return j - i + 1;
        }
    }
}