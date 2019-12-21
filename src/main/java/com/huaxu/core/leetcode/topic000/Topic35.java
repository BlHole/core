package com.huaxu.core.leetcode.topic000;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/23 16:36</p>
 * <p>author：huaxu</p>
 */
public class Topic35 {

    public class Solution {

        public int searchInsert(int[] nums, int target) {
            int len = nums.length;
            if (len == 0) return 0;

            int left = 0, right = len;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            return left;
        }
    }
}