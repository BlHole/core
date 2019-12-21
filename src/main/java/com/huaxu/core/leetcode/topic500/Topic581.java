package com.huaxu.core.leetcode.topic500;

import java.util.Arrays;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/19 13:14</p>
 * <p>author：huaxu</p>
 */
public class Topic581 {

    static class Solution {
        public int findUnsortedSubarray(int[] nums) {
            int[] numArrs = nums.clone();
            Arrays.sort(numArrs);
            int start = numArrs.length, end = 0;
            for (int i = 0; i < numArrs.length; i++) {
                if (numArrs[i] != nums[i]) {
                    start = Math.min(start, i);
                    end = Math.max(end, i);
                }
            }
            return (end - start >= 0 ? end - start + 1 : 0);
        }
    }
}