package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/03 15:29</p>
 * <p>author：huaxu</p>
 */
public class Topic57 {

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            if (nums.length == 1) return nums;

            int l = 0, r = nums.length - 1;
            while (l < r) {
                if (nums[l] + nums[r] > target) {
                    r --;
                } else if (nums[l] + nums[r] < target) {
                    l ++;
                } else {
                    return new int[]{nums[l], nums[r]};
                }
            }
            return null;
        }
    }
}