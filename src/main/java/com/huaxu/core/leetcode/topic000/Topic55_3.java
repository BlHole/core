package com.huaxu.core.leetcode.topic000;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/12/26 18:02</p>
 * <p>author：huaxu</p>
 */
public class Topic55_3 {

    class Solution {

        public boolean canJump(int[] nums) {
            int count = 0;
            for (int i = nums.length - 2; i >= 0; i --) {
                count = nums[i] > count ? 0 : count + 1;
            }
            return count == 0;
        }
    }
}