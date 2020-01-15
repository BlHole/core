package com.huaxu.core.leetcode.topic000;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/15 11:50</p>
 * <p>author：huaxu</p>
 */
public class Topic34 {

    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int left = 0, right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    int resL = mid, resR = mid;
                    while (resL > left && nums[resL - 1] == target) resL--;
                    while (resR < right && nums[resR + 1] == target) resR++;
                    return new int[]{resL, resR};
                }
                if (nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return new int[]{-1, -1};
        }
    }
}